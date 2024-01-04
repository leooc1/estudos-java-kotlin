import conexao.ConexaoDAO;

public class Main {
    public static void main(String[] args) {
        ConexaoDAO conn = new ConexaoDAO();
        conn.updateUser("Bond", "11");
        conn.selectAll();
    }
}