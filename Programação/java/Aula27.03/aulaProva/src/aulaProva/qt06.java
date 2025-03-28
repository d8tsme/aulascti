package aulaProva;

import java.util.ArrayList;

public class qt06 {

	public static void main(String[] args) {
	
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Camila", 10));
		alunos.add(new Aluno("Roberto", 5));
		alunos.add(new Aluno("Fernando", 8.7));

		int notas = 0;

		for(Aluno aluno : alunos){
			System.out.println(aluno.getNome());
			System.out.print(aluno.getNota()+"\n");
			notas += aluno.getNota();
		}
		int media = notas/alunos.size();
		System.out.println("media: " + media);
	}

}
