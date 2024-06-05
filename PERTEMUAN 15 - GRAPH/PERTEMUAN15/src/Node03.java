public class Node03 {
    int data;
    Node03 prev, next;
    int jarak;

    Node03(Node03 prev, int data, int jarak, Node03 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next= next;
    }
}
