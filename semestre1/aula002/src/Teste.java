package aula002;

public class Teste {

	public static void main(String[] args) {

		Pessoa eduardo = new Pessoa();
		eduardo.nome = "Eduardo";
		eduardo.idade = 19;
		eduardo.sexo = "Masculino";
		eduardo.altura = 1.76f;
		eduardo.peso = 62;
		eduardo.comer();
		eduardo.estudar();
		eduardo.dormir();
		
		Pessoa otavio = new Pessoa();
		otavio.nome = "Otávio";
		otavio.idade = 19;
		otavio.sexo = "Masculino";
		otavio.altura = 1.80f;
		otavio.peso = 60;
		otavio.comer();
		otavio.estudar();
		otavio.dormir();;
	}

}