package test.reverseLink;

import java.util.ArrayList;
import java.util.List;

public class ReverseSingleLink {

    private int num;

    private ReverseSingleLink nextNode;

    public ReverseSingleLink(int num,ReverseSingleLink nextNode){
        this.num = num;
        this.nextNode = nextNode;
    }

    public int getNum(){
        return num;
    }

    public ReverseSingleLink getNextNode(){
        return nextNode;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setNextNode(ReverseSingleLink nextNode){
        this.nextNode = nextNode;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList();
        List<ReverseSingleLink> data = new ArrayList();
        ReverseSingleLink singleLink = new ReverseSingleLink(1, new ReverseSingleLink(2, new ReverseSingleLink(3, new ReverseSingleLink(4, null))));
        /*while(null != singleLink.getNextNode()){
            System.out.print(singleLink.getNum() + "->");
            singleLink = singleLink.getNextNode();
            list.add(singleLink.getNum());
        }
        System.out.print(singleLink.getNum() + "->null");*/
        ReverseSingleLink link = reverse2(singleLink);
        //System.out.println("aa");
        while(null != link && null != link.getNextNode()){
            System.out.print(link.getNum() + "->");
            link = link.getNextNode();
            //list.add(singleLink.getNum());
        }
        System.out.print(link.getNum() + "->null");
        /*list.add(singleLink.getNum());
        //单向链表翻转
        for (int i = 0; i < list.size() ;i++){
            ReverseSingleLink reverseSingleLink = new ReverseSingleLink(list.get(i), null);
            data.add(reverseSingleLink);
        }*/


    }

    public static ReverseSingleLink reverse1(ReverseSingleLink head) {
        if (null == head || null == head.getNextNode())
            return head;
        ReverseSingleLink revHead = reverse1(head.getNextNode());
        head.getNextNode().setNextNode(head);
        head.setNextNode(null);
        return revHead;
    }

    public static ReverseSingleLink reverse2(ReverseSingleLink head) {
        if (null == head || null == head.getNextNode())
            return head;
        ReverseSingleLink pre = head;
        ReverseSingleLink cur = head.getNextNode();
        while (null != cur.getNextNode()) {
            ReverseSingleLink tmp = cur.getNextNode();
            cur.setNextNode(pre);
            pre = cur;
            cur = tmp;
        }
        cur.setNextNode(pre);
        head.setNextNode(null);
        return cur;
    }
}
