package br.com.fiap.concessionaria.model;

import java.util.List;

public interface CarroDAO {
    void salvarCarro(Carro carro);
    List<Carro> listarCarros();
}
