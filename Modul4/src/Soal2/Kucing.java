package Soal2;

public class Kucing extends HewanPeliharaan {
	private String warnaBulu;
	
	public Kucing (String n, String r, String w){
		super(n,r);
		this.warnaBulu = w;
		}
		
	@Override
	public void display() {
	    super.display(); 
	    System.out.println("Warna bulu kucing: " + warnaBulu);
	}
}

