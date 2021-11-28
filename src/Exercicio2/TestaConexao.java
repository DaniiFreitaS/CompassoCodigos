package Exercicio2;
import Exercicio1.Conexao.ConnectionFactory;

import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Exercicio1.Conexao.ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.recuperarConexao();

    }
}
