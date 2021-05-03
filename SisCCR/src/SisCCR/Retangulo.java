package SisCCR;

public class Retangulo {
	private double base;
	private double largura;
	
	public Retangulo(double b, double l) {
		this.base = b;
		this.largura = l;
		return;
	}

	public double area() {
		double a =   base * largura;
		return   a ;
		
	}
	
	public double perimetro() {
		double a =   2* (base + largura);
		return   a ;
		
	} 
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
}
