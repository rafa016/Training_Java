package cpf;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cpf cpf = new Cpf();
		int op = 0;
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "1- testar cpf\n2- gerar cpf"));
		switch(op) {
		case 1:
			cpf.Cadastrar();
			cpf.Calcular();
			cpf.Comparar();
			break;
		case 2:
			cpf.Gerar();
			cpf.Calcular();
			cpf.Mostrar();
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digite o numero certo");
		}
	}

}
