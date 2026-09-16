package br.com.fiap.concessionaria.model;

import br.com.fiap.concessionaria.model.utils.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAOImpl implements CarroDAO {

    private Connection conexao;

    public CarroDAOImpl() {
        this.conexao = ConexaoDB.getInstancia().getConexao();
    }

    @Override
    public void salvarCarro(Carro carro) {
        String sql = "INSERT INTO carro (marca, modelo, ano) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, carro.getMarca());
            ps.setString(2, carro.getModelo());
            ps.setInt(3, carro.getAno());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>();
        String sql = "SELECT marca, modelo, ano FROM carro";
        try (PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()) {
                carros.add((new Carro(
                        rs.getString("marca"), rs.getString("modelo"), rs.getInt("ano")
                )));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carros;
    }
}
