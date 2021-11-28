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
                    //metodo estatico que insere automaticamente 3 produtos do banco de dados
                    mp.InsereProduto();//insercao automatica de 3 produtos
                    break;
                case 2:
                    //metodo com possibilidade de selecionar qualquer posicao a ser atualizada
                    mp.AtualizaProduto(0);//posicao 1 da lista de id no banco de dados
                    break;

                case 3:
                    //metodo com possibilidade de selecionar qualquer posicao a ser deletada
                    mp.DeletaProduto(1);// posicao 2 da lista de id no banco de dados
                    break;
                case 0:
                    System.out.println("Finalizando aplicacao");
                    break;
            }
        }while (select != 0);


    }
}
