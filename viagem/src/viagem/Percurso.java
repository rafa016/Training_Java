package viagem;
import javax.swing.JOptionPane;
public class Percurso {//1- classe modelagem
	public double km;
	public double comb;// Atributos encapsulados
	public double ped;
	public Percurso() {//2- Contrutor vazio
		this(0d, 0d, 0d);
	}//2
	public Percurso(double km, double comb, double ped) {//3 construtor com parâmetros
		this.km = km;
		this.comb = comb;// Contrutor com parâmetros
		this.ped = ped;
	}//3
	//gets and setters
	public double getKm() {//4
		return this.km;
	}//4
	public void setKm(double km) {//5
		this.km = km;
	}//5
	public double getComb() {//6
		return this.comb;
	}//6
	public void setComb(double comb) {//7
		this.comb = comb;
	}//7
	public double getPed() {//8
		return this.ped;
	}//8
	public void setPed(double ped) {//9
		this.ped = ped;
	}//9
	
	public void Cad(){//10
		this.setKm (Double.parseDouble(JOptionPane.showInputDialog(
				null,"Digite a quilometragem percorrida: ", "Cadastro", 3)));
		this.setComb (Double.parseDouble(JOptionPane.showInputDialog(
				null,"Digite o valor do combustivel: ", "Cadastro", 3)));
		this.setPed (Double.parseDouble(JOptionPane.showInputDialog(
				null,"Digite o valor do pedágio: ", "Cadastro", 3)));
	}//10
	public void List(){//11
		JOptionPane.showMessageDialog(null, 
			"A quilometragem percorrida foi de "+this.getKm()+" Km\n"+
			"O combustível custou R$"+this.getComb()+" por litro\n" + 
			"O pedágio custou R$"+this.getPed());
	}//11
	public void Calc(){//12
		JOptionPane.showMessageDialog(null, 
			"A quilometragem percorrida foi de "+this.getKm()+" Km\n"+
			"O combustível custou R$"+this.getComb()+" por litro\n" + 
			"O pedágio custou R$"+this.getPed());
	}//12
}//1

