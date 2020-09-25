package event;

import java.util.Arrays;

public class CommonEvent {

    private Object[] args;
    private Object targetObject;
    private String targetMethod;
    private Class<?>[] parameterTypes;

    public CommonEvent(Object targetObject, String targetMethod, Object[] args) {
        this.targetObject = targetObject;
        this.targetMethod = targetMethod;
        this.args = args;
    }

    public CommonEvent(Object targetObject, String targetMethod, Object[] args, Class<?>[] parameterTypes) {
        this.targetObject = targetObject;
        this.targetMethod = targetMethod;
        this.args = args;
        this.parameterTypes = parameterTypes;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public String getTargetMethod() {
        return targetMethod;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    @Override
    public String toString() {
        return "CommonEvent{" +
                "args=" + Arrays.toString(args) +
                ", targetObject=" + targetObject +
                ", targetMethod='" + targetMethod + '\'' +
                ", parameterTypes=" + Arrays.toString(parameterTypes) +
                '}';
    }
}
