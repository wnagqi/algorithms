package tree;

/**
 * @Author WangQi
 * @Date 2021/3/20 9:01
 * @Desciption      定义二叉树
 */
public class BinaryTree {

    TreeNode root;
    // 设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    // 获取根节点
    public TreeNode getRoot(){
        return root;
    }

    // 前序遍历
    public void frontShow() {
        root.frontShow();
    }

    // 中序遍历
    public void midShow() {
        root.midShow();
    }

    // 后序遍历
    public void afterShow(){
        root.afterShow();
    }

    // 前序查找
    public TreeNode frontSelect(int i) {
        return root.frontSelect(i);
    }

    public void delete(int i) {
        if (root.value == i){
            root = null;
        }else{
            root.delete(i);
        }
    }
}
