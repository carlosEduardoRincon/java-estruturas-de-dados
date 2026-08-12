package rincon.com.br.binaryTree;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            insertRecursive(data, this.root);
        }
    }

    public void insertRecursive(int data, Node node) {
        if (data < node.getData()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
            } else {
                insertRecursive(data, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
            } else {
                insertRecursive(data, node.getRight());
            }
        }
    }

    public boolean search(int data) {
        return searchRecursive(data, this.root);
    }

    public boolean searchRecursive(int data, Node node) {
        if (node == null) {
            return false;
        }

        if (node.getData() == data) {
            return true;
        }

        if (data < node.getData()) {
            return searchRecursive(data, node.getLeft());
        } else {
            return searchRecursive(data, node.getRight());
        }
    }
}



