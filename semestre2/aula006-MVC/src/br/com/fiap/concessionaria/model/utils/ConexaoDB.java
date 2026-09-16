package br.com.fiap.concessionaria.model.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static ConexaoDB instancia;
    private Connection conexao;

    private ConexaoDB() {
        try {
            conexao = DriverManager.getConnection(
                    "url", "user", "password"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConexaoDB getInstancia() {
        if (instancia == null) instancia = new ConexaoDB();
        return instancia;
    }

    public Connection getConexao() {
        return conexao;
    }
}
