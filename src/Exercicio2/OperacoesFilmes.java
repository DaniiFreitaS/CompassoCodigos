package Exercicio2;

import Exercicio1.Conexao.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperacoesFilmes {
    private Connection connection;
    public OperacoesFilmes(Connection connection){
        this.connection = connection;
    }

    public void salvaFilme(Filmes filmes) throws SQLException{
        String sql = "INSERT INTO FILMES (NOME, DESCRICAO, ANO) VALUES (?,?,?)";

        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, filmes.getNome());
            pstm.setString(2, filmes.getDescricao());
            pstm.setInt(3, filmes.getAno());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()){
                    filmes.setId(rst.getInt(1));
                }
            }
        }
    }

    public List<Filmes> getlistaFilmes() {
        List<Filmes> listaFilmes = new ArrayList<>();
            String sql = "SELECT NOME, DESCRICAO, ANO FROM FILMES";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();

                try (ResultSet rst = pstm.getResultSet()) {
                    while (rst.next()) {
                        Filmes lista = new Filmes(rst.getString(1), rst.getString(2), rst.getInt(3));

                        listaFilmes.add(lista);
                    }
                }
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return listaFilmes;

    }
    public Integer exibeFilmes(Integer i){
        List<Filmes> listaFilmes = this.getlistaFilmes();
        System.out.println(listaFilmes.size());
        try{
            System.out.println("Id na posicao : " + listaFilmes.get(i).getNome());
            System.out.println("Nome: " + listaFilmes.get(i).getNome() + " | Descricao: "+ listaFilmes.get(i).getDescricao() + " | Ano: "+ listaFilmes.get(i).getAno());
            return 1;
        }catch (IndexOutOfBoundsException ind){
            System.out.println("Nao existe nenhum produto cadastrado nesta opcao");
            return 0;
        }

    }
}
