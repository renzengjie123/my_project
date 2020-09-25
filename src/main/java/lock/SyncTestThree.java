package lock;

public class SyncTestThree implements Runnable {
    //共享资源变量
    static int count = 0;

    public synchronized void run() {
        increaseCount();
    }

    private synchronized static void increaseCount() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + count++);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	//同样是new了两个不同实例，却保持了线程同步。那是我们synchronizd修饰的是静态方法，run方法中调用这个静态方法，
    	//再说一次 静态方法不属于当前实例，而是属于类。所以这个方案其实是用的一个把锁，而这个锁就是这个类的class对象锁
    	
        //需要注意的是如果一个线程A调用一个实例对象的非static synchronized方法，而线程B需要调用这个实例对象所属类的静态
    	//synchronized方法，是允许的，不会发生互斥现象，因为访问静态 synchronized 方法占用的锁是当前类的class对象，
    	//而访问非静态 synchronized 方法占用的锁是当前实例对象锁(结合demo2，demo3)


    	long start = System.currentTimeMillis();
    	SyncTestThree syncTest1 = new SyncTestThree();
    	SyncTestThree syncTest2 = new SyncTestThree();
        Thread thread1 = new Thread(syncTest1, "thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    /**
     * 输出结果
     thread1:0
     thread1:1
     thread1:2
     thread1:3
     thread1:4
     thread2:5
     thread2:6
     thread2:7
     thread2:8
     thread2:9
     */
}
