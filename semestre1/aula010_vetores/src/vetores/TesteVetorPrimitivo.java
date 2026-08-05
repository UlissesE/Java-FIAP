package vetores;

public class TesteVetorPrimitivo {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("O valor do Array numeros[" + i + "] é " + numeros[i]);
			
		}
		
		int[] numerosFixos = {5,10,20,40,80};
		
		for (int valor : numerosFixos) {
			System.out.println("O valor do item do array é: " + valor);
		}
		
	}
	
}
