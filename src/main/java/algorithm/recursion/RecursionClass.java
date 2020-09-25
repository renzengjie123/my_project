package algorithm.recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursionClass {

    private int depth = 0;
    private Map<Integer, Integer> hasSolvedList = new HashMap();

    public static void main(String[] args) {
        RecursionClass recursionClass = new RecursionClass();
        System.out.println(recursionClass.f(4));
    }

    int f(int n) {
        //递归不做任何限制时容易造成堆栈溢出  递归调用只有一个分支时
       /* if (n == 1) return 1;
        return f(n - 1) + 1;*/
        //解决方案是用一个变量深度值限制递归深度
        /*++depth;
        if (depth > 1000)
            throw new RuntimeException();
        if (n == 1) return 1;
        return f(n - 1) + 1;*/

        // hasSolvedList 可以理解成一个 Map，key 是 n，value 是 f(n)   解决重复计算问题
        if (hasSolvedList.containsKey(n)) {
            return hasSolvedList.get(n);
        }
        //递归调用有多个分支时
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2);
    }

    //将递归代码改写为非递归代码 递归调用只有一个分支时
    int n(int n) {
        int ret = 1;
        for (int i = 2; i <= n; ++i) {
            ret = ret + 1;
        }
        return ret;
    }

    //将递归代码改写为非递归代码 递归调用有多个分支时
    int m(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for (int i = 3; i <= n; ++i) {
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }
        return ret;
    }
}
