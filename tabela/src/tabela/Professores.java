package tabela;

public class Professores {
	
	public String nome[] = {"roberta", "tete"};
	
	public String materia[] = {"matematica", "fisica"};
	
	public String id[] = {"1", "2"};

	public Professores(String[] nome, String[] materia, String[] id) {
		
		this.nome = nome;
		this.materia = materia;
		this.id = id;
	}

	public Professores() {
		
	}

	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[] getMateria() {
		return materia;
	}

	public void setMateria(String[] materia) {
		this.materia = materia;
	}

	public String[] getId() {
		return id;
	}

	public void setId(String[] id) {
		this.id = id;
	}
	
	
	
	
	
}
