package br.com.fiap.concessionaria.controller;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.service.CarroService;
import br.com.fiap.concessionaria.view.CarroView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarroController {
    private CarroView carroView;
    private CarroService carroService;

    public CarroController(CarroView carroView, CarroService carroService) {
        this.carroView = carroView;
        this.carroService = carroService;
        this.carroView.addSalvarCarroListener(new SalvarCarroListener());
    }

    public class SalvarCarroListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String marca = carroView.getMarca();
                String modelo = carroView.getModelo();
                int ano = carroView.getAno();
                Carro novoCarro = new Carro(marca, modelo, ano);
                carroService.salvarCarro(novoCarro);
                StringBuilder carrosText = new StringBuilder();
                for (Carro carro : carroService.listarCarros()) {
                    carrosText.append(carro.getMarca()).append(" ")
                            .append(carro.getModelo()).append(" - ")
                            .append(carro.getAno()).append("\n");
                }
                carroView.displayCarros(carrosText.toString());
            } catch (Exception ex) {
                carroView.displayErrorMessage("Erro ao salvar carro!");
            }
        }
    }
}
