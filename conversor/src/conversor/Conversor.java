package conversor;
import javax.swing.JOptionPane;
public class Conversor {//1
	public static void main(String[] args) {//2
	double r;
	double d;
	int tp;
	double cd;
	
	do{//3
		   tp = Integer.parseInt(JOptionPane.showInputDialog(
				null, "\n1-Real para dolar\n2-Dollar para real\n0-Sair\nDigite uma opção: "));
		   cd = 3.72;
			switch(tp){//4
		case 1:		
			float rq;
			rq = Float.parseFloat(JOptionPane.showInputDialog(
					null, "\n1-Insira o valor a ser convertido: ","Valor",3));
			d = rq / cd;
			JOptionPane.showMessageDialog(null, "Seus R$" +rq+"\nValem U$"+d);
			break;
		case 2:
			float dq;
			dq = Float.parseFloat(JOptionPane.showInputDialog(
					null, "\n1-Insira o valor a ser convertido: ","Valor",3));
			r = dq * cd;
			JOptionPane.showMessageDialog(null, "Seus R$" +dq+"\nValem U$"+r);
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Flws!");
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"opção inválida, escolha de 0 a 3.");
			break;
	}//4
			}while(tp!=0);//3

	}
}