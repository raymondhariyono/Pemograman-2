class  Buah{
    String nama;
    double hargaSatuan;
    double berat;

public Buah(String nama, double hargaSatuan, double berat) {
    this.nama = nama;
    this.hargaSatuan = hargaSatuan;
    this.berat = berat;
}

public double hargaTotal(){ 
    return hargaSatuan * berat;
}

public double hitungDiskon(){
    int kelipatanDiskon = (int) berat /4;
    return  kelipatanDiskon *   0.02 * hargaTotal();
}

public double hargaSetelahDiskon(){
    return hargaTotal() - hitungDiskon();
}

public void tampilkanDetail() {
    System.out.println("Nama Buah: " + nama);
    System.out.println("Berat: " + berat + " kg");
    System.out.println("Harga per kg: Rp" + hargaSatuan);
    System.out.println("Total harga sebelum diskon: Rp" + hargaTotal());
    System.out.println("Total diskon: Rp" + hitungDiskon());
    System.out.println("Total harga setelah diskon: Rp" + hargaSetelahDiskon());
    System.out.println("");

}
}
public class Soal1Main {
    public static void main(String[] args) {
    Buah apel = new Buah("Apel", 17500, 4.0);
        Buah mangga = new Buah("Mangga", 17500, 4.0);
        Buah alpukat = new Buah("Alpukat", 40000, 4.0);
        
        apel.tampilkanDetail();
        mangga.tampilkanDetail();
        alpukat.tampilkanDetail();
    }
}