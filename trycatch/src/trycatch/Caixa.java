package trycatch;
import javax.swing.JOptionPane;
public class Caixa {
	private double saldo;
	
	public Caixa() {
		this(0d);
	}
	public Caixa(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Entrar() {
		try {//trata erro caso usuario digite algo dif números
			this.setSaldo(this.getSaldo() + Double.parseDouble(
					JOptionPane.showInputDialog(null,
					"Digite o valor da entrada:")));
		}catch(NumberFormatException erro){//captura erro
			//Apresenta mensagem personalizada
			JOptionPane.showMessageDialog(null,
					"Digite apenas números","Tipo inválido",0);	
		}finally {
			JOptionPane.showMessageDialog(null,
					"Mensagem do Finally do método entrada",
					"Finally - por aqui sempre passa",0);
		}
	}
	
	public void Retirar() {
		try {//trata erro caso usuario digite algo dif números
			this.setSaldo(this.getSaldo() - Double.parseDouble(
					JOptionPane.showInputDialog(null,
					"Digite o valor da retirada:")));
		}catch(NumberFormatException erro){//captura erro
			//Apresenta mensagem personalizada
			JOptionPane.showMessageDialog(null,
					"Digite apenas números","Tipo inválido",0);	
		}finally {
			JOptionPane.showMessageDialog(null,
					"Mensagem do Finally do método entrada",
					"Finally - por aqui sempre passa",0);
		}
	}
}