package primeiro;

import javax.swing.JOptionPane;

public class Adega {//1

	public static void main(String[] args) {//2
		int op = 0, vinhotinto = 0, qvtd = 0, qvts = 0, vinhobranco = 0, qvbd = 0, qvbs = 0, qws = 0, tot = 0;
		int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
		do{//3 explicar src bin
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Vinho Tinto \n2. Vinho branco "
					+ "\n3. Whisky \n4. Total \n5. Sair"));//aqui define a váriável: op
			switch(op){//4
			case 1:
				vinhotinto = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Vinho Tinto Doce \n2. Vinho Tinto Seco"));//aqui define a váriável: vinhotinto
					switch(vinhotinto){//4.1
					case 1:
						qvtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade Vinho Tinto Doce"));//qvt = quantidade de vinho tinto
						t1 = t1 + qvtd;
						break;
					case 2:
						qvts = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de Vinho Tinto Seco"));
						t2 = t2 + qvts;
						break;
					}//4.1				
				break;
			
			case 2:
				vinhobranco = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Vinho Branco Doce \n2. Vinho Branco Seco"));//qvb = quantidade de vinho branco
				switch(vinhobranco){//4.2
				case 1:
					qvbd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade Vinho Branco Doce"));
					t3 = t3 + qvbd;
					break;
				case 2:
					qvbs = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de Vinho Branco Seco"));
					t4 = t4 + qvbs;
					break;
				}//4.2				
			break;
			
			case 3:
				qws = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de Whisky"));
				t5 = t5 + qws;
				break;
				
			case 4:
				tot = t1 + t2 + t3 + t4 + t5;
				JOptionPane.showMessageDialog(null,						
						"\nTotal de Vinho Tinto Doce :" + t1 +
						"\nTotal de Vinho Tinto Seco :" + t2 +						
						"\nTotal de Vinho Branco Doce :" + t3 +
						"\nTotal de Vinho Branco Seco :" + t4 +						
						"\nTotal de Whisky :" + t5 +
						"\n\nTotal de garrafas: " + tot);
			case 5:
				break;
			}//4
		}while(op!=5);//3
	}//2

}//1