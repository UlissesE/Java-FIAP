import ulisses.DAO.Carro;
import ulisses.DAO.CarroDAOImpl;
import ulisses.SINGLETON.ConexaoDB;

import java.sql.*;

void main() {

    Connection conexao = ConexaoDB.getConexaoDB().getConn();

    CarroDAOImpl dao = new CarroDAOImpl(conexao);

    dao.salvar(new Carro(1, "Mitsubish", "Lancer"));

    String select =
            """
            SELECT * FROM carros
            """;

    try (PreparedStatement preparedStatement = conexao.prepareStatement(select);
         ResultSet resultSet = preparedStatement.executeQuery())
    {
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String marca = resultSet.getString("marca");
            String modelo = resultSet.getString("modelo");
            System.out.println("ID: " + id + " | MARCA: " + marca + " | MODELO: " + modelo);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

}
