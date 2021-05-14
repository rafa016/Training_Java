package trycatch;
import javax.swing.JOptionPane;
public class Caixa3 {
	private double saldo;
	
	public Caixa3() {
		this(0d);
	}
	public Caixa3(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Entrar() {
		try {//trata erro caso usuario digite algo dif n�meros
			double valor = Double.parseDouble(
					JOptionPane.showInputDialog(null,
					"Digite o valor da entrada:"));
			if (valor == 0 || valor < 0) {
				throw new IllegalArgumentException();
			}
			this.setSaldo(this.getSaldo() + valor);
		}catch(NumberFormatException erro){//captura erro
			//Apresenta mensagem personalizada
			JOptionPane.showMessageDialog(null,
					"Digite apenas n�meros","Tipo inv�lido",0);	
		}catch(IllegalArgumentException erro){
			JOptionPane.showMessageDialog(null,
				"A movimenta��o n�ao pode ter zero nem negativo!",
				"Tipo inv�lido",0);
		}
		finally {
			JOptionPane.showMessageDialog(null,
					"saldo: "+this.getSaldo(),
					"Finally - por aqui sempre passa",0);
		}
	}
}