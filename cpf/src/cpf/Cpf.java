package cpf;
import javax.swing.JOptionPane;
import java.util.Random;
public class Cpf {
	Random gerador = new Random();
	int a, soma;
	String cpf, j, cpfint, k;
	public Cpf() {
	}
	public Cpf(int a) {
		this.a = a;
	}
	public int getA() {
		return this.a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public String getJ() {
		return j;
	}
	public void setJ(String j) {
		this.j = j;
	}
	public String getCpfint() {
		return cpfint;
	}
	public void setCpfint(String cpfint) {
		this.cpfint = cpfint;
	}
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public void Cadastrar() {
		this.setCpfint(JOptionPane.showInputDialog(null, "digite o cpf", null, 1));
	}
	public void Calcular() {
		this.setCpf(this.getCpfint().substring(0,10));
		int y = 0;
		do {
			for(int x = 0; x < cpf.length(); x++) {
				this.setA(Integer.parseInt(this.getCpf().substring(x, x+1)));
				this.setSoma(this.getSoma() + this.getA() * (cpf.length()+1 - x) );
			}
			this.setSoma(this.getSoma() % 11);
			if (this.getSoma() == 1 || this.getSoma() == 0) {
				this.setSoma(0);
			}else {
				this.setSoma(11-this.getSoma());
			}
			this.setJ(Integer.toString(this.getSoma()));
			this.setCpf(this.getCpf() + this.getJ());
			y++;
		}while(y<1);
	}
	public void Comparar() {
		if (this.getCpfint().equals(this.getCpf())) {
			JOptionPane.showMessageDialog(null, "CPF Válido", null, 1);
		}else {
			JOptionPane.showMessageDialog(null, "CPF Digitado Inválido\nCPF Válido: " + this.getCpf() , null, 0);
		}

	}
	public void Gerar() {
		this.setCpfint(Integer.toString(gerador.nextInt(9)));
		for (int i = 0; i < 10; i++) {
			this.setCpfint(this.getCpfint() + Integer.toString(gerador.nextInt(9)));
		}	
		
	
	
	}
	public void Mostrar() {
		JOptionPane.showMessageDialog(null, this.getCpf());
	}
}







