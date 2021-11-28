package Exercicio1.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        MetodosProduto mp = new MetodosProduto();
        Integer select;

        do{
            System.out.println("Selecione a operacao a ser feita : ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    mp.InsereProduto();
                    break;
                case 2:
                    //func a ser implementada
                    break;

                case 3:

                    mp.DeletaProduto(1);
                    break;

            }
        }while (select != 0);


    }
}
