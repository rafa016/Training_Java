package salcalc;

import javax.swing.JOptionPane;

public class PrincipalG {

	public static void main(String[] args) {
		int op;
		SalcalcVG cx = new SalcalcVG();
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					null, "1-Cadastrar1\n2-Calcular2\n3-Listar",1));
			switch(op) {//5
			case 1:
				cx.Listar();;
				break;
			case 2:
				cx.Listar();;
				break;
			case 3:
				cx.Listar();
				break;
			case 4:
		}while(op!=0);
	}while(op!= 1);

}
}