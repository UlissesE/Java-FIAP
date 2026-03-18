package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite 2 números inteiros");
		System.out.println();
		System.out.println("Primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Segundo número: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		int sub1 = n1 - n2;
		
		int sub2 = n2 - n1;
		
		int multi = n1 * n2;
		
		int div1 = n1 / n2;
		
		int div2 = n2 / n1;
		
		System.out.printf("Soma entre %d e %d = %d%n", n1, n2, soma);

		System.out.printf("Subtração entre %d e %d = %d%n", n1, n2, sub1);

		System.out.printf("Subtração entre %d e %d = %d%n", n2, n1, sub2);

		System.out.printf("Multiplicação entre %d e %d = %d%n", n1, n2, multi);

		System.out.printf("Divisão entre %d e %d = %d%n", n1, n2, div1);

		System.out.printf("Divisão entre %d e %d = %d%n", n1, n2, div2);
		
		sc.close();
	}

}
