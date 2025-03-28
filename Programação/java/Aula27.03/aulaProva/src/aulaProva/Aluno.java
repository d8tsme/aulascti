package aulaProva;

public class Aluno {
	private String nome;
	private double nota;
	private int matricula;
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getMatricula(){
		return matricula;
	}

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
}
