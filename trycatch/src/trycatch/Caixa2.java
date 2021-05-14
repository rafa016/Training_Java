package trycatch;
import javax.swing.JOptionPane;
public class Caixa2 {
	private double saldo;
	
	public Caixa2() {
		this(0d);
	}
	public Caixa2(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Trata o erro caso o usuário digite algo diferente de números
	public void Entrar() {
		try {//trata erro caso usuario digite algo dif números
			this.setSaldo(this.getSaldo() + Double.parseDouble(
					JOptionPane.showInputDialog(null,
					"Digite o valor da entrada:")));
			/*Se usuário digitar letra ou caract especial o Java irá 
			 * gerar um erro de tipo de dado inválido*/
		}catch(NumberFormatException erro){//captura erro
			//Apresenta mensagem personalizada
			JOptionPane.showMessageDialog(null,
					"Digite apenas números","Tipo inválido",0);	
			//Apres msg gerada exception NumberFormatException
			JOptionPane.showMessageDialog(null,erro.getMessage());
			//recupera a lsitagem da pilha de erro gerada
			JOptionPane.showMessageDialog(
					null, erro.getStackTrace());
			//Apresenta console a lsitagem de pilha de erro gerada
			erro.printStackTrace();
		}finally {
			JOptionPane.showMessageDialog(null,
					"Mensagem do Finally do método entrada",
					"Finally - por aqui sempre passa",0);
		}
	}
}