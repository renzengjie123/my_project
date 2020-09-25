package test.sortNum;

public class SingleTonClass {

    //饿汉模式
    /*private final static SingleTonClass singleTonClass = new SingleTonClass();

    private SingleTonClass(){

    }

    public static SingleTonClass getInstance(){
        return singleTonClass;
    }*/

    //懒汉模式
    private static SingleTonClass singleTonClass = null;
    private SingleTonClass(){

    }
    public static SingleTonClass getInstance(){
        if(null == singleTonClass){
            synchronized (SingleTonClass.class){
                if(null == singleTonClass){
                    singleTonClass = new SingleTonClass();
                }
            }
        }
        return singleTonClass;
    }
}
