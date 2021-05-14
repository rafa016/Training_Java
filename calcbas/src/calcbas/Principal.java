package calcbas;
import javax.swing.JOptionPane;
import calcbas.Calculadora;
public class Principal {
	public static void main(String[] args) {
		int tp = 0;
		double x, y, z;
		Calculadora calcbas = new Calculadora();
		do{//3
			tp = Integer.parseInt(JOptionPane.showInputDialog(
					null, "\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Quadrado\n6-Potencia\n7-Porcentagem\n0-Sair"));//aqui define a váriável: tp
			switch(tp){//4
				//case 1:
					//calcbas.Cad();
					//break;
				case 1:
					calcbas.Soma();
					break;
				case 2:
					x = Double.parseDouble(
							JOptionPane.showInputDialog(
							null,"digite o primeiro número: ", "Cadastro", 3));
					y = Double.parseDouble(
							JOptionPane.showInputDialog(
							null,"digite o segundo número: ", "Cadastro", 3));
					calcbas.Sub(x, y);
					break;
				case 3:
					z = calcbas.Mult();
					JOptionPane.showMessageDialog(null,
							"total: " + z, "Multiplicação", 1);
					break;
				case 4:
					x = Double.parseDouble(
							JOptionPane.showInputDialog(
							null,"digite o primeiro número: ", "Cadastro", 3));
					y = Double.parseDouble(
							JOptionPane.showInputDialog(
							null,"digite o segundo número: ", "Cadastro", 3));
					z = calcbas.Div(x, y);
					JOptionPane.showMessageDialog(null,
							"total: " + z, "Subtração", 1);
					break;
				case 5:
					x = Double.parseDouble(
							JOptionPane.showInputDialog(
							null,"digite o número que deverá ser elevado ao quadrado: ", "Cadastro", 3));
					z = calcbas.Quad(x);
					JOptionPane.showMessageDialog(null,
							"total: " + z, "Quadrado", 1);
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"opção inválida, escolha de 0 a 4.");
					break;
			}//4
		}while(tp!=0);//3
	}//2

}