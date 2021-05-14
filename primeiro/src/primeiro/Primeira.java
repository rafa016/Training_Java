package primeiro;
import javax.swing.JOptionPane;
public class Primeira {//1classe
	public static void main(String[] args) {//2metodo
		double soma;
		double num1 = 0; double num2 = 0;

		num1 = Double.parseDouble (JOptionPane.showInputDialog(null,"Digite um numero:"));

		num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro numero:"));

		soma = num1 + num2; JOptionPane.showMessageDialog(null,"A soma dos numeros e: " + soma);
		System.exit(0); 
		// TODO Auto-generated method stub
	}//2
}//1