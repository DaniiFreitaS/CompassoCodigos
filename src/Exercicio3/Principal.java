package Exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        String verifica = "";
        Boolean fecha = false;
        do {
            System.out.println("Digite a frase a ser analisada ou digite SAIR para finalizar o programa: ");
            verifica = sc.nextLine();
            System.out.println(verifica);
            if(verifica.equals("SAIR")){
                fecha = true;
            }else{
                System.out.println(op.Resultado(verifica));//metodo verifica retorna ja a frase analisada
            }
        }while (!fecha);
    }
}
