package Exercicio2;

import Exercicio1.Conexao.ConnectionFactory;
import Exercicio1.Conexao.OperacoesProduto;
import Exercicio1.Conexao.Produto;

import java.sql.Connection;
import java.util.List;

public class Controlador {
    Exercicio1.Conexao.OperacoesProduto OperacoesProduto;

    public Controlador() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.OperacoesProduto = new OperacoesProduto(connection);
    }
    public Integer getIDlist(int id){

        List<Produto> idlista = this.OperacoesProduto.getlistaID();
        return idlista.indexOf(id);
    }

}
