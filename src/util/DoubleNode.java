package util;

/**
 * @Author WangQi
 * @Date 2021/3/16 21:26
 * @Description
 */
public class DoubleNode {
    DoubleNode pre = this;
    DoubleNode next = this;
    int data;
    // 构造器
    public DoubleNode(int data){
        this.data = data;
    }
    // 获取数据
    public int getData(){
        return this.data;
    }
    // 返回下一个节点
    public DoubleNode next(){
        return this.next;
    }
    // 返回上一个节点
    public DoubleNode pre(){
        return this.pre;
    }
    // 增加一个节点
    public void add(DoubleNode node){
        // 获取当前节点的下一个节点
        DoubleNode nextNode = this.next;
        // 当前节点与插入节点的关系：当前节点的下一个节点指向插入节点
        this.next = node;
        // 当前节点与插入节点的关系：插入节点的上一个节点指向当前节点
        node.pre = this;
        // 插入节点与下一个节点的关系: 插入节点的下一个节点指向原本节点的下一个节点（nextNode）
        node.next = nextNode;
        // 插入节点与下一个节点的关系：下一个节点的pre指向插入节点
        nextNode.pre = node;
    }
}
