package rincon.com.br.binaryTree;


import java.util.Arrays;

public class BinaryTreeFromInorderPostorderTraversal {

    public static void main(String[] args) {
        buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9,15,7,20,3});
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        int rootValue = postorder[postorder.length - 1];
        TreeNode tree = new TreeNode(rootValue);

        int indexRoot = getIndexRoot(inorder, rootValue);

        int[] rightInorder = Arrays.copyOfRange(inorder, indexRoot + 1, inorder.length);
        int[] rightPostorder = Arrays.copyOfRange(postorder, indexRoot, postorder.length - 1);

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, indexRoot);
        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, indexRoot);

        tree.left = buildTree(leftInorder, leftPostorder);
        tree.right = buildTree(rightInorder, rightPostorder);

        return tree;
    }

    private static int getIndexRoot(int[] inorder, int rootValue) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                return i;
            }
        }
        return 0;
    }
}

