package pessoa;
import javax.swing.JOptionPane;
public class Pessoa {//1
	private String nome, email, sexo, estadocivil;
	private int idade, telefone;
	
	public Pessoa(){
		this("","","","");//1 par de aspas por string presente na CLASSE
	};
		public Pessoa(String nome,String  email,String  sexo,String  estadocivil){//3 construtor com parametro
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.estadocivil = estadocivil;
		}//3
		public Pessoa(int idade, int telefone){//construtor com parametro
		this.idade = idade;
		this.telefone = telefone;
		}
		//*********************************************
		//gets
		public String getNome(){
		return this.nome;
		}
		public String getEmail(){
			return this.email;
			}
		public String getSexo(){
			return this.sexo;
			}
		public String getEstadocivil(){
			return this.estadocivil;
			}
		public int getIdade(){
			return this.idade;
			}	
		public int getTelefone(){
			return this.telefone;
			}	
		//**********************************************
		//set
		public void setNome(String nome){
			this.nome = nome;
			}	
		public void setEmail(String email){
			this.email = email;
			}	
		public void setSexo(String sexo){
			this.sexo = sexo;
			}	
		public void setEstadocivil(String estadocivil){
			this.estadocivil = estadocivil;
			}	
		public void setIdade(int idade){//8 metodo set
			this.idade = idade;
			}
		public void setTelefone(int telefone){//8 metodo set
			this.telefone = telefone;
			}
		//**********************************************		
		//cadastros		
		public void Cad(){//9 metodo cadastrar
		this.setNome(JOptionPane.showInputDialog(null,
				"digite seu nome: "));
		this.setEmail(JOptionPane.showInputDialog(null,
				"digite seu email: "));
		this.setSexo(JOptionPane.showInputDialog(null,
				"digite seu sexo(masculino ou feminino): "));
		this.setEstadocivil(JOptionPane.showInputDialog(null,
				"digite seu Estado civil: "));
		this.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,
				"digite sua idade: ")));
		this.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null,
				"digite seu telefone: ")));
		}
		//setagem
		public void List(){//10 metodo set
			JOptionPane.showMessageDialog(null,"nome: " + this.getNome() + "\nidade: " + this.getIdade() + "\nsexo: " + this.getSexo() + "\nemail: " + this.getEmail()
			+ "\nEstadocivil: " + this.getEstadocivil());;
		}
}//1