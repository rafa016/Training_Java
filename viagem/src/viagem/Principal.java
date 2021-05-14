package viagem;
import javax.swing.JOptionPane;
import viagem.Percurso;

public class Principal {//1
	public static void main(String[] args) {//2
		int tp;
		Percurso percurso = new Percurso();
		Custos custo = new Custos();
	
	do{//3
	   tp = Integer.parseInt(JOptionPane.showInputDialog(
			null, "\n1-Cadastrar\n2-Listar\n3-Calcular\n0-Sair\nDigite uma opção: "));
	
		switch(tp){//4
	case 1:		
		percurso.Cad();
		custo.Calc(percurso);
		break;
	case 2:
		percurso.List();
		break;
	case 3:
		percurso.Calc();
		custo.Calc(percurso);
		JOptionPane.showMessageDialog(null, "O total gasto na viagem foi de: R$"+custo.getTot());
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

	}//2
}//1
