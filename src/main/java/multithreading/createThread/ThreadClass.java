package multithreading.createThread;

public class ThreadClass extends Thread{

    /**
     * 接口空返回
     */
    @Override
    public void run() {
        super.run();
        System.out.println("创建线程方法1继承Thread类");
    }
}
