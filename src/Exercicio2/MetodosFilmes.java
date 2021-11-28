package Exercicio2;


import java.sql.Connection;
import java.sql.SQLException;

public class MetodosFilmes {
    public static void insereFilmes() throws SQLException {
        Filmes ratatuile = new Filmes("Ratatuile", "ratatuile conta a historia de um rato", 2001);
        try (Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
            new OperacoesFilmes(connection).salvaFilme(ratatuile);
        }

    }
    public void exibeFilmes() throws SQLException{
        try (Connection connection = new ConnectionFactory().recuperarConexao()){
            new OperacoesFilmes(connection).exibeFilmes();

        }

    }
}
