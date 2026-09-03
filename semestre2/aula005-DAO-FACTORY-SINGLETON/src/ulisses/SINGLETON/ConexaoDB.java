package ulisses.SINGLETON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private Connection conn;

    private static ConexaoDB instancia;

    private ConexaoDB() {

        try {
            String url = "";
            String user = "";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso ao Database!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConexaoDB getConexaoDB() {
        if (instancia == null) instancia = new ConexaoDB();
        return instancia;
    }

    public Connection getConn() {
        return conn;
    }
}
