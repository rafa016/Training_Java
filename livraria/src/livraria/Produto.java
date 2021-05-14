package livraria;

import javax.swing.JOptionPane;

public abstract class Produto {//1
	protected String descricao;
	protected String genero;
	protected int estoque;
	protected float custo;


	public Produto(String descricao, String genero, int estoque, float custo) {
		this.descricao = descricao;
		this.genero = genero;
		this.estoque = estoque;
		this.custo = custo;
	}


	public String getDescricao() {
		return this.descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getGenero() {
		return this.genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getEstoque() {
		return this.estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public float getCusto() {
		return this.custo;
	}


	public void setCusto(float custo) {
		this.custo = custo;
	}

	public void Vender(int qtd) {
		JOptionPane.showMessageDialog(null, "estoque anterior: " + this.getEstoque() + "\nqntde vendida :" + 
				qtd + "\n Estoque atual: " + (this.getEstoque() - qtd ));
		this.setEstoque(this.getEstoque() - qtd);
	}

	public void Comprar(int qtd) {
		JOptionPane.showMessageDialog(null, "estoque anterior: " + this.getEstoque() + "\nqntde comprada :" + 
				qtd + "\n Estoque atual: " + (this.getEstoque() + qtd ));
		this.setEstoque(this.getEstoque() + qtd);
	}
}