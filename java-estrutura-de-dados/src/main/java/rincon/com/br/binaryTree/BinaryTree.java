package rincon.com.br.binaryTree;

import java.util.ArrayList;
import java.util.List;

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

    public boolean dfs(int data) {
        return dfsRecursive(data, this.root);
    }

    public boolean dfsRecursive(int data, Node node) {
        if (node == null) {
            return false;
        }

        if (node.getData() == data) {
            return true;
        }

        if (dfsRecursive(data, node.getLeft())) {
            return true;
        } else return dfsRecursive(data, node.getRight());
    }

    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();

        preorderRecursive(this.root, result);

        return result;
    }

    private void preorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.getData());
            preorderRecursive(node.getLeft(), result);
            preorderRecursive(node.getRight(), result);
        }
    }

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();

        inorderRecursive(this.root, result);

        return result;
    }

    private void inorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            inorderRecursive(node.getLeft(), result);
            result.add(node.getData());
            inorderRecursive(node.getRight(), result);
        }
    }

    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();

        postorderRecursive(this.root, result);

        return result;
    }

    private void postorderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            postorderRecursive(node.getLeft(), result);
            postorderRecursive(node.getRight(), result);
            result.add(node.getData());
        }
    }
}



