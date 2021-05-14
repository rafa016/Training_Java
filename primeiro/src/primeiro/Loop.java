package primeiro;
import javax.swing.JOptionPane;
public class Loop {//1
	public static void main(String[] args) {//2m
		int num1 = 0; int num2 = 0; int op = 0; int tot = 0;
		String sair;
		JOptionPane.showMessageDialog(null,
			"Esse programa serve para fazer as operações basicas de matemática.\n\n");	
		do{//3		
			num1 = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite o primeiro número:"));
			num2 = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite o segundo número:"));		
			op = Integer.parseInt (
					JOptionPane.showInputDialog(null,
					"Digite sua escolha:\n1 +\n2 -\n3 *\n4 /"));
			switch(op){//4
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
					}//4	
			JOptionPane.showMessageDialog(
				null, "resultado: " + tot);
	
		sair = 	JOptionPane.showInputDialog(null,
				"\nDeseja sair (S/N)");

		}//3
	while (sair.equals("N") || sair.equals("n") || sair.equals("nao") || sair.equals("não") || sair.equals("Nao") || sair.equals("Não"));
	}//2
	
}//1