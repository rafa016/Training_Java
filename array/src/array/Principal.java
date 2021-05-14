package array;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Array array = new Array();
		Arraymult arraymult = new Arraymult();
		int tp;
		
		do{//3
			tp = Integer.parseInt(JOptionPane.showInputDialog(
					null, "\n1-Cadastrar\n2-Alterar\n3-Listar\n0-Sair"));
			switch(tp){//4
				
				case 1:
					arraymult.Cadastrar();
					
					break;
				case 2:
					arraymult.Alterar();
					break;
				case 3:
					arraymult.Listar();
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"opção inválida, escolha de 0 a 3.");
					break;
			}//4
		}while(tp!=0);//3
	}

}
