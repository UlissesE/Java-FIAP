package ulisses.eduardo.service;

import ulisses.eduardo.model.Aluno;
import ulisses.eduardo.model.Pessoa;
import ulisses.eduardo.model.Professor;
import ulisses.eduardo.repository.PessoaRepository;
import ulisses.eduardo.validador.Validador;

import java.util.List;

public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa cadastrarAluno(
            String nome,
            int idade,
            String cpf,
            String endereco,
            int matricula
    ) {
        Validador.validarNome(nome);
        Validador.validarIdade(idade);

        Aluno aluno = new Aluno(nome, idade, cpf, endereco, matricula);
        repository.salvar(aluno);
        return aluno;
    }

    public Pessoa cadastrarProfessor(
            String nome,
            int idade,
            String cpf,
            String endereco,
            int registro
    ) {
        Validador.validarNome(nome);
        Validador.validarIdade(idade);

        Professor professor = new Professor(nome, idade, cpf, endereco, registro);
        repository.salvar(professor);
        return professor;
    }

    public List<Pessoa> listarTodos() {
        return repository.getPessoas();
    }

}
