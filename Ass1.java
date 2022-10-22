package P5_ASS1_ASD;

import java.util.LinkedList;

public class Ass1 { // Kelas utama
    public static void main(String[] args) {

        // Program yang menerapkan struktur data linkedlist yang berisi integer
        // 1. Buat linkedlist kosong
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("--- Assessment 1 ---\nNama: Rizal Ahmad Sugawa\nNIM: 2110130014\nProdi: Ilmu Komputer\n");

        // 2. Tambahkan element dengan nilai 7
        list.add(7);
        System.out.println("No.2: " + list);

        // 3. Tambahkan element dengan nilai 5 di depan linkedlist
        list.addFirst(5);
        System.out.println("No.3: " + list);

        // 4. Tambahkan element dengan nilai 8 di belakang linkedlist
        list.addLast(8);
        System.out.println("No.4: " + list);

        /*
         * 5. Tambahkan element yang sama dengan nilai sebelumnya di belakang
         * linkedlist (nilai dari soal 10)
         */
        list.addLast(10);
        System.out.println("No.5: " + list);

        /*
         * 6. Tambahkan element yang sama dengan nilai penjumlahan semua element di
         * depan linkedlist
         */
        list.addFirst(list.get(0) + list.get(1) + list.get(2) + list.get(3));
        System.out.println("No.6: " + list);

        // 7. Hapus element pertama dari linkedlist
        list.removeFirst();
        System.out.println("No.7: " + list);

        // 8. Hapus element terakhir dari linkedlist
        list.removeLast();
        System.out.println("No.8: " + list);

        /*
         * 9. Setiap kali penambahan dan penghapusan element dari linkedlist, harus
         * menampilkan semua element dari linkedlist tersebut
         */
        System.out.println("No.9: " + list);

    }

}
