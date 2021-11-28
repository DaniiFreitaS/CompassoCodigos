package Exercicio2;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        MetodosFilmes mf = new MetodosFilmes();
        int npagina;
        int nfilmes;
        Integer select;
        do{
            System.out.println("Digite 1 para entrar na selecao ou Digite 0 para sair");
            select = sc.nextInt();
            switch (select){
                case 1:
                    mf.insereFilmes();
                    System.out.println("Digite qual pagina acessar: ");
                    npagina = sc.nextInt();
                    System.out.println("Digite o numero de filmes para listar: ");
                    nfilmes = sc.nextInt();
                    mf.exibeFilmes(npagina,nfilmes);

            }
        }while(select !=0);
    }

}
