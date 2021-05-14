package pessoa;
import javax.swing.JOptionPane;
public class Pessoag {//1 classe
	private String nome;
	private int idade;
	private float peso;
	private boolean maior;
	public Pessoag() {
		this("", 0, 0f, false );
	}
	public Pessoag(String nome, int idade, float peso, boolean maior) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.maior = maior;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isMaior() {
		return this.maior;
	}
	public void setMaior(boolean maior) {
		this.maior = maior;
	}

	public void Cad(){//8 Metodo cadastrar
		this.setNome(JOptionPane.showInputDialog(null,
				"digite seu nome: "));
		this.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,
				"digite sua idade: ")));
		this.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null,
				"digite seu peso: ")));
	}//8	
	public void Ver(){
		this.setMaior(false);
		if(this.getIdade() >= 18){
		this.setMaior(true);
		}
		JOptionPane.showMessageDialog(null,
		"Maior de idade: " + this.isMaior());
	}
	public void List(){//10 metodo set
		JOptionPane.showMessageDialog(null,
		"nome: " + this.getNome() + 
		"\nidade: " + this.getIdade() +
		"\nPeso: " + this.getPeso());
	}//10
	
}//1