package trycatch;
import javax.swing.JOptionPane;
public class Principal {//1
	public static void main(String[] args) {//2
	Caixa cx = new Caixa();
	Caixa2 cx2 = new Caixa2();
	Caixa3 cx3 = new Caixa3();
	Caixa4 cx4 = new Caixa4();
	int op;
	do {//3
		try {//4
			op=Integer.parseInt(JOptionPane.showInputDialog(
					null, "1-caixa1\n2-caixa2\n3-caixa"
						+ "3\n4-caixa4\n0-Sair", "digite:",1));
			switch(op) {//5
			case 1:
				cx.Entrar();
				break;
			case 2:
				cx2.Entrar();
				break;
			case 3:
				cx3.Entrar();
				break;
			case 4:
				try {//6
					cx4.Entrar();
				}catch(Zero erro) {
					JOptionPane.showMessageDialog(null,
							erro,"Erro zero!",0);
				}catch(Negativo erro) {
					JOptionPane.showMessageDialog(null,
							erro,"Erro negativo!",0);
				}//6
				break;
			case 0:
				JOptionPane.showMessageDialog(null,
						"fim","the end",0);
				break;
				//case 99:
				
				//break;
				default:
					JOptionPane.showMessageDialog(null,
							"Opção Inválida","erro",0);
					break;
				}//5
			}catch(NumberFormatException erro) {
				op = 99;
				JOptionPane.showMessageDialog(null,
						"Digite apenas números", "opção", 0);
			}//4
		}while(op!=0);
	}//2
}//1