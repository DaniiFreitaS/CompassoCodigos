package Exercicio1.Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class MetodosProduto {
    public static void InsereProduto() throws SQLException {

        Produto esteira = new Produto("esteira", "esteira eletrica com 30 velocidades", 7, 1870);
        Produto patinete = new Produto("patinete", "patinete eletrico 5 velocidades", 3, 760);
        Produto bicicleta = new Produto("bicicleta", "bicicleta rosa aro 20", 2, 600);

        try (Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
            new OperacoesProduto(connection).salvaProduto(bicicleta);
            new OperacoesProduto(connection).salvaProduto(esteira);
            new OperacoesProduto(connection).salvaProduto(patinete);

        }
    }
    public void DeletaProduto() throws SQLException{
            try(Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
                new OperacoesProduto(connection).deletaProduto(2);
            }
    }
}
