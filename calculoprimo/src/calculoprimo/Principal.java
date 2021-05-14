package calculoprimo;

import javax.swing.JOptionPane;

public class Principal {
	
	private int n;
	private String nf;
	
	

	public Principal() {
		this(0, "");
		
	}



	public Principal(int n, String nf) {
		
		this.n = n;
		this.nf = nf;
	}
	
	


	public int getN() {
		return this.n;
	}



	public void setN(int n) {
		this.n = n;
	}
	

	public String getNf() {
		return nf;
	}



	public void setNf(String nf) {
		this.nf = nf;
	}



	public void Calcularprimo(){
	
	this.setN(Integer.parseInt((JOptionPane.showInputDialog(null,"digite o numero a ser calculado os numeros primos"))));
	
	for(int x = this.getN(); x >= 1; x-- ) {
		
	}

	}

}
