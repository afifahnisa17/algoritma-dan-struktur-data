<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN  14 - TREE

<br>
<img src="picture/logopolinema.png" height="300">
</h1>

<h2>Nama &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;Afifah Khoirunnisa
<br>
Kelas &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;TI-1B
<br>
NIM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;2341720250
<br>
No.Abs&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;03</h2>

## 13.2 Kegiatan Praktikum 1
## Implementasi Binary Search Tree menggunakan Linked List
## 13.2.1 Percobaan 1
### Class Node03
```java
    public class Node03 {
        int data;
        Node03 left, right;
        
        Node03(){

        }
        
        Node03(Node03 left, int data, Node03 right){
            this.left = left;
            this. data = data;
            this.right = right;
        }
        
    }
```
### Class BinaryTree03
```java
    public class BinaryTree03 {
        Node03 root;

        public BinaryTree03(){
            root = null;
        }

        boolean isEmpty(){
            return root == null;
        }

        void add(int data){
            if(isEmpty()){
                root = new Node03(null, data, null);
            } else {
                Node03 current = root;
                while(true){
                    if(data>current.data){
                        if(current.right==null){
                            current.right = new Node03(null, data, null);
                            break;
                        } else {
                            current = current.right;
                            
                        } 
                    } else if(data<current.data){
                        if(current.left==null){
                            current.left = new Node03(null, data, null);
                            break;
                        } else {
                            current = current.left;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        boolean find(int data){
            boolean result = false;
            Node03 current = root;
            while(current!=null){
                if(current.data==data){
                    result=true;
                    break;
                }else if(data>current.data){
                    current = current.right; //pindahkan anak ke kanan jika lebih besar
                } else {
                    current = current.left;
                }
            }
            return result;
        }

        void traversePreOrder(Node03 node){
            if(node != null){
                System.out.print(" " + node.data);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }

        void traversePostOrder(Node03 node){
            if(node != null){
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print(" " + node.data);
            }
        }

        void traverseInOrder(Node03 node){
            if(node != null){
                if(node != null){
                    traverseInOrder(node.left);
                    System.out.print(" " + node.data);
                    traverseInOrder(node.right);
                }
            }
        }

        Node03 getSuccesor(Node03 del){
            Node03 successor = del.right;
            Node03 successorParent = del;
            while(successor.left!= null){
                successorParent = successor;
                successor = successor.left;
            }

            if(successor!=del.right){
                successorParent.left = successor.right;
                successor.right = del.right;
            }
            return successor;
        }

        void delete(int data){
            if(isEmpty()){
                System.out.println("Tree is empty!");
                return;
            }

            Node03 parent = null;
            Node03 current = root;
            boolean isLeftChild = false;
            while(current!=null){
                if(current.data==data){
                    break;
                } else if(data<current.data){
                    parent = current;
                    current = current.left;
                    isLeftChild = true;
                } else{
                    parent = current;
                    current = current.right;
                    isLeftChild = false;
                }
            }

            //deletion
            if(current == null){
                System.out.println("Coudn't find data!");
                return;
            } else{
                //if there is no child, simply delete it
                if(current.left==null&&current.right==null){
                    if(current==root){
                        root = null;
                    } else {
                        if(isLeftChild){
                            parent.left = null;
                        } else{
                            parent.right = null;
                        }
                    }
                } else if(current.left==null){
                    if(current==root){
                        root = current.right;
                    } else {
                        if(isLeftChild){
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                }else if(current.right==null){
                    if(current==root){
                        root = current.left;
                    } else {
                        if(isLeftChild){
                            parent.left = current.left;
                        } else{
                            parent.right = current.left;
                        }
                    }
                } else{
                    Node03 successor = getSuccesor(current);
                    if(current==root){
                        root = successor;
                    } else{
                        if(isLeftChild){
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }
```
### Class BinaryTreeMain03
```java
    public class BinaryTreeMain03 {
        public static void main(String[] args) {
            BinaryTree03 bt = new BinaryTree03();
            bt.add(6);
            bt.add(4);
            bt.add(8);
            bt.add(3);
            bt.add(5);
            bt.add(7);
            bt.add(9);
            bt.add(10);
            bt.add(15);
            System.out.print("PreOrder Traversal : ");
            bt.traversePreOrder(bt.root);
            System.out.println("");
            System.out.print("InOrder Traversal: ");
            bt.traverseInOrder(bt.root);
            System.out.println("");
            System.out.print("PostOrder Traversal: ");
            bt.traversePostOrder(bt.root);
            System.out.println("");
            System.out.println("Find Node : " + bt.find(5));
            System.out.println("Delete Node 8");
            bt.delete(8);
            System.out.println("");
            System.out.print("PreOrder Traversal :");
            bt.traversePreOrder(bt.root);
            System.out.println("");
        }
        
    }
```
### Output:
```
    PreOrder Traversal :  6 4 3 5 8 7 9 10 15
    InOrder Traversal:  3 4 5 6 7 8 9 10 15
    PostOrder Traversal:  3 5 4 7 15 10 9 8 6
    Find Node : true
    Delete Node 8

    PreOrder Traversal : 6 4 3 5 9 7 10 15
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 14 - TREE> 
```
## 13.2.2 Pertanyaan Percobaan
### 1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
### Jawaban: 
```
    Karena binary search tree memiliki aturan penempatan data sehingga memudahkan pencarian secara logaritmik (lebih cepat dibandingkan pencarian linear di binary tree biasa).
```
### 2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
### Jawaban:
```
    Atribut left dan right digunakan untuk menunjuk ke anak kiri dan kanan dari node, membentuk struktur tree.
```
### 3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
### Jawaban:
```
    Atribut root digunakan sebagai titik awal untuk semua operasi tree seperti pencarian, penambahan, dan penghapusan node.
```
### b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
### Jawaban:
```
    Nilai dari root adalah null.
```
### 4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
### Jawaban:
```
    Node baru tersebut akan menjadi root dari tree.
```
### 5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
```java
    if(data<current.data){
        if(current.left!=null){
            current = current.left;
        }else{
            current.left = new Node(data);
            break;
        }
    }
```
### Jawaban:
```
    Baris program ini memeriksa apakah data baru lebih kecil dari data node saat ini. Jika iya, dan anak kiri node saat ini tidak null, maka pindah ke anak kiri. Jika anak kiri null, buat node baru sebagai anak kiri dan hentikan loop.
```

