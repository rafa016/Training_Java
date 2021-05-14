package primeiro;

import javax.swing.JOptionPane;

public class Calculadora {//1classe
	public static void main(String[] args) {//2metodo
		int n1 = 0; int n2 = 0; int conta = 0; int result = 0;
		JOptionPane.showMessageDialog(null,"Esse programa serve para fazer as operações basicas de matemática.\n\n");
		
		conta = Integer.parseInt (JOptionPane.showInputDialog(null,"Selecione a operação que será feita através dos numeros:\n	"
				+ "1 - para soma\n	"
				+ "2 - para subtração\n	"
				+ "3 - para multiplicação\n	"
				+ "4 - para divisão."));
		n1 = Integer.parseInt (JOptionPane.showInputDialog(null,"Digite um numero:"));

		n2 = Integer.parseInt (JOptionPane.showInputDialog(null,"Digite outro numero:"));
		
		if( conta == 4){
			result = n1/n2;
			JOptionPane.showMessageDialog(null,"O resultado da divisão é: " + result);
		}
			else{
			if( conta == 3){
			result = n1*n2;
			JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: " + result);
		}
			else{
			if( conta == 2){
			result = n1-n2;
			JOptionPane.showMessageDialog(null,"O resultado da subtração é: " + result);
		}
			else{
			result = n1+n2;
			JOptionPane.showMessageDialog(null,"O resultado da soma é: " + result);}}};
	


		System.exit(0); 
		// TODO Auto-generated method stub
	}//2
}//1