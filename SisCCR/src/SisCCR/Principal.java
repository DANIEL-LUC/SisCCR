package SisCCR;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String aux;
		String menu = " Selecione o item que deseja criar:"
				+ "\n 1 --> circulo "
				+ "\n 2 --> retangulo \n";
		
		aux = JOptionPane.showInputDialog(null, menu);
		
		switch (aux){
		case "1":
			String a;
			double raio;
			a = JOptionPane.showInputDialog(null, "Qual o raio ??");
			raio = Double.parseDouble(a);
			Circulo c = new Circulo (raio);
			JOptionPane.showMessageDialog(null, "A área do circulo eh: " + 
						c.area() +"cm2 \n e o perimetro eh "+ c.perimetro() +"cm" );
			
		case "2":
			double base;
			double largura;
			a = JOptionPane.showInputDialog(null, "Qual é a largura ??");
			largura = Double.parseDouble(a);
			a = JOptionPane.showInputDialog(null, "Qual é a base ??");
			base = Double.parseDouble(a);
			
			Retangulo r = new Retangulo (base, largura);
			JOptionPane.showMessageDialog(null, "A área do circulo eh: " + 
						r.area() +"cm2 \n e o perimetro eh "+ r.perimetro() +"cm" );
		}

	}

}
