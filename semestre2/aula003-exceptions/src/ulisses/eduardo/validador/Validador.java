package ulisses.eduardo.validador;

import ulisses.eduardo.exceptions.IdadeInvalidaException;
import ulisses.eduardo.exceptions.NomeInvalidoException;

public class Validador {

    public Validador() {}

    public static void validarNome(String nome) {
        if ((nome == null) || (nome.isBlank())) {
            throw new NomeInvalidoException("Nome não pode estar em branco.");
        }

        if (nome.trim().length() < 3) {
            throw new NomeInvalidoException("Nome inválido. Insira um nome com 3 digitos ou mais");
        }
    }

    public static void validarIdade(int idade) {
        if ((idade < 0) || (idade > 150)) {
            throw new IdadeInvalidaException("Idade inválida.");
        }
    }
}
