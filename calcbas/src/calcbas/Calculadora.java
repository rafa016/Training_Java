package calcbas;
import javax.swing.JOptionPane;
public class Calculadora {
	public double n1;
	public double n2;
	public double r;
	private double n3;
	
	public Calculadora() {
		this(0d, 0d, 0d, 0d);	
	}	
	public Calculadora(double n1, double n2, double r, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.r = r;
	}
	
	public double getN1() {
		return this.n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return this.n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return this.n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getR() {
		return this.r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public void Soma(){
		this.setN1 (Double.parseDouble(JOptionPane.showInputDialog(
				null,"digite o primeiro número: ", "Cadastro", 3)));
		this.setN2 (Double.parseDouble(JOptionPane.showInputDialog(
				null,"digite o segundo numero: ", "cadastro", 3)));
		this.r = this.getN1() + this.getN2();
		JOptionPane.showMessageDialog(
				null,"O resultado da soma é: " + this.getR(), "Soma", 1);
		}
	public void Sub(double a, double b){
		this.setN1(a);
		this.setN2(b);
		this.setR(this.getN1() - this.getN2());
		JOptionPane.showInputDialog(null,
			"total: " + this.getR(), "Subtração", 1);
		
		}
	public double Mult(){
		this.setN1 (Double.parseDouble(JOptionPane.showInputDialog(
				null,"digite o primeiro número: ", "Cadastro", 3)));
		this.setN2 (Double.parseDouble(JOptionPane.showInputDialog(
				null,"digite o segundo numero: ", "cadastro", 3)));
		this.r = this.getN1() * this.getN2();
			JOptionPane.showMessageDialog(
				null,"O resultado da soma é: " + this.getR(), "Soma", 1);
			return this.getR();
		}
	public double Div(double a, double b){
		this.setN1(a);
		this.setN2(b);
		this.setR(this.getN1() / this.getN2());
		return this.getR();
		}
	public double Quad(double a){
		this.setN1(a);
		this.setR(this.getN1() * this.getN1());
		return this.getR();
		}
	public double Pot(double a, double b, double c){
		this.setN1(a);
		this.setN2(b);
		
		c = 1;
		while(c <= this.getN2()){
			 ;this.setR(this.getN1() * this.getN2());
			c++;
		};
		return this.getR();
		}
	public double Porc(double a, double b){
		this.setN1(a);
		this.setN2(b);
		this.setR(this.getN1() * this.getN2());
		return this.getR();
		}
}
