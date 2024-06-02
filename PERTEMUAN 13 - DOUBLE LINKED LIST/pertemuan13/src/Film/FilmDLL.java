package Film;

public class FilmDLL {
    int size;
    Film head;

    FilmDLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void addFirst(int id, String judul, double rating){
        if(isEmpty()){
            head = new Film(null, id, judul, rating,  null);
            System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
        } else {
            Film newNode = new Film(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
            System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
        }
        size++;
    }

    public void addLast (int id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
            System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
        } else {
            Film current = head;
            while (current.next != null){
                current = current.next;
            }
            Film newNode = new Film(current, id, judul, rating,  null);
            current.next = newNode;
            System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
            size++;
        }
    }

    public void add(int id, String judul, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == size) { 
            addLast(id, judul, rating);
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            Film newNode = new Film(current.prev, id, judul, rating, current);
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                head = newNode; 
            }
            current.prev = newNode;
            System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
        }
        size++;
    }
    

    public void removeFirst() throws Exception {
        Film tmp = head;
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
            System.out.println(tmp.judul + " telah dihapus dari daftar.");
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(tmp.judul + " telah dihapus dari daftar.");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }

        Film current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println(current.judul + " telah dihapus dari daftar.");
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Film current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            System.out.println(current.judul + " telah dihapus dari daftar.");
            size--;
        }
    }

    public void print(){
        if(!isEmpty()){
            Film tmp = head;
            while (tmp != null){
                System.out.println("ID  : " + tmp.id);
                System.out.println("    Judul Film  : " + tmp.judul);
                System.out.println("    IPK         : " + tmp.rating);
                tmp = tmp.next;
            }
            
        } else {
            System.out.println("Linked lists Kosong");
        }
    }

    public int cariFilm(int cari) {
        if (isEmpty()) {
            System.out.println("Tidak ada film yang ditemukan.");
            return -1;
        }
    
        Film tmp = head;
        int posisi = -1;
        for (int j = 0; j < size; j++) {
            if (tmp.id == cari) {
                posisi = j;
                break;
            }
            tmp = tmp.next;
        }
    
        if (posisi != -1) {
            System.out.println("Data ID Film: " + tmp.id + " berada di node ke-" + posisi);
            System.out.println("IDENTITAS   : ");
            System.out.println("    ID Film     : " + cari);
            System.out.println("    Judul Film  : " + tmp.judul);
            System.out.println("    IMDB Rating : " + tmp.rating);
        } else {
            System.out.println("Film dengan ID " + cari + " tidak ditemukan.");
        }
    
        return posisi;
    }
    
    
    public void insertionSort() {
        if (head == null || head.next == null) {
            return; 
        }

        Film current = head.next;
        while (current != null) {
            Film nextNode = current.next;
            Film sorted = current.prev;

            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
                while (sorted != null && sorted.rating < current.rating) { 
                sorted = sorted.prev;
            }

            if (sorted == null) {
                current.next = head;
                head.prev = current;
                current.prev = null;
                head = current;
            } else {
                current.next = sorted.next;
                current.prev = sorted;
                if (sorted.next != null) {
                    sorted.next.prev = current;
                }
                sorted.next = current;
            }
            current = nextNode;
        }
    }
    
}    
