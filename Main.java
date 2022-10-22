package P5_ASS1_ASD;

public class Main { // Kelas utama
    public static void main(String[] args) {

        // Progam yang menerapkan struktur data linkedlist yang berisi integer
        // 1. Buat linkedlist kosong
        LinkedList<Integer> list = new LinkedList<Integer>();

        // 2. Tambahkan element ke dengan nilai 7
        list.addFirst(7);

        // 3. Tambahkan element dengan nilai 5 di depan linkedlist
        list.addFirst(5);

        // 4. Tambahkan element dengan nilai 8 di belakang linkedlist
        list.addLast(8);

        // 5. Tambahkan element yang sama dengan nilai sebelumnya di belakang linkedlist
        // (10)
        list.addLast(10);

        /*
         * 6. Tambahkan element yang sama dengan nilai penjumlahan semua element di
         * depan linkedlist
         */
        list.addFirst(list.get(0) + list.get(1) + list.get(2) + list.get(3));

        // 7. Hapus element pertama dari linkedlist
        list.removeFirst();

        // 8. Hapus element terakhir dari linkedlist
        list.removeLast();

        /*
         * 9. Setiap kali penambahan dan penghapusan element dari linkedlist, harus
         * menampilkan semua element dari linkedlist tersebut
         */
        list.display();

    }
}