package primeiro;

import javax.swing.JOptionPane;

	public class Giu {//1classe
		public static void main(String[] args) {//2metodo
			int num1 = 0; int num2 = 0; int op = 0; int tot = 0;
			JOptionPane.showMessageDialog(null,"Esse programa serve para fazer as operações basicas de matemática.\n\n");
			
			num1 = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite numero 1:"));
	
			num2 = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite numero 2:"));
			
			
			op = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite sua escolha:\n1 +\n2 -\n3 *\n4 /"));
	
			if( op == 1){//3
				tot = num1 + num2;
			}else{//3
				if( op == 2){//4
					tot = num1 - num2;
				}else{//4
					if( op == 3){//5
						tot = num1 * num2;
					}else{//5
						if( op == 4){//6
							tot = num1 / num2;
						}else{//6
							JOptionPane.showMessageDialog(
								null, "opção invalida");
							
					}//6
				}//5
			}//4
		};//3
		switch(op){//7
		case 1:
			tot = num1 + num2;
			break;
		case 2:
			tot = num1 - num2;
			break;
		case 3:
			tot = num1 * num2;
			break;
		case 4:
			tot = num1 / num2;
			break;
		default:
			tot = 0;
			break;
		}//7	
		JOptionPane.showMessageDialog(
			null, "resultado: " + tot);
	
	}//2
}//1