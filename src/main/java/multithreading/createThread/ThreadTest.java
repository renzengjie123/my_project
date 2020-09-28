package multithreading.createThread;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) throws Exception {

        //1、创建线程方法1继承Thread类
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        //2、创建线程方法2实现Runnable接口
        RunnableClass runnableClass = new RunnableClass();
        new Thread(runnableClass).start();
        //3、创建线程方法3实现Callable接口
        CallableClass callableClass = new CallableClass();
        callableClass.call();
        //4、Future 创建
        FutureTask<Object> futureTask = new FutureTask<Object>(callableClass);
        new Thread(futureTask).start();
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        //线程池执行线程
        executorService.execute(runnableClass);

    }
}
