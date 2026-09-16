package br.com.fiap.concessionaria;

import br.com.fiap.concessionaria.controller.CarroController;
import br.com.fiap.concessionaria.model.CarroDAO;
import br.com.fiap.concessionaria.model.CarroDAOFactory;
import br.com.fiap.concessionaria.view.CarroView;

public class Main {
    static void main() {
        CarroView view = new CarroView();
        CarroDAO dao = CarroDAOFactory.criarDAO();
        CarroController controller = new CarroController(view, dao);

        view.setVisible(true);
    }
}
