package SisCCR;

public class Circulo {
	private double raio;
	

	public Circulo (double r) {
		this.raio = r;
		return;
	}
	
	public double area() {
		double a =   Math.PI * Math.pow(raio, 2);
		return   a ;
		
	}
	
	public double perimetro() {
		double a =  2 * Math.PI * raio;
		return   a ;
	}
}
