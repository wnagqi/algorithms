package tree;

/**
 * @Author WangQi
 * @Date 2021/3/20 9:01
 * @Desciption  定义节点
 */
public class TreeNode {
    int value;
    // 左儿子
    TreeNode leftNode;
    // 右儿子
    TreeNode rightNode;
    public TreeNode(int value){
        this.value = value;
    }
    // 在一个节点后创建左儿子
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }
    // 前序遍历
    public void frontShow() {
        // 先输出自己的节点值
        System.out.print(value);
        System.out.print(" ");
        // 递归遍历左儿子节点
        if (leftNode != null){
            leftNode.frontShow();
        }
        // 递归遍历右儿子节点
        if (rightNode != null){
            rightNode.frontShow();
        }
    }

    // 中序遍历
    public void midShow() {
        if (leftNode != null){
            leftNode.midShow();
        }
        System.out.print(value);
        System.out.print(" ");
        if (rightNode != null){
            rightNode.midShow();
        }
    }

    // 后序遍历
    public void afterShow(){
        if (leftNode != null){
            leftNode.afterShow();
        }
        if (rightNode != null){
            rightNode.afterShow();
        }
        System.out.print(value);
        System.out.print(" ");
    }

    // 前序查找
    public TreeNode frontSelect(int i) {
        TreeNode target = null;
        // 对比当前节点的值
        if (this.value == i){
            return this;
        }else{
            if (leftNode != null){
                target = leftNode.frontSelect(i);
            }
            if (target != null){
                return target;
            }
            if (rightNode != null){
                target = rightNode.frontSelect(i);
            }
            if (target != null){
                return target;
            }
        }
        return target;
    }

    public void delete(int i) {
        TreeNode parent = this;
        if (parent.leftNode != null && parent.leftNode.value == i){
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode != null && parent.rightNode.value == i){
            parent.rightNode = null;
            return;
        }
        // 把左子节点看作父节点
        parent = leftNode;
        if (parent != null){
            delete(i);
        }
        // 把右子节点看作父节点
        parent = rightNode;
        if (parent != null){
            delete(i);
        }


    }
}
