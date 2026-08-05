package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Eduardo", "rm111111", "000.100.200-10", "Engenharia de Software");
		aluno.estudar();
		aluno.getNome();
		aluno.getMatricula();
		aluno.getCpf();
		aluno.getCurso();
		aluno.fazerProva();
		
		Professor professor = new Professor("Evando", "pf00000", "100.200.300-40", "DDD with Java");
		professor.estudar();
		professor.getNome();
		professor.getMatricula();
		professor.getCpf();
		professor.getDisciplina();
		professor.ensinar();
		professor.corrigirProva();
	
		Professor professor2 = new Professor("Lucas", "pf00001", "100.300.500-70", "Dynamic Programming");
		professor2.estudar();
		professor2.corrigirProva();
		
	}	

}
