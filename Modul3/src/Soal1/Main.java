package Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah dadu: ");
        int jumlahDadu1 = scanner.nextInt();
        
        if (jumlahDadu1 <= 0) {
            System.out.println("Jumlah dadu harus lebih dari 0."); 
        }
      
        LinkedList<Dadu> daduList = new LinkedList<>();
        for (int i = 1; i <= jumlahDadu1; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }
        int totalNilai = 0;
        for (Dadu dadu : daduList) {
            totalNilai += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}

