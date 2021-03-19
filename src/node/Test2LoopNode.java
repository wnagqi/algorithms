package node;

import util.LoopNode;

public class Test2LoopNode {
    public static void main(String[] args) {
        // 创建循环链表
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        LoopNode n4 = new LoopNode(4);
        // n1后追加n2
        n1.add(n2);
        n2.add(n3);
        n3.add(n4);
        // 获取数值
        System.out.println(n1.next().getData());
        System.out.println(n2.next().getData());
        System.out.println(n3.next().getData());
        System.out.println(n4.next().getData());

    }
}
