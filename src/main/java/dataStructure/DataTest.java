package dataStructure;

public class DataTest {

    public static void main(String[] args) {
        int[] array = {2,4,6,12,43,13,13,67};
        DataTest dataTest = new DataTest();
        int i = dataTest.find(array, array.length, 12);
        System.out.println("数字12在数组中的位置下标为： " + i);

        String str = "xf_total_amount,xf_actual_amount,xf_yl_amount,xf_zfb_amount,xf_wx_amount";
        System.out.println(str.contains("xf_total_amount"));
    }

    // n 表示数组 array 的长度
    int find(int[] array, int n, int x) {
        int i = 0;
        int pos = -1;
        for (; i < n; ++i) {
            if (array[i] == x) pos = i;
        }
        return pos;
    }
}
