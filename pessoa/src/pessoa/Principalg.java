package pessoa;
import javax.swing.JOptionPane;
public class Principalg {
	public static void main(String[] args) {//2 torna a classe executavel
		int tp = 0;
		Pessoag pes = new Pessoag();
		do{//3
			tp = Integer.parseInt(JOptionPane.showInputDialog(
					null, "\n1-Cadastrar\n2-Listar\n3-Verificar\n0-Sair"));//aqui define a váriável: tp
			switch(tp){//4
				case 1:
					pes.Cad();
					break;
				case 2:
					pes.List();
					break;
				case 3:
					pes.Ver();
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"opção inválida, escolha de 0 a 2.");
					break;
			}//4
		}while(tp!=0);//3
	}//2

}//1