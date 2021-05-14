package controle;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {//2 torna a classe executavel
		int tp = 0;
		Caixa cx = new Caixa();
		do{//3
			tp = Integer.parseInt(JOptionPane.showInputDialog(
					null, "\n1-Cadastrar\n2-Depositar\n3-Retirar\n4-Mostrar\n0-Sair"));//aqui define a váriável: tp
			switch(tp){//4
				case 1:
					cx.Cadastrar();
					break;
				case 2:
					cx.Depositar();
					break;
				case 3:
					cx.Retirar();
					break;
				case 4:
					cx.Mostrar();
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"opção inválida, escolha de 0 a 3.");
					break;
			}//4
		}while(tp!=0);//3
	}//2

}
