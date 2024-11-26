package Soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();  

        if (jumlahNegara <= 0) {
            System.out.println("Jumlah negara harus lebih dari 0.");
        }

        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        // Mengambil input negara
        for (int i = 0; i < jumlahNegara; i++) {
            System.out.println("Masukkan nama negara ke-" + (i + 1) + ":");
            String nama = scanner.nextLine();

            System.out.println("Masukkan jenis kepemimpinan (monarki/presiden/perdana menteri):");
            String jenisKepemimpinan = scanner.nextLine().toLowerCase();
            while (!jenisKepemimpinan.equals("monarki") && !jenisKepemimpinan.equals("presiden") && !jenisKepemimpinan.equals("perdana menteri")) {
                System.out.println("Jenis kepemimpinan tidak valid. Masukkan kembali (monarki/presiden/perdana menteri):");
                jenisKepemimpinan = scanner.nextLine().toLowerCase();
            }

            System.out.println("Masukkan nama pemimpin:");
            String namaPemimpin = scanner.nextLine();

            int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equals("monarki")) {
                System.out.println("Masukkan tanggal kemerdekaan:");
                tanggalKemerdekaan = scanner.nextInt();
                System.out.println("Masukkan bulan kemerdekaan:");
                bulanKemerdekaan = scanner.nextInt();
                System.out.println("Masukkan tahun kemerdekaan:");
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine();  

               
                if (bulanKemerdekaan < 1 || bulanKemerdekaan > 12) {
                    System.out.println("Bulan kemerdekaan tidak valid. Program akan berhenti.");
                    return;  
                }
                
           
                switch (bulanKemerdekaan) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        if (tanggalKemerdekaan < 1 || tanggalKemerdekaan > 31) {
                            System.out.println("Tanggal kemerdekaan tidak valid. Program akan berhenti.");
                            scanner.close();
                            return;  
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        if (tanggalKemerdekaan < 1 || tanggalKemerdekaan > 30) {
                            System.out.println("Tanggal kemerdekaan tidak valid. Program akan berhenti.");
                            scanner.close();
                            return;  
                        }
                        break;
                    case 2:
                        if (tahunKemerdekaan % 4 == 0) {  
                            if (tanggalKemerdekaan < 1 || tanggalKemerdekaan > 29) {
                                System.out.println("Tanggal kemerdekaan tidak valid. Program akan berhenti.");
                                scanner.close();
                                return; 
                            }
                        } else {
                            if (tanggalKemerdekaan < 1 || tanggalKemerdekaan > 28) {
                                System.out.println("Tanggal kemerdekaan tidak valid. Program akan berhenti.");
                                scanner.close();
                                return; 
                            }
                        }
                        break;
                }
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " +
                    (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" :
                            (negara.getJenisKepemimpinan().equals("presiden") ? "Presiden" : "Perdana Menteri"))
                    + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + namaBulan.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            }
        }

    }
}
