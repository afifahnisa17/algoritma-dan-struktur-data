package TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        BinaryTreeArray03 tree = new BinaryTreeArray03();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);

        System.out.print("InOrder: ");
        tree.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder: ");
        tree.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder: ");
        tree.traversePostOrder(0);
        System.out.println();
    }
}

