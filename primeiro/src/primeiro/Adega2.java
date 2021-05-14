package primeiro;
import javax.swing.JOptionPane;
public class Adega2 {
	public static void main(String[] args) {
		int op = 15, tsua = 0, tsec = 0, bsua = 0, bsec = 0, whi = 0, tot = 0;
		do{//3 explicar src bin
			op = Integer.parseInt(JOptionPane.showInputDialog(
					null, "digite o tipo de garrafa: \n1. Vinho Tinto Suav"
							+ "e \n2. Vinho Tinto Seco \n3. Vinho Branco Suave "
							+ "\n4. Vinho Branco Seco \n5. Whisky \n0. Sair"));//aqui define a váriável: op
			switch(op){//4
				case 1:
					tsua++;//tsua = tsua + 1;
					break;
				case 2:
					tsec++;
					break;			
				case 3:
					bsua++;
					break;
				case 4:
					bsec++;
					break;								
				case 5:
					whi++;
					break;					
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"opção inválida, escolha de 0 a 5.");
					break;
			}//4
			tot = tsec + tsua + bsec + bsua + whi;
			JOptionPane.showMessageDialog(null,						
					"\nTotal de Vinho Tinto Suave :" + tsua +
					"\nTotal de Vinho Tinto Seco :" + tsec +						
					"\nTotal de Vinho Branco Suave :" + bsua +
					"\nTotal de Vinho Branco Seco :" + bsec +						
					"\nTotal de Whisky :" + whi + "\n\nTotal de garrafas: " + tot);
		}while(op!=0);//3
	}//2

}//1