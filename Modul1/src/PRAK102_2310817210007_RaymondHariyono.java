import java.util.Scanner;

public class PRAK102_2310817210007_RaymondHariyono {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        input.close();

        int angkaAwal = 0;
        int deretAngka = angka;

        while (angkaAwal <= 10) {
            if (deretAngka % 5 == 0) {
                System.out.print((deretAngka / 5) - 1);
            } else {
                System.out.print(deretAngka);
            }
            
            if (angkaAwal < 10) {
                System.out.print(", ");
            }

            deretAngka++; 
            angkaAwal++; 
        }

        System.out.println();
    }
}
