package test.sortNum;

import test.sortNum.SingleTest;

public class ThreadOneClass extends Thread {

    @Override
    public void run() {
        while (!SingleTest.flag) {

        }
        while (SingleTest.num < 11) {
            if (SingleTest.flag && SingleTest.num < 11) {
                System.out.println("奇数: " + SingleTest.num);
                SingleTest.flag = false;
                SingleTest.num = SingleTest.num + 1;
            }
        }
    }
}
