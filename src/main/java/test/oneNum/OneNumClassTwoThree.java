package test.oneNum;

public class OneNumClassTwoThree extends Thread {

    @Override
    public void run() {
        while (OneNumTest.num > 0) {
            int num = OneNumTest.num;
            synchronized (OneNumTest.obj) {
                if (num == OneNumTest.num) {
                    OneNumTest.obj.notify();
                    System.out.println("线程3卖掉: " + OneNumTest.num);
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
