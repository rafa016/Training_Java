package bissexto;

import javax.swing.JOptionPane;

public class AnoBissexto {

	public static void main(String[] args) {
		int ano;
		do {
		ano = Integer.parseInt(JOptionPane.showInputDialog(
				null, "Digite o ano"));	


		if(ano%400 == 0) {

			JOptionPane.showMessageDialog(
					null, "� bissexto");


		}
		else if(ano%100 == 0){

			JOptionPane.showMessageDialog(
					null, "N�o � bissexto");

		}
		else if(ano%4 == 0){
			JOptionPane.showMessageDialog(
					null, "� bissexto");
		}
		else {
			JOptionPane.showMessageDialog(
					null, "N�o � bissexto");
		}


		}while(ano != 0);

	}




}






