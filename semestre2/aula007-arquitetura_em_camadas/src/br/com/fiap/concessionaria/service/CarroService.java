package br.com.fiap.concessionaria.service;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.model.CarroDAO;
import br.com.fiap.concessionaria.model.CarroDAOFactory;

import java.util.List;

public class CarroService {

    private CarroDAO carroDAO;

    public CarroService() {
        this.carroDAO = CarroDAOFactory.criarDAO();
    }

    public void salvarCarro(Carro carro) {

        if (carro.getMarca() == null || carro.getMarca().isEmpty()) {
            throw new RuntimeException("O campo marca precisa estar preenchido");
        }

        if (carro.getModelo() == null || carro.getModelo().isEmpty()) {
            throw new RuntimeException("O campo modelo precisa estar preenchido");
        }

        carroDAO.salvarCarro(carro);

    }

    public List<Carro> listarCarros() {
        return carroDAO.listarCarros();
    }
}
