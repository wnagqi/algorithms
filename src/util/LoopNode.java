package util;

/**
 * @Author Wangqi
 * @Date 2021/3/15 23:12
 * @Discription
 */
public class LoopNode {
    int data;
    LoopNode next = this;
    // 构造器
    public LoopNode(int data){
        this.data = data;
    }
    // 获取当前节点的数据
    public int getData(){
        return this.data;
    }
    // 获取下一个节点
    public LoopNode next(){
        return this.next;
    }
    // 删除当前节点的下一个节点
    public void delete(){
        // 将当前节点的下下个节点作为当前节点的下一个节点
        this.next = this.next.next;
    }
    // 在当前节点后面添加一个节点
    public void add(LoopNode node){
        // 取出当前节点的下一个节点作为添加节点的下一个节点
        node.next = this.next;
        // 添加节点作为当前节点的下一个节点
        this.next = node;
    }
}
