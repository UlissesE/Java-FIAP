package ulisses.eduardo.model;

import java.util.UUID;

public abstract class Pessoa {

    protected UUID id;
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String endereco;

    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

