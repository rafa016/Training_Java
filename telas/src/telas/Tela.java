package telas;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class Tela{//1
	public static void main (String[] args) {//2
		javax.swing.SwingUtilities.invokeLater(//3
			new Runnable() {//4
				public void run() {//5
					//decoracao da parte visual
					JDialog.setDefaultLookAndFeelDecorated(true);
					//declaracao das variaveis utilizadas
					String[] nro = {"um","dois","tres","quatro","cinco"}; //array 5
					int p1;
					String msg = "msgs", tit = "titulo";
					String msg0 = "selecione um dos botoes";
					String msg1 = "Você selecionou o botão NO";
					String msg2 = "Você selecionou o botão YES";
					String msg3 = "Você selecionou o botão FECHAR";
					String tit1 = "opcoes";
					String tit2 = "saida";
					//tipos e parametros utilizados nas msgsbox
					//showConfirmDialog (comp, msg, titulo, opcao, saida , icone)
					//showInputDialog (comp, msg, titulo,saida , icone, list, posicao)
					//showMessageDialog(comp, msg, titulo, saida, icone)
					//showOptionDialog(comp, msg, titulo, opcao, saida, icone, lista, foco)
					
					//definicao das constantes "simuladas"
					//SAIDA- tipo de incone mostrdo na caixa de dialogo
					final int sai1  = JOptionPane.PLAIN_MESSAGE;
					final int sai2  = JOptionPane.ERROR_MESSAGE;
					final int sai3  = JOptionPane.INFORMATION_MESSAGE;
					
					
					final int sai4  = JOptionPane.WARNING_MESSAGE;
					final int sai5  = JOptionPane.QUESTION_MESSAGE;
					//OPCAO - tipos de botoes mostrados na caixa de dialogo
					final int opt1 = JOptionPane.DEFAULT_OPTION;
					final int opt2 = JOptionPane.YES_NO_OPTION;
					final int opt3 = JOptionPane.YES_NO_CANCEL_OPTION;
					final int opt4 = JOptionPane.OK_CANCEL_OPTION;
					
					//Exemplos utilizando imput dialog
					p2 = JOptionPane.showInputDialog(null, msg, tit, -1);
					p2 = JOptionPane.showInputDialog(null, msg, tit, 0);
					p2 = JOptionPane.showInputDialog(null, msg, tit, 1);
					p2 = JOptionPane.showInputDialog(null, msg, tit, 2);
					
					p2 = JOptionPane.showInputDialog(null, msg, tit, 3);
					
					p2 = JOptionPane.showInputDialog(null, msg, tit, sai1);
					p2 = JOptionPane.showInputDialog(null, msg, tit, sai2);
					p2 = JOptionPane.showInputDialog(null, msg, tit, sai3);
					p2 = JOptionPane.showInputDialog(null, msg, tit, sai4);
					p2 = JOptionPane.showInputDialog(null, msg, tit, sai5);
					
					//exemplo com metodo showImputDialog
					p2 = (String) JOptionPane.showInputDialog(
							null, msg, tit, -1, null, nro, nro[0]);
					p2 = (String) JOptionPane.showInputDialog(
							null, msg, tit, -1, null, nro, nro[1]);
					p2 = (String) JOptionPane.showInputDialog(
							null, msg, tit, -1, null, nro, nro[2]);
					p2 = (String) JOptionPane.showInputDialog(
							null, msg, tit, -1, null, nro, nro[3]);
					p2 = (String) JOptionPane.showInputDialog(
							
							null, msg, tit, -1, null, nro, nro[4]);
					//exemplo com metodo showOptionDialog
					p1 = JOptionPane.showOptionDialog(
							null, msg, tit, 1, -1, null, nro, "um");
					p1 = JOptionPane.showOptionDialog(
							null, msg, tit, 1, 0, null, nro, "dois");
					p1 = JOptionPane.showOptionDialog(
							null, msg, tit, 1, 1, null, nro, "tres");
					p1 = JOptionPane.showOptionDialog(
							null, msg, tit, 1, 2, null, nro, "quatro");
					p1 = JOptionPane.showOptionDialog(
							null, msg, tit, 1, 3, null, nro, "cinco");
					//exemplo com metodo  showConfirmDialog
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, -1, 1, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, 0, 1, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, 1, 1, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, 2, 1, null);
					
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, opt1, 2, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, opt2, 2, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, opt3, 2, null);
					p1 = JOptionPane.showConfirmDialog(
							null, msg, tit, opt4, 2, null);
					
					//exemplo com showMessageDialog
					JOptionPane.showMessageDialog(null,  msg, tit, -1, null);
					JOptionPane.showMessageDialog(null,  msg, tit, 0, null);
					JOptionPane.showMessageDialog(null,  msg, tit, 1, null);
					JOptionPane.showMessageDialog(null,  msg, tit, 2, null);
					JOptionPane.showMessageDialog(null,  msg, tit, 3, null);
					
					p1 = JOptionPane.showConfirmDialog(null,  msg0, tit1, 0, 1);
					
					if (p1 == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null,  msg1, tit2, 2);
					}
					if (p1 == JOptionPane.OK_OPTION) {
						JOptionPane.showMessageDialog(null,  msg2, tit2, 2);
					}
					if (p1 == JOptionPane.CLOSED_OPTION) {
						JOptionPane.showMessageDialog(null,  msg3, tit2, 0);
					}
					//Não modificar daqui em diante
				}//5
			}//4
		);//3
	}//2
}//1

