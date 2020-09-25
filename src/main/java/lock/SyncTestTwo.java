package lock;

public class SyncTestTwo implements Runnable{
    //共享资源变量
    static int count = 0;
    //int count = 0;

    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+count++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	//上述操作中虽然我们的run方法还是使用synchronized修饰，但是我们new了两个实例。这就意味存在了两个不同的实例锁，
    	//thread1和thread2分别进入了syncTest1和syncTest2的实例锁，当然保证不了线程安全
        long start = System.currentTimeMillis();
    	SyncTestTwo syncTest1 = new SyncTestTwo();
    	SyncTestTwo syncTest2 = new SyncTestTwo();
        Thread thread1 = new Thread(syncTest1,"thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
}
