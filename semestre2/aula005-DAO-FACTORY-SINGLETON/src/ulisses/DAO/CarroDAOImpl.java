package ulisses.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CarroDAOImpl implements CarroDAO {

    private Connection conn;

    public CarroDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void salvar(Carro carro) {
        String sql = "INSERT INTO carros (id, marca, modelo) VALUES ( ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, carro.getId());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getModelo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void atualizar(Carro carro) {

    }

    @Override
    public void apagar(int id) {

    }

    @Override
    public Carro obterPorId(int id) {
        return null;
    }

    @Override
    public List<Carro> listarTodos() {
        return List.of();
    }


}
