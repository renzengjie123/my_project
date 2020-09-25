
import javax.swing.tree.TreeNode;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void main(String[] args) throws ParseException {
        /*BigDecimal bigDecimal = new BigDecimal("0.12");
        BigDecimal bigDecimal2 = new BigDecimal("0.32");
        BigDecimal bigDecimal3 = new BigDecimal("0.22");
        System.out.println(new BigDecimal("1.00").subtract(bigDecimal).subtract(bigDecimal2).subtract(bigDecimal3));*/

        /*String str1 = "2020-05-01/2020-05-31";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] split = str1.split("/");
        try {
            System.out.println(format.parse(split[1]+ " 23:59:59"));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        /*StringBuilder str = new StringBuilder("12,34,56,78,");
        str.replace(str.length() - 1, str.length(),"");
        System.out.println(str);*/
        /*List<String> str = new ArrayList();
        str.add("a.1");
        str.add("a.2");
        str.add("ab.3");
        str.add("ac.4");
        str.add("dd.5");
        str.add("ae.6");
        String str1 = "^[0-9]*[1-9][0-9]*$";*/
        //List<String> strings = str.subList(1, 4);
        /*for (String itrm : strings) {
            System.out.println(itrm);
        }*/
        //for (String itrm : str) {
           // System.out.println("10".matches(str1));
        //}
        /*String str = "a.12";
        System.out.println(str);*/
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //dateFormat.parse("2020-08-01");

       /* Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse("2020-07-31"));
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) == 1);*/

        int[] datas = {1,2,3,5,10,6,7,8,9};
        List<Node> list = new ArrayList();
        create(datas,list);
        Test test = new Test();
        //test.preTraversal(list.get(0));
        //test.MidTraversal(list.get(0));
        //test.postTraversal(list.get(0));
        //test.preOrderTraversalbyLoop(list.get(0));
        //test.inOrderTraversalbyLoop(list.get(0));
        //test.postOrderTraversalbyLoop(list.get(0));
        //test.bfs(list.get(0));
        //List<List<Integer>> rst = new ArrayList<>();
        //List<Integer> list2 = new ArrayList<>();
        //test.dfs(list.get(0),rst,list2);
        int[] ints = insertionSort(datas);
        System.out.print(Arrays.toString(ints));

    }

    //数组升华二叉树
    public  static void create(int[] datas,List<Node> list) {

        //将数组里面的东西变成节点的形式
        for(int i=0;i<datas.length;i++) {
            Node node=new Node(datas[i]);
            list.add(node);
        }

        //节点关联成树
        for(int index=0;index<list.size()/2-1;index++) {
            list.get(index).setLeft(list.get(index*2+1));
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            list.get(index).setRight(list.get(index*2+2));  //与上同理
        }

        //单独处理最后一个父节点 ,list.size()/2-1进行设置，避免单孩子情况
        int index=list.size()/2-1;
        list.get(index).setLeft(list.get(index*2+1));
        if(list.size()%2==1)
            //如果有奇数个节点，最后一个父节点才有右子节点
            list.get(index).setRight(list.get(index*2+2));

    }

    //递归前序遍历
    public void preTraversal(Node node){
        if (node == null) //很重要，必须加上 当遇到叶子节点用来停止向下遍历
            return;
        System.out.print(node.getValue()+" ");
        preTraversal(node.getLeft());
        preTraversal(node.getRight());
    }

    //递归中序遍历
    public void  MidTraversal(Node node){
        if (node == null)
            return;
        MidTraversal(node.getLeft());
        System.out.print(node.getValue()+" ");
        MidTraversal(node.getRight());
    }

    //递归后序遍历
    public void postTraversal(Node node){
        if (node == null)
            return;
        postTraversal(node.getLeft());
        postTraversal(node.getRight());
        System.out.print(node.getValue()+" ");
    }

    //非递归前序遍历
    public void preOrderTraversalbyLoop(Node node){
        Stack<Node> stack = new Stack();
        Node p = node;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                //当p不为空时，就读取p的值，并不断更新p为其左子节点，即不断读取左子节点
                System.out.print(p.getValue()+" ");
                stack.push(p); //将p入栈
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                p = p.getRight();
            }
        }
    }

    //非递归中序遍历
    public void inOrderTraversalbyLoop(Node node){
        Stack<Node> stack = new Stack();
        Node p = node;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                System.out.print(p.getValue()+" ");
                p = p.getRight();
            }
        }
    }

    //非递归后序遍历
    public void postOrderTraversalbyLoop(Node node){
        Stack<Node> stack = new Stack<Node>();
        Node p = node,    prev = node;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                Node temp = stack.peek().getRight();
                //只是拿出来栈顶这个值，并没有进行删除
                if(temp == null||temp == prev){
                    //节点没有右子节点或者到达根节点【考虑到最后一种情况】
                    p = stack.pop();
                    System.out.print(p.getValue()+" ");
                    prev = p;
                    p = null;
                }
                else{
                    p = temp;
                }
            }
        }
    }

    //广度优先遍历
    public void bfs(Node root){
        if(root == null) return;
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.offer(root); //首先将根节点存入队列
        //当队列里有值时，每次取出队首的node打印，打印之后判断node是否有子节点，若有，则将子节点加入队列
        while(queue.size() > 0){
            Node node = queue.peek();
            queue.poll(); //取出队首元素并打印
            System.out.print(node.getValue()+" ");
            if(node.getLeft() != null){ //如果有左子节点，则将其存入队列
                queue.offer(node.getLeft());
            }
            if(node.getRight() != null){ //如果有右子节点，则将其存入队列
                queue.offer(node.getRight());
            }
        }
    }

    //深度优先遍历
    public void dfs(Node node,List<List<Integer>> rst,List<Integer> list){
        if(node == null) return;
        if(node.getLeft() == null && node.getRight() == null){
            list.add(node.getValue());
            /* 这里将list存入rst中时，不能直接将list存入，而是通过新建一个list来实现，
             * 因为如果直接用list的话，后面remove的时候也会将其最后一个存的节点删掉
             * */
            //System.out.print(node.getValue()+" ");
            rst.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
        list.add(node.getValue());
        dfs(node.getLeft(),rst,list);
        dfs(node.getRight(),rst,list);
        list.remove(list.size()-1);
        System.out.print(node.getValue()+" ");
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

    /**
     * 选择排序
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }
    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
}
