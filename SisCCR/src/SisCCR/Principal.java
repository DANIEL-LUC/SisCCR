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

		}

	}

}
