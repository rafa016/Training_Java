package livraria;

import javax.swing.JOptionPane;

import livraria.Cd;

import livraria.Dvd;
import livraria.Livro;

public class Principal {

	public static void main(String[] args) {
		Livro liv1 = new Livro ("inferno", "ação", 10, 0f, "dan brown", "arqueiro", "7ª");
		Cd cd = new Cd("Powerslave", "Rock", 15, 25.0f, "iron Maiden", "Universal Music", "Brasil");
		Dvd dvd1 = new Dvd("outro lado da porta", "Musical", 15, 0f, "Robert Brandon", "2h", "Livre");

		int op, op1, qtde = 0;
		
		do {//3
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"digite a opção desejada: \n1-Livro\n2-CD\n3-DVD\n4-Drone\n0-sair"));

			switch(op) {//4
			case 0:

				break;
			case 1://livro
				do {//3
					op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
							"digite a opção desejada: \n1-Comprar\n2-Listar\n3-Vender\n0-sair","LIVRO",1));
					switch(op1) {

					case 1://Comprar
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade Livros","LIVRO",1));
						liv1.Comprar(qtde);
						break;
					case 2://listar
						liv1.Listar();
						break;
					case 3://vender
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade Livros","LIVRO",1));
						liv1.Vender(qtde);
						break;
					
					case 0://sair

						break;
					default:
						JOptionPane.showMessageDialog(null, "opção invalida");
						break;
					}
				}while(op1!=0);//3
				break;

			case 2:
				do {//3
					op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
							"digite a opção desejada: \n1-Comprar\n2-Listar\n3-Vender\n4-Comprar\n0-sair","CD",1));
					switch(op1) {

					case 1:
						cd.Comprar(qtde);;
						break;
					case 2:
						cd.Listar();
						break;
					case 3:
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade Cds","CD",1));
						dvd1.Vender(qtde);
						break;
					case 4:
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade de Cds","CD",1));
						dvd1.Comprar(qtde);
						break;
					case 0:

						break;
					default:
						JOptionPane.showMessageDialog(null, "opção invalida");
						break;
					}
				}while(op1!=0);//3

				break;
			case 3:
				do {//3
					op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
							"digite a opção desejada: \n1-Comprar\n2Comprar com o dollar\n3-Listar\n4-Vender\n5-Comprar\n0-sair","DVD",1));
					switch(op1) {

					case 1:

						dvd1.Comprar(qtde);
						break;
					case 2:
						
						break;
					case 3:
						dvd1.Listar();
						break;
					case 4:
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a quantidade de DVDs","DVD",1 ));
						dvd1.Vender(qtde);
						break;
					
					default:
						JOptionPane.showMessageDialog(null, "opção invalida");
						break;

					}
				}while(op1!=0);
				break;
			case 4:
				do {//3
					op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
							"digite a opção desejada: \n1-Comprar\n2-Listar\n3-Vender\n4-Comprar\n0-sair","DRONE",1));
					switch(op1) {

					case 1:
						dvd1.Comprar(qtde);
						
						break;
					case 2:
						dvd1.Listar();
						break;
					case 3:
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade Drones","DRONE",1));
						dvd1.Vender(qtde);
						break;
					case 4:
						qtde = Integer.parseInt(JOptionPane.showInputDialog(null,
								"digite a digite a quantidade de Drones","DRONE",1));
						dvd1.Comprar(qtde);
						break;
					case 0:

						break;
					default:
						JOptionPane.showMessageDialog(null, "opção invalida");
						break;
					}
				}while(op1!=0);//3

				break;



			default:
				JOptionPane.showMessageDialog(null, "opção invalida");
				break;
			}//4
		}while(op!=0);//3

	}//2

}//1
