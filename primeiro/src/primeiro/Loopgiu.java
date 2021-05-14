package primeiro;

import javax.swing.JOptionPane;

public class Loopgiu {

	public static void main(String[] args) {
		int op;
		int tot=0, num1, num2;
		do{//3 explicar src bin
			op = Integer.parseInt(JOptionPane.showInputDialog(
					null, "digite sua escolha:\n1 +\n2 -\n3 *"
							+ "\n4 /\n0 sair"));
			switch(op){//4
			case 1:
				num1 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 1"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 2"));
				tot = num1 + num2;
				JOptionPane.showMessageDialog(null,
						"Resultado: " + tot);
				break;
			case 2:
				num1 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 1"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 2"));
				tot = num1 - num2;
				JOptionPane.showMessageDialog(null,
						"Resultado: " + tot);
				break;
			case 3:
				num1 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 1"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 2"));
				tot = num1 * num2;
				JOptionPane.showMessageDialog(null,
						"Resultado: " + tot);
				break;
			case 4:
				num1 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 1"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog(
						null, "digite numero 2"));
				tot = num1 / num2;
				JOptionPane.showMessageDialog(null,
						"Resultado: " + tot);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"opcao invalida - escolha de 0 a 4");
				break;
			}//4
		}while(op!=0);//3			
	}//2	
}//1
