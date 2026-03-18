package exercicio4;

import java.util.Scanner;

public class InverterFrase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();
		
		System.out.println("Frase em letras maiusculas: " + frase.toUpperCase());
		
		System.out.println("Quantidade de caracteres: " + frase.length());
		
		String contemJava = (frase.toLowerCase().contains("java")) ? "Contém Java" : "Não contém Java";
		
		System.out.println(contemJava);
		
		String textoInvertido = new StringBuilder(frase).reverse().toString();
		
		System.out.println(textoInvertido);
		
		sc.close();
		
	}

}
