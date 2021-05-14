package tabela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabela1 {
	
	Professores prof = new Professores(); 
	
	public JFrame tela;
	
	private JTable tabela;
	
	private JButton botao;
	
	private String [][] dados = new String [3][5]; //{prof.getId(), prof.getNome(), prof.getMateria()
								 //};					
	
	private String [] topo = { "id", "professor", "materia"};
	
	

	public Tabela1() {
		
		tela = new JFrame("tabelas");
		tela.setLayout(new FlowLayout());
		tela.setSize(500, 500);
		CriarTabela();
		CriarBotao();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		
	}
	
	
	

	
	
	


	public void CriarTabela() {
		tabela = new JTable(dados, topo);
		JScrollPane JS = new JScrollPane(tabela);
		JS.setPreferredSize(new Dimension(400,300));
		tela.add(JS);
	}
	
	public void CriarBotao() {
		botao = new JButton("Salvar");
		botao.setSize(20,10);
		botao.setVisible(true);
		botao.setText("Sair");
		botao.setSize(100,25);
		botao.setLocation(50,200);
		botao.setBackground(Color.orange);
		botao.setForeground(Color.blue);
		
		
		botao.setEnabled(true);
		
		
	}
	
	/*public void Salvar() {
		for(int a = 0; a < dados.length; a++) {
			for(int c = 0; c < dados[a].length; c++) {
				dados[a][c] = 
			}
		}
	}
	*/

}