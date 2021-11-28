package Exercicio2;

import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) throws SQLException {
        MetodosFilmes mf = new MetodosFilmes();
        mf.exibeFilmes();
        //mf.insereFilmes();
    }

}
