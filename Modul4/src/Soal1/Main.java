package Soal1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();
        
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        scanner.close();
        
        HewanPeliharaan hewan = new HewanPeliharaan(nama, ras);
        hewan.display();  
	}

}
