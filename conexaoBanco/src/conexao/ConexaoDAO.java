package conexao;

import java.sql.*;

public class ConexaoDAO {
    public Connection connectionBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/javatest";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {
        try {
            Connection conn = new ConexaoDAO().connectionBD();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " - " + resultSet.getString("nome"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createUser(String nome) {
        PreparedStatement ps ;
        try {
            Connection conn = new ConexaoDAO().connectionBD();
            ps = conn.prepareStatement("insert into users (nome) values (?)");
            ps.setString(1, nome);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeUser(String id) {
        PreparedStatement ps;
        try {
            Connection conn = new ConexaoDAO().connectionBD();
            ps = conn.prepareStatement("delete from users where id = ?");
            ps.setString(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateUser(String nome, String id) {
        PreparedStatement ps ;
        try {
            Connection conn = new ConexaoDAO().connectionBD();
            ps = conn.prepareStatement("update users set nome = ? where id = ?");
            ps.setString(1, nome);
            ps.setString(2, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
