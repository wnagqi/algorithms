package node;

import util.DoubleNode;

/**
 * @Author WangQi
 * @Date 2021/3/16 21:42
 * @Description
 */
public class Test3DoubleNode {
    public static void main(String[] args) {
        // 创建双向循环链表
        DoubleNode n1 = new DoubleNode(9);
        DoubleNode n2 = new DoubleNode(8);
        DoubleNode n3 = new DoubleNode(7);
        DoubleNode n4 = new DoubleNode(6);
        // 追加
        n1.add(n2);
        n2.add(n3);
        n3.add(n4);
        System.out.println(n1.next().getData()); // 8
        System.out.println(n2.next().getData()); // 7
        System.out.println(n3.next().getData()); // 6
        System.out.println(n1.getData()); // 9

    }
}
