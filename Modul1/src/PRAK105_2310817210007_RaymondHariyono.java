import java.util.Scanner;
public class PRAK105_2310817210007_RaymondHariyono {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			final double phi = 3.14;
			
			System.out.print("masukkan jari-jari: ");
			float jariJari  = input.nextFloat();
			
			System.out.print("masukkan tinggi: ");
			float tinggi = input.nextFloat();
			
			double volume = phi * jariJari * jariJari * tinggi;
			
			 System.out.printf("Volume tabung dengan jari jari %.1f dan tinggi %.1f adalah: %.3f m3",jariJari,tinggi, volume);
		}
	}

}
