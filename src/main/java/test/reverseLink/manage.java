package test.reverseLink;

import java.util.Random;

/**
 * 链表测试类
 */
public class manage {

    public static void main(String[] args) {
        String name = "";
        int credit;
        int age;
        int size;
        MyList myl = new MyList();
        Random random = new Random();
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; i++) {
            credit = random.nextInt(5);
            age = random.nextInt(5) + 18;
            for (int j = 0; j < 4; j++) {
                name += (char) (random.nextInt(26) + 97);
            }
            Students stu = new Students(name, credit, age);
            myl.add(stu);
            name = "";
        }

        System.out.println("Size of myl1 is " + myl.size());
        for (int i = 0; i < myl.size(); i++) {
            Students stu2 = (Students) myl.get(i);
            stu2.show();
        }
        //        //测试能否在链表末尾加入节点（成功）
        //        for(int i = 0; i < myl.size() ;i++){
        //            Students stu2 = (Students) myl.get(i);
        //            stu2.show();
        //        }
        //        //测试能否通过下标加入一个节点（成功）
        //        Students stu3 = new Students("cyt",5,18);
        //        myl.add(1, stu3);
        //        System.out.println("Size is "+ myl.size());
        //        for(int i = 0; i < myl.size() ;i++){
        //            Students stu2 = (Students) myl.get(i);
        //            stu2.show();
        //        }

        MyList myl2 = new MyList();
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; i++) {
            credit = random.nextInt(5);
            age = random.nextInt(5) + 18;
            for (int j = 0; j < 4; j++) {
                name += (char) (random.nextInt(26) + 97);
            }
            Students stu2 = new Students(name, credit, age);
            myl2.add(stu2);
            name = "";
        }
        System.out.println("Size is of myl2 " + myl2.size());
        for (int i = 0; i < myl2.size(); i++) {
            Students stu2 = (Students) myl2.get(i);
            stu2.show();
        }


        myl.add(1, myl2);
        System.out.println("Size is of myl1 " + myl.size());
        for (int i = 0; i < myl.size(); i++) {
            Students stu2 = (Students) myl.get(i);
            stu2.show();
        }
    }
}
