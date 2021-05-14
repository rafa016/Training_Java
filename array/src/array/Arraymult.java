package array;

import javax.swing.JOptionPane;

public class Arraymult {
	int linha;
	int coluna;
	String[] [] pessoas;
	String nomealt;

	public Arraymult() {

	}



	public Arraymult(int a, String[][] pessoas, String nomealt, int coluna, int linha) {
		this.coluna = coluna;
		this.linha = linha;
		this.pessoas = pessoas;
		this.nomealt = nomealt;
	}



	public int getColuna() {
		return coluna;
	}



	public void setColuna(int coluna) {
		this.coluna = coluna;
	}



	public String[][] getPessoas() {
		return pessoas;
	}



	public void setPessoas(String[][] pessoas) {
		this.pessoas = pessoas;
	}



	public int getLinha() {
		return this.linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}


	public String getNomealt() {
		return nomealt;
	}

	public void setNomealt(String nomealt) {
		this.nomealt = nomealt;
	}

	public void Cadastrar(){
		this.setColuna(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as colunas da tabela")));
		this.setLinha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de linhas")));
		this.pessoas = new String[coluna][linha];
		for(int j = 0; j < pessoas.length; j++) { 
			for(int i = 0; i < pessoas.length; i++) {
				switch(i) {

				case 0:
					this.pessoas[j] [i]= JOptionPane.showInputDialog(null, "Digite o nome da pessoa");
					break;
				case 1:
					this.pessoas[j] [i]= JOptionPane.showInputDialog(null, "Digite a idade da pessoa");
					break;
				case 2:
					this.pessoas[j] [i]= JOptionPane.showInputDialog(null, "Digite genero da pessoa");
					break;
				default:
				}
			}
		}
	}
	public void Listar(){

		JOptionPane.showMessageDialog(null, pessoas);


	}
	public void Alterar(){

		this.setNomealt(JOptionPane.showInputDialog(null, "Digite o campo a ser mudado"));
		for(int k = 0; k < pessoas.length; k++){
			for(int b = 0; b < pessoas.length; b++) {
				if(this.getNomealt().equals(pessoas[k][b])) {
					this.pessoas[k][b] = JOptionPane.showInputDialog(null, "Digite o novo campo da pessoa");
				}

			}
		}

	}

}
