package livrariabs;

import javax.swing.JOptionPane;

public class Dvd extends Produto {
	private String autor;
	private String editora;
	private String edicao;
	
	public Dvd() {
		this("", "", 0, 0f, 0f, "", "", "");
	}
	public Dvd(String descricao, String genero, int estoque, float custo, float venda, String autor, String editora, String edicao) {
		super(descricao, genero, estoque, venda, custo);
		
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return this.editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEdicao() {
		return this.edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, 
				"\nDescrioção: " + this.getDescricao() + 
				"\nGenero: " + this.getGenero() + 
				"\nEstoque: " + this.getEstoque() + 
				"\nCusto: " + dec.format(this.getCusto()) + 
				"\nVenda: " + dec.format(this.getVenda()) + 
				"\nAutor: " + this.getAutor() + 
				"\nEditora: " + this.getEditora() + 
				"\nEdição: " + this.getEdicao(), "Dvd: ", 1);
	}
	@Override
	public void Calcular() {
		this.setVenda(this.getCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n30% - Venda" + this.getVenda());

	}
	
	public void Calcular(float cotacaoDolar) {
		this.setVenda(this.getCusto() * 1.3f / cotacaoDolar);
		JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n30% - Venda\n" + this.getVenda());

	}

}
