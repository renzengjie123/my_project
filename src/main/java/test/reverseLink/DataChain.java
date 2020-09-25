package test.reverseLink;

import java.util.Stack;

public class DataChain {

    private  DataNode head;

    public DataChain(int size) {
        DataNode head = new DataNode(0);
        DataNode cur = head;
        for (int i = 1; i < size; i++) {
            DataNode tmp = new DataNode(i);
            cur.setNext(tmp);
            cur = tmp;
        }
        this.head = head;
    }

    public DataNode getHead() {
        return head;
    }

    public void setHead(DataNode head) {
        this.head = head;
    }

    public static void printChain(DataNode head) {
        StringBuilder sb = new StringBuilder();
        DataNode cur = head;
        sb.append(cur.getData());
        while (null != cur.getNext()) {
            sb.append(" -> ");
            sb.append(cur.getNext().getData());
            cur = cur.getNext();
        }
        System.out.println(sb.toString());
    }

    public static void main(String... strings) {
        DataChain chain = new DataChain(10);
        printChain(chain.getHead());
        //1、通过递归实现单链表反转
        //DataNode dataNode = reverse1(chain.getHead());
        //DataNode dataNode1 = reverse2(chain.getHead());
        DataNode dataNode2 = reverse3(chain.getHead());
        //printChain(dataNode);
        //printChain(dataNode1);
        printChain(dataNode2);

    }

    //通过递归实现单链表反转
    public static DataNode reverse1(DataNode head) {
        if (null == head || null == head.getNext())
            return head;
        DataNode revHead = reverse1(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return revHead;
    }

    /**
     * 遍历实现 通用实现方法
     *
     * @param head
     * @return
     */
    public static DataNode reverse2(DataNode head) {
        if (null == head || null == head.getNext())
            return head;
        DataNode pre = head;
        DataNode cur = head.getNext();
        while (null != cur.getNext()) {
            DataNode tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }
        cur.setNext(pre);
        head.setNext(null);
        return cur;
    }

    /**
     * 方法3 利用其他数据结构 stack
     * @param head
     * @return
     */
    public static DataNode reverse3(DataNode head) {
        Stack<DataNode> stack = new Stack<DataNode>();
        for (DataNode node = head; null != node; node = node.getNext()) {
            stack.add(node);
        }
        DataNode reHead = stack.pop();
        DataNode cur = reHead;
        while(!stack.isEmpty()){
            cur.setNext(stack.pop());
            cur = cur.getNext();
            cur.setNext(null);
        }
        return reHead;
    }
}
