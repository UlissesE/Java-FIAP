package aula003;

public class TestePrimitivo {

	public static void main(String[] args) {
		
        byte idade = 22;
        short anoDeNascimento = 2006;
        int id = 123456789;
        long quantidade = 1000000000;
        float altura = 1.76f;
        double faturamento = 854724469896.99;
        char eduardo = 'e';
        boolean verdadeiro = true;

        System.out.println(idade);
        System.out.println(anoDeNascimento);
        System.out.println(id);
        System.out.println(quantidade);
        System.out.println(altura);
        System.out.println(faturamento);
        System.out.println(eduardo);
        System.out.println(verdadeiro);

        byte quantidadeDeUvasPorCacho = 50;
        byte quantidadeDeCachos = 120;

        byte totalDeUvas = (byte) (quantidadeDeUvasPorCacho * quantidadeDeCachos);
        System.out.println(totalDeUvas);
	}

}
