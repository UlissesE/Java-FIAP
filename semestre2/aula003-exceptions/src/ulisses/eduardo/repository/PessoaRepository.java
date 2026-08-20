package ulisses.eduardo.repository;

import ulisses.eduardo.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    private final List<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
