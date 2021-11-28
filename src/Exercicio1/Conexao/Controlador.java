package Exercicio1.Conexao;

import java.sql.Connection;
import java.util.List;

public class Controlador {
    OperacoesProduto OperacoesProduto;

    public Controlador() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.OperacoesProduto = new OperacoesProduto(connection);
    }
    public Integer getIDlist(int id){

        List<Produto> idlista = this.OperacoesProduto.getlistaID();
        return idlista.indexOf(id);
    }

}
