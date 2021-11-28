package Exercicio1.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
    public void AtualizaProduto(Integer id) throws SQLException {
        Produto produto = new Produto("esteira branca", "esteira eletrica branca com 23 velocidades", 5, 2200);
        try(Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
            new OperacoesProduto(connection).atualizaProduto(produto,new OperacoesProduto(connection).getIDlist(id));
        }

    }
    public void DeletaProduto(Integer id) throws SQLException{
            try(Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
                new OperacoesProduto(connection).deletaProduto(new OperacoesProduto(connection).getIDlist(id));
            }
    }
}
