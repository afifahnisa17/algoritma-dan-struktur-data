package TugasPraktikum;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method untuk menambahkan node secara rekursif
    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Method untuk menampilkan nilai paling kecil
    public int findMin() {
        if (root == null) {
            throw new RuntimeException("Tree is empty");
        }
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node node) {
        return node.left == null ? node.data : findMinRecursive(node.left);
    }

    // Method untuk menampilkan nilai paling besar
    public int findMax() {
        if (root == null) {
            throw new RuntimeException("Tree is empty");
        }
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node node) {
        return node.right == null ? node.data : findMaxRecursive(node.right);
    }

    // Method untuk menampilkan data di leaf
    public void printLeafNodes() {
        printLeafNodesRecursive(root);
    }

    private void printLeafNodesRecursive(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodesRecursive(node.left);
            printLeafNodesRecursive(node.right);
        }
    }

    // Method untuk menghitung jumlah leaf
    public int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }

    private int countLeafNodesRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
    }
}
