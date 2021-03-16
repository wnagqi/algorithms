package node;

import util.Node;

/**
 * @Author Wangqi
 * @Date 2021/3/15 23:24
 * @Discription
 */
public class Test1Node {
    public static void main(String[] args) {
        // 创建节点
        Node n1 = new Node(22);
        Node n2 = new Node(33);
        Node n3 = new Node(44);
        n1.append(n2).append(n3);
        System.out.println(n1.next().next().getData());
        n1.show();
        System.out.println();
        System.out.println("-------------------");
        // 删除n1后面的节点
        n1.delete();
        n1.show();
        System.out.println();
        System.out.println("---------------");
        // 添加一个节点
        n3.add(new Node(55));
        n1.show();

    }
}
