package Exercicio1.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperacoesProduto {
    private Connection connection;
    public OperacoesProduto(Connection connection){
        this.connection = connection;
    }
    public List<Produto> getlistaID() {
        List<Produto> listaID = new ArrayList<Produto>();
        try {
            String sql = "SELECT ID FROM PRODUTOS";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();

                transformaListaID(listaID, pstm);
            }
            return listaID;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void transformaListaID(List<Produto> ID, PreparedStatement pstm) throws SQLException {
        try (ResultSet rst = pstm.getResultSet()) {
            while (rst.next()) {
                Produto listaID = new Produto(rst.getInt(1));

                ID.add(listaID);
            }
        }
    }
    public void salvaProduto(Produto produto) throws SQLException{
        String sql = "INSERT INTO PRODUTOS (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES (?,?,?,?)";

        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setInt(4, produto.getPreco());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()){
                    produto.setId(rst.getInt(1));
                }
            }
        }
    }
    public Integer getIDlist(int id){

        List<Produto> idlista = this.getlistaID();
        System.out.println(idlista.get(id).getId());
        return idlista.get(id).getId();
    }

    public void deletaProduto(Integer id) throws SQLException{
        String sql = "DELETE FROM PRODUTOS WHERE ID = ?";
        try(PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, id);
            pstm.execute();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
