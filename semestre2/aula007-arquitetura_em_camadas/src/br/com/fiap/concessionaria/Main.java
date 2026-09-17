package br.com.fiap.concessionaria;

import br.com.fiap.concessionaria.controller.CarroController;
import br.com.fiap.concessionaria.model.CarroDAO;
import br.com.fiap.concessionaria.model.CarroDAOFactory;
import br.com.fiap.concessionaria.service.CarroService;
import br.com.fiap.concessionaria.view.CarroView;

public class Main {
    static void main() {
        CarroView view = new CarroView();
        CarroService service = new CarroService();
        CarroController controller = new CarroController(view, service);

        view.setVisible(true);
    }
}
