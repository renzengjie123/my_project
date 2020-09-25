package test.sortNum;

public class SingleTest {

    public volatile static int num = 1;

    public volatile static boolean flag = true;


    public static void main(String[] args){
        //System.out.println(SingleTonClass.getInstance());
        ThreadOneClass threadOneClass = new ThreadOneClass();
        ThreadTwoClass threadTwoClass = new ThreadTwoClass();
        threadOneClass.start();
        threadTwoClass.start();
    }
}
