package Soal1;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder"); 
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
    	return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return super.toString() +", Radius: " + radius + ", Height: " + height;
    }
}
