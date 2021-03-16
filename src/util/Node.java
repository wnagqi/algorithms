package util;

/**
 * @Author Wangqi
 * @Date 2021/3/15 23:12
 * @Discription
 */
public class Node {
    int data;
    Node next;
    // 构造器
    public Node(int data){
        this.data = data;
    }
    // 为节点追回节点
    public Node append(Node node){
        // 确定当前节点
        Node currentNode = this;
        // 循环找出最后一个没有空节点
        while (true){
            if (currentNode.next == null){
                break;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return this;
    }
    // 获取当前节点的数据
    public int getData(){
        return this.data;
    }
    // 判断是否是末尾节点
    public boolean isLast(){
        return this.next == null;
    }
    // 获取下一个节点
    public Node next(){
        return this.next;
    }
    // 显示所有节点
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.data + " ");
            if(currentNode.next == null){
                break;
            }
            currentNode = currentNode.next;
        }
    }
    // 删除当前节点的下一个节点
    public void delete(){
        this.next = this.next.next;
    }
    // 在当前节点后面添加一个节点
    public void add(Node node){
        node.next = this.next;
        this.next = node;
    }
}
