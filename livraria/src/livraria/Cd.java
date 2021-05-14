package livraria;

import javax.swing.JOptionPane;

public class Cd extends Produto {
	private String autor;
	private String editora;
	private String edicao;



	public Cd() {
		this("", "", 0, 0f, "", "","");
	}


	public Cd(String descricao, String genero, int estoque, float custo, String autor, String editora,
			String edicao) {
		super(descricao, genero, estoque, custo);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}
	public String getautor() {
		return this.autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}

	public String geteditora() {
		return this.editora;
	}

	public void seteditora(String editora) {
		this.editora = editora;
	}

	public String getedicao() {
		return this.edicao;
	}

	public void setedicao(String edicao) {
		this.edicao = edicao;
	}

	public void Listar() {
		JOptionPane.showMessageDialog(null, 

			"\nGenero: " + this.getautor() + 
			"\nEstoque: " + this.geteditora() + 
			"\nCusto: " + this.getedicao() 
			);

	}
}