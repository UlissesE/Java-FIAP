package exercicio2;

public class Teste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		
		Aluno a2 = new Aluno(566339, "Eduardo Ulisses", 10);
		
		System.out.println("Nome aluno: " + a1.getNome());
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nota: " + a1.getNota());
		
		a1.setNome("Ulisses");
		a1.setMatricula(566338);
		a1.setNota(10);
	
		System.out.println("Nome aluno: " + a1.getNome());
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nota: " + a1.getNota());
		
		System.out.println("Nome aluno: " + a2.getNome());
		System.out.println("Matricula: " + a2.getMatricula());
		System.out.println("Nota: " + a2.getNota());
		
		a2.setNome("Eduardo 2");
		a2.setMatricula(566337);
		a2.setNota(9.9);
		
		System.out.println("Nome aluno: " + a2.getNome());
		System.out.println("Matricula: " + a2.getMatricula());
		System.out.println("Nota: " + a2.getNota());
		
	}

}
