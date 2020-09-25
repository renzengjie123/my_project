package test.oneNum;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OneNumTest {

    public static volatile int num = 100;

    static int count = 0;

    public static volatile Object obj = new Object();

    public static void main(String[] args){
        //方式1模仿火车站售票
        /*OneNumClass oneNumClass = new OneNumClass();
        OneNumClassTwo oneNumClassTwo = new OneNumClassTwo();
        OneNumClassTwoThree oneNumClassTwoThree = new OneNumClassTwoThree();
        oneNumClass.start();
        oneNumClassTwo.start();
        oneNumClassTwoThree.start();*/

        //方式2  synchronized锁、匿名内部类thread实现
        /*for (int i = 0; i < 10; i++){
            new Thread(){
                @Override
                public void run() {
                    synchronized (OneNumTest.class){
                        while(OneNumTest.num > 0){
                            System.out.println(Thread.currentThread().getName() + "--" + OneNumTest.num);
                            OneNumTest.num = OneNumTest.num - 1;
                            try {
                                OneNumTest.class.wait(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }.start();
        }*/

        //方式3 ReentrantLock锁、匿名内部类thread实现
        /*ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        for(int i=0;i<10;i++) {
            new Thread() {
                public void run() {
                    lock.lock();
                    try {
                        condition.signalAll();
                        while(num > 0 ) {
                            count++;
                            System.out.println("站台["+Thread.currentThread().getId()+"]出售了第"+num+"张票,总共出售的票数:"+count);
                            num--;
                            condition.awaitNanos(1000);
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }finally {
                        lock.unlock();
                    }
                };
            }.start();
        }*/

        //方式4 synchronized锁、线程池实现
        /*ExecutorService threadPool = Executors.newFixedThreadPool(10); //10条线程的固定线程池
        //Executors框架创建的线程池内部以ThreadPoolExecutor的方式创建（即上面注释方式）
        for(int i =0;i<10;i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    synchronized (OneNumTest.class) {
                        while(num > 0 ) {
                            OneNumTest.class.notifyAll();
                            count++;
                            System.out.println("站台["+Thread.currentThread().getId()+"]出售了第 "+num+" 张票,总共出售的票数:"+count);
                            num--;
                            try {
                                OneNumTest.class.wait(10);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
        threadPool.shutdown();*/

        //方式5  synchronized锁、Runnable实现
        /*for(int i=0;i<10;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (OneNumTest.class) {
                        while(num > 0 ) {
                            OneNumTest.class.notifyAll();
                            count++;
                            System.out.println("站台["+Thread.currentThread().getId()+"]出售了第"+num+"张票,总共出售的票数:"+count);
                            num--;
                            try {
                                OneNumTest.class.wait(10);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                };
            }) {

            }.start();
        }*/

        //方式6  synchronized锁、Callable实现
        for(int i=0;i<10;i++) {
            new Thread(new FutureTask<Integer>(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    synchronized (OneNumTest.class) {
                        while(num > 0 ) {
                            OneNumTest.class.notifyAll();
                            count++;
                            System.out.println("站台["+Thread.currentThread().getId()+"]出售了第"+num+"张票,总共出售的票数:"+count);
                            num--;
                            try {
                                OneNumTest.class.wait(10);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                    return count;
                }
            }) {
            }) {
            }.start();
        }


    }
}
