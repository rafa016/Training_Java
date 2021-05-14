package livrariabs;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public abstract class Produto {//1
	protected String descricao;
	protected String genero;
	protected int estoque;
	protected float venda;
	protected float custo;
	protected float fm;
	public Produto() {//2
		this("", "", 0, 0f, 0f);
	}//2
	
	DecimalFormat dec = new DecimalFormat ("R$0.00");
	
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);

	public Produto(String descricao, String genero, int estoque, float venda, float custo) {//3
		this.descricao = descricao;
		this.genero = genero;
		this.estoque = estoque;
		this.venda = venda;
		this.custo = custo;
	}//3
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
	public float getVenda() {
		return this.venda;
	}
	public void setVenda(float venda) {
		this.venda = venda;
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
	public abstract void Listar();
	public abstract void Calcular();
	
	
}//1
