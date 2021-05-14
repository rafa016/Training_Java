package bissexto;

import javax.swing.JOptionPane;

public class AnoBissextov2 {

	public static void main(String[] args) {
		int ano;
		do {
		ano = Integer.parseInt(JOptionPane.showInputDialog(
				null, "Digite o ano"));	


		if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {

			JOptionPane.showMessageDialog(
					null, "é bissexto");


		}
		else {
			JOptionPane.showMessageDialog(
					null, "Não 7é bissexto");
		}
		}while(ano != 0);

	}




}



