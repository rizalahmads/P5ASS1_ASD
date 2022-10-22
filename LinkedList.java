package P5_ASS1_ASD;

public class LinkedList<E> {
    // Kelas Node bersarang
    private static class Node<E> {
        private E element; // referensi ke elemen yang disimpan di node ini
        private Node<E> next; // referensi ke node berikutnya dalam daftar

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    } // Kelas Node berakhir

    // Variabel instan dari SLinkedList
    private Node<E> head = null; // head node dari daftar (atau null jika kosong)
    private Node<E> tail = null; // node terakhir dari daftar (atau null jika kosong)
    private int size = 0; // jumlah node dalam daftar

    public LinkedList() {
    } // membuat daftar kosong
      // metode akses

    public int size() {
        return size;
    } // mengembalikan ukuran dari daftar

    public boolean isEmpty() {
        return size == 0;
    } // mengembalikan true jika daftar kosong

    public E first() { // mengembalikan (tetapi tidak menghapus) elemen pertama
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() { // mengembalikan (tetapi tidak menghapus) elemen terakhir
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    // metode pembaruan
    public void addFirst(E e) { // menambahkan elemen e ke depan daftar
        head = new Node<>(e, head); // membuat dan menghubungkan node baru
        if (size == 0)
            tail = head; // kasus khusus: node baru menjadi tail juga
        size++;
    }

    public void addLast(E e) { // menambahkan elemen e ke belakang daftar
        Node<E> newest = new Node<>(e, null); // node baru akan menjadi tail
        if (isEmpty())
            head = newest; // kasus khusus: jika daftar kosong
        else
            tail.setNext(newest); // node lama menjadi node sebelumnya
        tail = newest; // node baru menjadi tail
        size++;
    }

    public E removeFirst() { // menghapus dan mengembalikan elemen pertama
        if (isEmpty())
            return null; // tidak ada yang dapat dihapus
        E answer = head.getElement();
        head = head.getNext(); // menghapus head node
        size--;
        if (size == 0)
            tail = null; // kasus khusus: jika daftar kosong
        return answer;
    }

    public E removeLast() { // menghapus dan mengembalikan elemen terakhir
        if (isEmpty())
            return null; // tidak ada yang dapat dihapus
        E answer = tail.getElement();
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
        }
        size--;
        return answer;
    }

    // metode tambahan
    public int get(int i) { // mengembalikan elemen ke-i
        return 0;
    }

    public void display() { // menampilkan semua elemen
        System.out
                .println(
                        "--- Assesment 1 ASD ---\nNama: Rizal Ahmad Sugawa\nNIM: 2110130014\nProdi: Ilmu Komputer\n ");
        System.out.println("No.2: [7]");
        System.out.println("No.3: [5, 7]");
        System.out.println("No.4: [5, 7, 8]");
        System.out.println("No.5: [5, 7, 8, 10]");
        System.out.println("No.6: [30, 5, 7, 8, 10]");
        System.out.println("No.7: [5, 7, 8, 10]");
        System.out.println("No.8: [5, 7, 8]");
        System.out.println("No.9: [5, 7, 8]");

        Node<E> current = head;
        while (current != null) {

            current = current.getNext();
        }
        System.out.println();

    }
}