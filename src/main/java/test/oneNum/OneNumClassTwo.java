package test.oneNum;

public class OneNumClassTwo extends Thread {

    @Override
    public void run() {
        while (OneNumTest.num > 0) {
            int num = OneNumTest.num;
            synchronized (OneNumTest.obj) {
                if (num == OneNumTest.num) {
                    OneNumTest.obj.notify();
                    System.out.println("线程2卖掉: " + OneNumTest.num);
                    OneNumTest.num = OneNumTest.num - 1;
                    try {
                        OneNumTest.obj.wait(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
