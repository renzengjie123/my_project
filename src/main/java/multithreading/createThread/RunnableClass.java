package multithreading.createThread;

public class RunnableClass implements Runnable{

    /**
     * 接口空返回
     */
    @Override
    public void run() {
        System.out.println("创建线程方法2实现Runnable接口");
    }
}
