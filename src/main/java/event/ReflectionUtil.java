package event;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import util.DateUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.text.ParseException;
import java.util.*;

@Slf4j
public class ReflectionUtil {


    private ReflectionUtil() {
    }

    public static Object invokeGetterMethod(Object target, String propertyName) {
        String getterMethodName = "get" + StringUtils.capitalize(propertyName);
        return invokeMethod(target, getterMethodName, new Class[0], new Object[0]);
    }

    public static void invokeSetterMethod(Object target, String propertyName, Object value) {
        invokeSetterMethod(target, propertyName, value, (Class)null);
    }

    public static void invokeSetterMethod(Object target, String propertyName, Object value, Class<?> propertyType) {
        Class<?> type = propertyType != null ? propertyType : value.getClass();
        String setterMethodName = "set" + StringUtils.capitalize(propertyName);
        invokeMethod(target, setterMethodName, new Class[]{type}, new Object[]{value});
    }

    public static Object getFieldValue(Object object, String fieldName) {
        Field field = getDeclaredField(object, fieldName);
        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
        } else {
            makeAccessible(field);
            Object result = null;

            try {
                result = field.get(object);
            } catch (IllegalAccessException var5) {
                log.error("不可能抛出的异常{}" + var5.getMessage());

            }

            return result;
        }
    }

    public static void setFieldValue(Object object, String fieldName, Object value) {
        Field field = getDeclaredField(object, fieldName);
        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
        } else {
            makeAccessible(field);

            try {
                field.set(object, value);
            } catch (IllegalAccessException var5) {

                log.error("不可能抛出的异常:{}" + var5.getMessage());
            }

        }
    }

    public static Object invokeMethod(Object object, String methodName, Object[] parameters) {
        Class[] parameterTypes = ClassUtils.toClass(parameters);
        return invokeMethod(object, methodName, parameterTypes, parameters);
    }

    public static Object invokeMethod(Object object, String methodName, Class<?>[] parameterTypes, Object[] parameters) {
        Method method = getDeclaredMethod(object, methodName, parameterTypes);
        if (method == null) {
            throw new IllegalArgumentException("Could not find method [" + methodName + "] parameterType " + parameterTypes + " on target [" + object + "]");
        } else {
            method.setAccessible(true);

            try {
                return method.invoke(object, parameters);
            } catch (Exception var6) {
                throw convertReflectionExceptionToUnchecked(var6);
            }
        }
    }

    protected static Field getDeclaredField(Object object, String fieldName) {
        Assert.notNull(object, "object不能为空");
        Assert.hasText(fieldName, "fieldName");
        Class superClass = object.getClass();

        while(superClass != Object.class) {
            try {
                return superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException var4) {
                superClass = superClass.getSuperclass();
            }
        }

        return null;
    }

    public static <T extends Annotation> T getAnnotation(Object object, String fieldName, Class<T> annotationClass) {
        return getDeclaredField(object, fieldName).getAnnotation(annotationClass);
    }

    protected static void makeAccessible(Field field) {
        if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
            field.setAccessible(true);
        }

    }

    protected static Method getDeclaredMethod(Object object, String methodName, Class<?>[] parameterTypes) {
        Assert.notNull(object, "object不能为空");
        Class superClass = object.getClass();

        while(superClass != Object.class) {
            try {
                return superClass.getDeclaredMethod(methodName, parameterTypes);
            } catch (NoSuchMethodException var5) {
                superClass = superClass.getSuperclass();
            }
        }

        return null;
    }

    public static <T> Class<T> getSuperClassGenricType(Class<?> clazz) {
        return getSuperClassGenricType(clazz, 0);
    }

    public static Class getSuperClassGenricType(Class<?> clazz, int index) {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            log.warn(clazz.getSimpleName() + "'s superclass not ParameterizedType");
            return Object.class;
        } else {
            Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
            if (index < params.length && index >= 0) {
                if (!(params[index] instanceof Class)) {
                    log.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
                    return Object.class;
                } else {
                    return (Class)params[index];
                }
            } else {
                log.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: " + params.length);
                return Object.class;
            }
        }
    }

    public static List convertElementPropertyToList(Collection collection, String propertyName) {
        ArrayList list = new ArrayList();

        try {
            Iterator var3 = collection.iterator();

            while(var3.hasNext()) {
                Object obj = var3.next();
                list.add(PropertyUtils.getProperty(obj, propertyName));
            }

            return list;
        } catch (Exception var5) {
            throw convertReflectionExceptionToUnchecked(var5);
        }
    }

    public static String convertElementPropertyToString(Collection collection, String propertyName, String separator) {
        List list = convertElementPropertyToList(collection, propertyName);
        return StringUtils.join(list, separator);
    }

    public static <T> T convertStringToObject(String value, Class<T> toType) {
        try {
            return (T) ConvertUtils.convert(value, toType);
        } catch (Exception var3) {
            throw convertReflectionExceptionToUnchecked(var3);
        }
    }

    public static RuntimeException convertReflectionExceptionToUnchecked(Exception e) {
        return convertReflectionExceptionToUnchecked((String)null, e);
    }

    public static RuntimeException convertReflectionExceptionToUnchecked(String desc, Exception e) {
        desc = desc == null ? "Unexpected Checked Exception." : desc;
        if (!(e instanceof IllegalAccessException) && !(e instanceof IllegalArgumentException) && !(e instanceof NoSuchMethodException)) {
            if (e instanceof InvocationTargetException) {
                return new RuntimeException(desc, ((InvocationTargetException)e).getTargetException());
            } else {
                return e instanceof RuntimeException ? (RuntimeException)e : new RuntimeException(desc, e);
            }
        } else {
            return new IllegalArgumentException(desc, e);
        }
    }

    public static final <T> T getNewInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException var2) {
            var2.printStackTrace();
        } catch (IllegalAccessException var3) {
            var3.printStackTrace();
        }

        return null;
    }

    public static void copyPorperties(Object dest, Object source, String[] porperties) throws InvocationTargetException, IllegalAccessException {
        String[] var3 = porperties;
        int var4 = porperties.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String por = var3[var5];
            Object srcObj = invokeGetterMethod(source, por);
            log.debug("属性名：" + por + "------------- 属性值：" + srcObj);
            if (srcObj != null) {
                try {
                    BeanUtils.setProperty(dest, por, srcObj);
                } catch (IllegalArgumentException var9) {
                    var9.printStackTrace();
                } catch (IllegalAccessException var10) {
                    throw var10;
                } catch (InvocationTargetException var11) {
                    throw var11;
                }
            }
        }

    }

    public static void copyPorperties(Object dest, Object source) throws IllegalAccessException, InvocationTargetException {
        Class<? extends Object> srcCla = source.getClass();
        Field[] fsF = srcCla.getDeclaredFields();
        Field[] var4 = fsF;
        int var5 = fsF.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Field s = var4[var6];
            String name = s.getName();
            Object srcObj = invokeGetterMethod(source, name);

            try {
                BeanUtils.setProperty(dest, name, srcObj);
            } catch (IllegalArgumentException var11) {
                var11.printStackTrace();
            } catch (IllegalAccessException var12) {
                throw var12;
            } catch (InvocationTargetException var13) {
                throw var13;
            }
        }

    }

    public static Map<String, Object> getDeclareedFieldAndValues(Object beanInstance) {
        Field[] fields = beanInstance.getClass().getDeclaredFields();
        Map<String, Object> map = new HashMap();
        Field[] var3 = fields;
        int var4 = fields.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Field f = var3[var5];

            try {
                f.setAccessible(true);
                map.put(f.getName(), f.get(beanInstance));
            } catch (IllegalAccessException var8) {
                log.error("get field name fail, class:" + beanInstance.getClass() + ",beanInstance:" + beanInstance + ",fieldName:" + f.getName(), var8);
            }
        }

        return map;
    }

    public static List<String> getDeclareedFieldNameList(Object beanInstance) {
        Field[] fields = beanInstance.getClass().getDeclaredFields();
        List<String> list = new ArrayList();
        Field[] var3 = fields;
        int var4 = fields.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Field f = var3[var5];

            try {
                f.setAccessible(true);
                list.add(f.getName());
            } catch (Exception var8) {
                log.error("get field name fail, class:" + beanInstance.getClass() + ",beanInstance:" + beanInstance + ",fieldName:" + f.getName(), var8);
            }
        }

        return list;
    }

    public static Boolean isAllValueNull(Object beanInstance, String... execludeField) {
        Map<String, Object> fieldAndValues = getDeclareedFieldAndValues(beanInstance);
        boolean isNull = true;
        Iterator var4 = fieldAndValues.entrySet().iterator();

        Map.Entry entry;
        boolean isExclude;
        do {
            if (!var4.hasNext()) {
                return isNull;
            }

            entry = (Map.Entry)var4.next();
            isExclude = false;
            String[] var7 = execludeField;
            int var8 = execludeField.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                String f = var7[var9];
                if (f.equals(entry.getKey())) {
                    isExclude = true;
                }
            }
        } while(isExclude || null == entry.getValue());

        isNull = false;
        return isNull;
    }

    public static Boolean isAllValueNull(Object beanInstance) {
        return isAllValueNull(beanInstance);
    }

    public static Object setDeclareedFieldAndValues(Object object, String fieldName, String fieldValue) {
        try {
            Field[] field = object.getClass().getDeclaredFields();

            for(int j = 0; j < field.length; ++j) {
                String name = field[j].getName();
                if (fieldName.equals(name)) {
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                    String type = field[j].getGenericType().toString();
                    Method m;
                    if (type.equals("class java.lang.String")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, String.class);
                        m.invoke(object, fieldValue);
                    }

                    if (type.equals("class java.lang.Long")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, Long.class);
                        m.invoke(object, Long.parseLong(fieldValue));
                    }

                    if (type.equals("class java.lang.Integer")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, Integer.class);
                        m.invoke(object, Integer.parseInt(fieldValue));
                    }

                    if (type.equals("class java.lang.Byte")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, Byte.class);
                        m.invoke(object, Byte.parseByte(fieldValue));
                    }

                    if (type.equals("class java.lang.Boolean")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, Boolean.class);
                        if (fieldValue.equals("true")) {
                            m.invoke(object, true);
                        } else {
                            m.invoke(object, false);
                        }
                    }

                    if (type.equals("class java.util.Date")) {
                        m = object.getClass().getMethod("get" + name);
                        m = object.getClass().getMethod("set" + name, Date.class);
                        if (fieldValue.length() == 19) {
                            m.invoke(object, DateUtil.getString2Date(fieldValue, "yyyy-MM-dd HH:mm:ss"));
                        }

                        if (fieldValue.length() == 10) {
                            m.invoke(object, DateUtil.getString2Date(fieldValue, "yyyy-MM-dd"));
                        }
                    }
                }
            }
        } catch (NoSuchMethodException var8) {
            var8.printStackTrace();
        } catch (ParseException var9) {
            var9.printStackTrace();
        } catch (IllegalAccessException var10) {
            var10.printStackTrace();
        } catch (IllegalArgumentException var11) {
            var11.printStackTrace();
        } catch (InvocationTargetException var12) {
            var12.printStackTrace();
        }

        return object;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    }

    static {
        DateLocaleConverter dc = new DateLocaleConverter();
        ConvertUtils.register(dc, Date.class);
    }
}
