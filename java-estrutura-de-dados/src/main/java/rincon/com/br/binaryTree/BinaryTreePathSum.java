package rincon.com.br.binaryTree;

public class BinaryTreePathSum {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(1);
        binaryTree.insert(9);
        binaryTree.insert(2);

        System.out.println(hasPathSum(binaryTree.getRoot(), 11));
    }

    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }

        if ( root.getLeft() == null
                && root.getRight() == null
                && targetSum == root.getData()
        ) {
            return true;
        }

        return hasPathSum(root.getLeft(), targetSum - root.getData())
                || hasPathSum(root.getRight(), targetSum - root.getData());
    }
}
