package exercicio1_if_else;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, escreva sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você tem mais que 18 anos");
		} else {
			System.out.println("Menor de idade não pode! >:(");
		}
		
		sc.close();
	}

}