## 13.3 Kegiatan Praktikum 2
## Implementasi Binary tree dengan Array
## 13.3.1 Tahapan Percobaan
### Class BinaryTreeArray03
```java
    public class BinaryTreeArray03 {
        int[] data;
        int idxLast;

        public BinaryTreeArray03(){
            data = new int[10];
        }

        void populateData(int data[], int idxLast){
            this.data = data;
            this.idxLast = idxLast;
        }

        void traverseInOrder(int idxStart){
            if(idxStart <= idxLast){
                traverseInOrder(2*idxStart+1);
                System.out.print(data[idxStart]+ " ");
                traverseInOrder(2*idxStart+2);
            }
        }
    }
```
### Class BinaryTreeArrayMain03
```java
    public class BinaryTreeArrayMain03 {
        public static void main(String[] args) {
            BinaryTreeArray03 bta = new BinaryTreeArray03();
            int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
            int idxLast = 6;
            bta.populateData(data, idxLast);
            System.out.print("\nInOrder Tranversal: ");
            bta.traverseInOrder(0);
            System.out.println("\n");
        }
    }
```
### Output:
```
    InOrder Tranversal: 3 4 5 6 7 8 9

    PS D:\algoritma-dan-struktur-data\PERTEMUAN 14 - TREE>
```
## 13.3.2 Pertanyaan Percobaan
### 1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
### Jawaban: 
```
    Atribut data menyimpan elemen-elemen tree dalam bentuk array, sedangkan idxLast menunjukkan indeks terakhir yang digunakan dalam array.
```
### 2. Apakah kegunaan dari method populateData()?
### Jawaban: 
```
    Method populateData() digunakan untuk mengisi array data dengan elemen-elemen tree dan mengatur nilai idxLast.
```
### 3. Apakah kegunaan dari method traverseInOrder()?
### Jawaban: 
```
    Method traverseInOrder() digunakan untuk melakukan traversal inorder pada binary tree yang disimpan dalam array.
```
### 4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
### Jawaban: 
```
    Left child di indeks 5, right child di indeks 6.
```
### 5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
### Jawaban: 
```
    Statement tersebut mengatur idxLast untuk menunjukkan indeks terakhir yang digunakan dalam array untuk traversal atau operasi lainnya.
```
## 13.4 Tugas Praktikum
### 1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.
### Jawaban:
```java
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
```
### 2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.
### Jawaban:
```java
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
```
### 3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
### Jawaban:
```java
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
```

### 4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.
### Jawaban:
```java
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
```
### 5. Modifikasi class BinaryTreeArray, dan tambahkan : 
### -   method add(int data) untuk memasukan data ke dalam tree 
### Jawaban:
```java
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
```
### -   method traversePreOrder() dan traversePostOrder()
### Jawaban:
```java
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
```

### OUTPUT
```
    InOrder: 4 2 5 1 6 3 7 
    PreOrder: 1 2 4 5 3 6 7 
    PostOrder: 4 5 2 6 7 3 1 
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 14 - TREE> 
```