package Soal1;

public class Paint {
    private double coverage; 

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        double area = s.area(); 
        System.out.println ("Computing amount for " + s);
        return area / coverage;
    }
}
