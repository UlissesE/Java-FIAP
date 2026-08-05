package vetores;

import vetores.model.Notas;

public class Exercicio {

	public static void main(String[] args) {

		double[] notas = new double[5];
		
		notas[0] = 9;
		notas[1] = 6;
		notas[2] = 7;
		notas[3] = 10;
		notas[4] = 7;
		
		double media = Notas.calculoMedia(notas);

		Notas.verificarMaiorQueMedia(media, notas);
		
		
		
	}
	
	
}
