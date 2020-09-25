package lock;

public class SyncTest implements Runnable{

	//共享资源变量
    int count = 0;

    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            //increaseCount();
            System.out.println(Thread.currentThread().getName()+":"+count++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	//代码中开启了两个线程去操作一个变量（共享变量）
        SyncTest syncTest1 = new SyncTest();
//        SyncTest syncTest2 = new SyncTest();
        Thread thread1 = new Thread(syncTest1,"thread1");
        Thread thread2 = new Thread(syncTest1, "thread2");
        thread1.start();
        thread2.start();
    }

}
