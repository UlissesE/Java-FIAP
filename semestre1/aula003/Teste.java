package aula003;

import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		Pessoa eduardo = new Pessoa();
		System.out.println("Qual o nome da pessoa?");
		eduardo.nome = leitor.nextLine();
		System.out.println("Qual a idade de " + eduardo.nome + " ?");
		eduardo.idade = leitor.nextInt();
		System.out.println("Qual o sexo de " + eduardo.nome + " ?");
		eduardo.sexo = leitor.next();
		System.out.println("Qual a altura de " + eduardo.nome + " ?");
		eduardo.altura = leitor.nextFloat();
		System.out.println("Qual o peso de " + eduardo.nome + " ?");
		eduardo.peso = leitor.nextFloat();
		eduardo.comer();
		eduardo.estudar();
		eduardo.dormir();
		leitor.close();
	}

}