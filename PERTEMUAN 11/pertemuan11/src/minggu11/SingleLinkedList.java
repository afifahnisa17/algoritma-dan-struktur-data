package minggu11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List:      ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("linked List Kosong");
        }
    }

    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;

        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        tail.next = ndInput;
        tail = ndInput;
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == tail) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key " + key + " tidak ditemukan");
        }
    }
    

    void insertAt (int index, int input){
        Node temp = head;
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        }
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi panjang linked list!");
            return;
        }

        temp.next = new Node(input, temp.next);
        if(temp.next.next == null){
            tail = temp.next; 
        }
    }

}


