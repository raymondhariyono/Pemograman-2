import java.util.Scanner;
public class PRAK104_2310817210007_RaymondHariyono {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        
		        // Input tangan Abu untuk 3 ronde
		        System.out.print("Tangan Abu : ");
		        String abuRonde1 = input.next();
		        String abuRonde2 = input.next();
		        String abuRonde3 = input.next();
		        
		        // Input tangan Bagas untuk 3 ronde
		        System.out.print("Tangan Bagas : ");
		        String bagasRonde1 = input.next();
		        String bagasRonde2 = input.next();
		        String bagasRonde3 = input.next();
		        
		        // Deklarasi variabel untuk menghitung skor
		        int skorAbu = 0;
		        int skorBagas = 0;

		     // Ronde 1
		        if (abuRonde1.equals(bagasRonde1)) {
		        } else if ((abuRonde1.equals("G") && bagasRonde1.equals("K")) ||
		                   (abuRonde1.equals("B") && bagasRonde1.equals("G")) ||
		                   (abuRonde1.equals("K") && bagasRonde1.equals("B"))) {
		            skorAbu++;
		        } else if ((bagasRonde1.equals("G") && abuRonde1.equals("K")) ||
		                   (bagasRonde1.equals("B") && abuRonde1.equals("G")) ||
		                   (bagasRonde1.equals("K") && abuRonde1.equals("B"))) {
		            skorBagas++;
		        } else {
		            System.out.println("Inputan Salah");
		        }

		        // Ronde 2
		        if (abuRonde2.equals(bagasRonde2)) {
		        } else if ((abuRonde2.equals("G") && bagasRonde2.equals("K")) ||
		                   (abuRonde2.equals("B") && bagasRonde2.equals("G")) ||
		                   (abuRonde2.equals("K") && bagasRonde2.equals("B"))) {
		            skorAbu++;
		        } else if ((bagasRonde2.equals("G") && abuRonde2.equals("K")) ||
		                   (bagasRonde2.equals("B") && abuRonde2.equals("G")) ||
		                   (bagasRonde2.equals("K") && abuRonde2.equals("B"))) {
		            skorBagas++;
		        } else {
		            System.out.println("Inputan Salah");
		        }

		        // Ronde 3
		        if (abuRonde3.equals(bagasRonde3)) {
		        } else if ((abuRonde3.equals("G") && bagasRonde3.equals("K")) ||
		                   (abuRonde3.equals("B") && bagasRonde3.equals("G")) ||
		                   (abuRonde3.equals("K") && bagasRonde3.equals("B"))) {
		            skorAbu++;
		        } else if ((bagasRonde3.equals("G") && abuRonde3.equals("K")) ||
		                   (bagasRonde3.equals("B") && abuRonde3.equals("G")) ||
		                   (bagasRonde3.equals("K") && abuRonde3.equals("B"))) {
		            skorBagas++;
		        } else {
		            System.out.println("Inputan Salah");
		        }
		        
		        if (skorAbu > skorBagas) {
		            System.out.println("Pemenang: Abu");
		        } else if (skorBagas > skorAbu) {
		            System.out.println("Pemenang: Bagas");
		        } else {
		            System.out.println("Hasil Akhir: Seri");
		        }
		        input.close();

		    }
		}



