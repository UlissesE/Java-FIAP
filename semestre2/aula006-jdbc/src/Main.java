import java.sql.*;

void main() {
    String url = "";
    String user = "";
    String password = "";

    String createSQL =
            """
            CREATE TABLE clientes (
            id NUMBER(10) PRIMARY KEY,
            nome VARCHAR2(100) NOT NULL,
            email VARCHAR2(100) UNIQUE,
            data_cadastro DATE DEFAULT SYSDATE
            )
            """;
    String selectSQL = "SELECT * FROM clientes";

    String insertSQL = "INSERT INTO clientes (id, nome, email) VALUES (?, ?, ?)";

    String deleteSQL = "DELETE FROM clientes WHERE id = 1";

    String deleteSQL2 = "DELETE FROM clientes WHERE id = 2";

    String dropSQL = "DROP TABLE clientes";

//    CRIAR TABELA

//    try (Connection connection = DriverManager.getConnection(url, user, password);
//         Statement stmt = connection.createStatement()){
//        System.out.println("Conectado ao Oracle Database com sucesso!");
//        stmt.executeUpdate(createSQL);
//        System.out.println("\nTabela criada com sucesso!");
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }

//    SELECT TESTE

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
         ResultSet resultSet = preparedStatement.executeQuery();
    ) {
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            Date data = resultSet.getDate("data_cadastro");
            System.out.println("ID: " + id + " | NOME: " + nome + " | Email: " + email + " | Data_cadastro: " + data);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

//    INSERT TESTE

    try (Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)
    ) {
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, "Eduardo");
        preparedStatement.setString(3, "eduardo@email.com");
        preparedStatement.executeUpdate();
        System.out.println("\nLinha inserida com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }

    //    INSERT TESTE 2

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)
    ) {
        preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Ulisses");
        preparedStatement.setString(3, "ulisses@email.com");
        preparedStatement.executeUpdate();
        System.out.println("\nLinha inserida com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }

//    SELECT

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
         ResultSet resultSet = preparedStatement.executeQuery();
    ) {
        System.out.println();
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            Date data = resultSet.getDate("data_cadastro");
            System.out.println("ID: " + id + " | NOME: " + nome + " | Email: " + email + " | Data_cadastro: " + data);
        }
        System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
    }

//    DELETAR ITEM

    try (Connection connection = DriverManager.getConnection(url, user, password);
         Statement stmt = connection.createStatement()
    ) {
        stmt.executeUpdate(deleteSQL);
        System.out.println("Item excluído com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // SELECT

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
         ResultSet resultSet = preparedStatement.executeQuery();
    ) {
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            Date data = resultSet.getDate("data_cadastro");
            System.out.println("ID: " + id + " | NOME: " + nome + " | Email: " + email + " | Data_cadastro: " + data);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    //    DELETAR ITEM

    try (Connection connection = DriverManager.getConnection(url, user, password);
         Statement stmt = connection.createStatement()
    ) {
        stmt.executeUpdate(deleteSQL);
        System.out.println("Item excluído com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // SELECT

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
         ResultSet resultSet = preparedStatement.executeQuery();
    ) {
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            Date data = resultSet.getDate("data_cadastro");
            System.out.println("ID: " + id + " | NOME: " + nome + " | Email: " + email + " | Data_cadastro: " + data);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    //    DELETAR ITEM 2

    try (Connection connection = DriverManager.getConnection(url, user, password);
         Statement stmt = connection.createStatement()
    ) {
        stmt.executeUpdate(deleteSQL2);
        System.out.println("Item excluído com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }

//    DELETAR TABELA

//    try(Connection connection = DriverManager.getConnection(url, user, password);
//        Statement stmt = connection.createStatement()) {
//        System.out.println("Conectado ao Oracle Database com sucesso!");
//
//        stmt.executeUpdate(dropSQL);
//
//        System.out.println("Tabela excluida com sucesso!");
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
}
