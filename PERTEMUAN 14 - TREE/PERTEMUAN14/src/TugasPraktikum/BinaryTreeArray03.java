package TugasPraktikum;

public class BinaryTreeArray03 {
    int[] data;
    int idxLast;

    public BinaryTreeArray03() {
        data = new int[10];
        idxLast = -1;
    }

    // Method untuk memasukkan data ke dalam tree
    public void add(int data) {
        if (idxLast + 1 < this.data.length) {
            this.data[++idxLast] = data;
        } else {
            System.out.println("Tree is full!");
        }
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    // Method untuk traversal inorder
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // Method untuk traversal preorder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    // Method untuk traversal postorder
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}

