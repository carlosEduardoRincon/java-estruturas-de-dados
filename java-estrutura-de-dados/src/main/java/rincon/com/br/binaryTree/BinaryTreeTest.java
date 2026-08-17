package rincon.com.br.binaryTree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(1);
        binaryTree.insert(9);
        binaryTree.insert(2);

        System.out.println(binaryTree.search(1));
        System.out.println(binaryTree.search(10));

        System.out.println(binaryTree.preorderTraversal().toString());
        System.out.println(binaryTree.inorderTraversal().toString());
        System.out.println(binaryTree.postorderTraversal().toString());
    }
}
