package tree;

/**
 * @Author WangQi
 * @Date 2021/3/20 9:05
 * @Desciption
 */
public class Test1BinaryTree {
    public static void main(String[] args) {
        // 创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        // 创建根节点
        TreeNode root = new TreeNode(1);
        // 根节点
        binaryTree.setRoot(root);
        // 创建根节点的左儿子节点
        TreeNode rootL = new TreeNode(2);
        // 在根节点上添加做左儿子节点
        root.setLeftNode(rootL);
        // 创建根节点的右儿子节点,值为3
        TreeNode rootR = new TreeNode(3);
        // 根节点上添加右儿子节点
        root.setRightNode(rootR);
        // 为根节点的左儿子节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        // 为根节点的右儿子节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        // 前序遍历
        binaryTree.frontShow();
        System.out.println("");

        // 中序遍历
        binaryTree.midShow();
        System.out.println("");

        // 后序遍历
        binaryTree.afterShow();
        System.out.println("");

        // 前序查找 传入数值查找权是该值得节点
        TreeNode result = binaryTree.frontSelect(3);
        System.out.println(result);

        // 删除子树
        binaryTree.delete(3);
        TreeNode result2 = binaryTree.frontSelect(3);
        System.out.println(result2);

    }
}
