package Exercicio1.Conexao;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.recuperarConexao();

    }
}
