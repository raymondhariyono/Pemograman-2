package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");

        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Warna Bulu: ");
                String warnaBulu = scanner.nextLine();
                Kucing kucing = new Kucing(nama, ras, warnaBulu);
                kucing.display();

            } else {
            	System.out.print("Warna Bulu: ");
                String warnaBulu = scanner.nextLine();

                System.out.print("Masukkan kemampuan: ");
                String kemampuanInput = scanner.nextLine(); // Input satu baris
                String[] kemampuan = kemampuanInput.split(",\\s*"); // Pisahkan berdasarkan koma

                // Inisialisasi objek Anjing dengan konstruktor
                Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
                anjing.display(); // Menampilkan detail anjing
                }
        } else {
            System.out.println("Pilihan Tidak Valid.");
        }
        scanner.close();
    }
}
