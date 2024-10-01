import java.util.Scanner;

public class PRAK101_2310817210007_RaymondHariyono {

	public static void main(String[] args) {
	       Scanner Input = new Scanner (System.in);
	        
	        System.out.print("Masukkan nama lengkap anda: ");
	        String namaLengkap = Input.nextLine();
	        
	        System.out.print("Masukkan tempat lahir anda: ");
	        String tempatLahir = Input.nextLine();

	        System.out.print("Masukkan tanggal lahir anda: ");
	        int tanggalLahir = Input.nextInt();
	        
	        System.out.print("Masukkan bulan lahir anda: ");
	        int bulanLahir = Input.nextInt();
	        
	        System.out.print("Masukkan tahun lahir anda: ");
	        int tahunLahir = Input.nextInt();
	        
	        System.out.print("Masukkan tinggi anda: ");
	        int tinggiBadan = Input.nextInt();
	        
	        System.out.print("Masukkan berat badan anda: ");
	        float beratBadan = Input.nextFloat();

	        String[] bulan = {
	            "", "Januari", "Februari", "Maret", "April", "Mei", 
	            "Juni", "Juli", "Agustus", "September", "Oktober", 
	            "November", "Desember"
	        };
	        
	        String bulanLahirString = (bulanLahir >= 1 && bulanLahir <= 12) ? bulan[bulanLahir] : "bulan tidak valid";
	        System.out.print("Nama lengkap " + namaLengkap + " lahir di " + tempatLahir + 
	        " pada Tanggal " + tanggalLahir + " " + bulanLahirString + 
	        " " + tahunLahir + " tinggi badan " + tinggiBadan + 
	        " cm dan berat badan " + beratBadan + " kilogram.");
	        Input.close(); 

	}

}
