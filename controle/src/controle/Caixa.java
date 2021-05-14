package controle;
import javax.swing.JOptionPane;
public class Caixa {//1
	private double saldo;
	private String nome;
	private int nc;
	public Caixa() {
		this(0d, "", 0);
	}
	public Caixa(double saldo, String nome, int nc) {
		this.saldo = saldo;
		this.nome = nome;
		this.nc = nc;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	public void Cadastrar(){// Metodo cadastrar
		this.setNome(JOptionPane.showInputDialog(null,
				"digite seu nome: ", "Cadastro", 3));
		this.setNc(Integer.parseInt(JOptionPane.showInputDialog(null,
				"digite o numero da sua conta: ", "cadastro", 3)));
	}//	
	public void Depositar(){
		double valor1;
		valor1 = this.saldo;
		this.setSaldo(this.getSaldo() + Double.parseDouble(
			JOptionPane.showInputDialog(null, "Digite  valor a ser depositado: ", "Deposito", 3)));
		JOptionPane.showMessageDialog(null, "Saldo anterior: " + valor1 + "\n\nSaldo atual: " + this.getSaldo());
	}
	
	public void Retirar(){
		double valor2;
		valor2 = this.saldo;
		this.setSaldo(this.getSaldo() - Double.parseDouble(
			JOptionPane.showInputDialog(null, "Digite  valor a ser retirado: ", "Saque", 3)));
		JOptionPane.showMessageDialog(null, "Saldo anterior: " + valor2 + "\n\nSaldo atual: " + this.getSaldo());
	}
	
	public void Mostrar(){//10 metodo exibir
		JOptionPane.showMessageDialog(null,
		"nome: " + this.getNome() + 
		"\nnc: " + this.getNc() +
		"\nsaldo: " + this.getSaldo());
	}//10
}//1
