package projecct.text;

import java.lang.reflect.Method;
import java.util.Date;

public class AnnotationsRunner {
	
	public static void main(String[] args) throws Exception {
        System.out.println("执行自定义注解开始时间："+new Date());
        Class clazz = Test.class;
        System.out.println("类名称: " + clazz.getName());
        Method[] ms = clazz.getMethods();
        for (Method method : ms) {
        	System.out.println("方法名: " + method);
            boolean flag = method.isAnnotationPresent(Annotations.class);
            if (flag) {
                method.invoke(clazz.newInstance(), null);
            }
        }
    }

}
