package test.sortNum;

import test.sortNum.SingleTest;

public class ThreadTwoClass extends Thread {

    @Override
    public void run() {
        while (SingleTest.flag) {

        }
        while (SingleTest.num < 11) {
            if (!SingleTest.flag && SingleTest.num < 11) {
                System.out.println("偶数: " + SingleTest.num);
                SingleTest.flag = true;
                SingleTest.num = SingleTest.num + 1;
            }
        }
    }
}
