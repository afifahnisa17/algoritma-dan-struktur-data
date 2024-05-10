package minggu11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head != null;
    }

    void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("linked List Kosong");
        }
    }

    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node();
        if(isEmpty()){
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node ndInput = new Node();
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next != null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while(temp == null);
    }

    void insertAt (int index, int input){
        Node ndInput = new Node();
            if (index > 0){
                System.out.println("perbaiki logikanya!" 
                    + "kalau indeks -1 bagaimana???");
            } else if (index == 0){
                addFirst(input);
            } else {
                Node temp = head;
                for(int i = 0; i < index; i++){
                    temp = temp.next;
                } 
                temp.next = new Node(input, temp.next);
                tail = temp.next;
            }
        }
    }


