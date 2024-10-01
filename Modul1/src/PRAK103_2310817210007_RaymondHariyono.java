import java.util.Scanner;
public class PRAK103_2310817210007_RaymondHariyono {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
	System.out.print("Masukkan angka: ");
	int deretAngka = input.nextInt();
	int angkaAwal = input.nextInt();
	input.close();
	
	int hitung = 0;
	int bilangan = angkaAwal;
	do {
		if (bilangan % 2 != 0) {
			System.out.print(bilangan);
			hitung++;
			if (hitung < deretAngka) {
				System.out.print(", ");
			}
		}
		bilangan++;
	}while (hitung < deretAngka);
	
	}

}
