package Soal1;

public class HewanPeliharaan {
	private String Nama, Ras;
	
	public HewanPeliharaan(String n, String r){
		this.Nama = n;
		this.Ras = r;
	}
	
	public void display() {
		System.out.println("Nama Hewan Peliharaanku adalah:" + Nama);
		System.out.println("Dengan ras:" + Ras);
	}
}

