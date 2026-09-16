package br.com.fiap.concessionaria.model;

public class CarroDAOFactory {
    public static CarroDAO criarDAO() {
        return new CarroDAOImpl();
    }
}
