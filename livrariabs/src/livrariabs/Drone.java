package livrariabs;

import javax.swing.JOptionPane;

public class Drone extends Produto {

	private String modelo;
	private String fabricante;
	private String camera;
	private String bateria;

	
	public Drone() {
		this("", "", 0, 0f, 0f, "", "", "");
	}
	public Drone(String descricao, String genero, int estoque, float custo, float venda, String modelo, String fabricante, String camera) {
		super(descricao, genero, estoque, venda, custo);
		
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.camera = camera;
	}
	public String getmodelo() {
		return this.modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public String getfabricante() {
		return this.fabricante;
	}
	public void setfabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getcamera() {
		return this.camera;
	}
	public void setcamera(String camera) {
		this.camera = camera;
	}	
	public String getbateria() {
			return this.bateria;
		}
	public void setbateria(String bateria) {
			this.bateria = bateria;
	}
	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, 
				"\nDescrioção: " + this.getDescricao() + 
				"\nGenero: " + this.getGenero() + 
				"\nEstoque: " + this.getEstoque() + 
				"\nCusto: " + dec.format(this.getCusto()) + 
				"\nVenda: " + dec.format(this.getVenda()) + 
				"\nmodelo: " + this.getmodelo() + 
				"\nfabricante: " + this.getfabricante() + 
				"\nEdição: " + this.getcamera(), "Drone: ", 1);
	}
	@Override
	public void Calcular() {
		this.setVenda(this.getCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n30% - Venda\n" + this.getVenda());

	}


}
