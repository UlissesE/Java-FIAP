package exercicio4_loop_while;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, escreva um número para chegar até o 0 ");
		double numero = sc.nextDouble();
		
		while(numero >=0) {
			System.out.println(numero);
			if (0 < numero && numero < 1) {
				numero -= numero;
			} else {				
				numero -= 1;
			}
		}
		
		sc.close();
		
	}

}
