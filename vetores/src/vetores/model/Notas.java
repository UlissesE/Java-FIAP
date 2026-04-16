package vetores.model;

/**
 * 
 * Classe para guardar funções estáticas pra manipulação de Notas
 * 
 * @author Eduardo
 * @version 1.0
 * 
 */
public class Notas {
	/**
	 * 
	 * @param notas Vai receber array de notas
	 * @return notas
	 */
	public static double calculoMedia(double[] notas) {
		double soma = 0;
		
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		return soma / notas.length;
		
	}
	
	/**
	 * 
	 * @param media Valor definido de média
	 * @param notas Array de notas
	 */
	public static void verificarMaiorQueMedia(double media, double[] notas) {
		for (double nota : notas) {
			if (nota > media) {
				System.out.println("Nota " + nota + " é maior que a média");
			} else {
				System.out.println("Nota " + nota + " é menor que a média");				
			}
		}
	}
}
