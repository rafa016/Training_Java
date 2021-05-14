package array;

import javax.swing.JOptionPane;

public class Array {
	int a;
	String[] pessoas;
	String nomealt;

	public Array() {
		
	}

	public Array(String[] pessoas, int a, String nomealt) {
		this.a = a;
		this.pessoas = pessoas;
		this.nomealt = nomealt;
	}

	

	public void setPessoas(String[] pessoas) {
		this.pessoas = pessoas;
	}

	public String[] getPessoas() {
		return this.pessoas;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

	public String getNomealt() {
		return nomealt;
	}

	public void setNomealt(String nomealt) {
		this.nomealt = nomealt;
	}

	public void Cadastrar(){
	
		this.setA(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de nomes")));
		this.pessoas = new String[a];
		for(int i = 0; i < pessoas.length; i++) {
			this.pessoas[i] = JOptionPane.showInputDialog(null, "Digite o nome da pessoa");
		}
	}
	public void Listar(){
		//for(int i = 0; i < pessoas.length; i++) {
		//	JOptionPane.showMessageDialog(null, pessoas[i]);
		//}
		JOptionPane.showMessageDialog(null, pessoas);
	
		
	}
	public void Alterar(){
		
		this.setNomealt(JOptionPane.showInputDialog(null, "Digite o nome a ser mudado"));
		for(int b = 0; b < pessoas.length; b++) {
			if(this.getNomealt().equals(pessoas[b])) {
				this.pessoas[b] = JOptionPane.showInputDialog(null, "Digite o novo nome da pessoa");
			}
			
		}
		
	}
	
	
	
	
}
