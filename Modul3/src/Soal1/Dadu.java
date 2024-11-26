	package Soal1;
	
	import java.util.Random;
	
	class Dadu {
	    private int nilai;
		private Random acak;
	    
	    public Dadu() {
	        acakNilai();  
	    }
	    
	    public void acakNilai() {
	    	acak = new Random();
			nilai = acak.nextInt(6) + 1;  
	    }
	
	    public int getNilai() {
	        return nilai;
	    }
	}
