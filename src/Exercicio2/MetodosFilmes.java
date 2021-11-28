package Exercicio2;


import java.sql.Connection;
import java.sql.SQLException;

public class MetodosFilmes {
    //no futuro seria bom integrar com alguma api para cadastrar automaticamente
    public static void insereFilmes() throws SQLException {
        Filmes ratatuile = new Filmes("Ratatuile", "ratatuile conta a historia de um rato", 2001);
        Filmes carros = new Filmes("Carros", "Carros conta a historia do relampago macquen", 1999);
        Filmes akira = new Filmes("Akira", "akira conta a historia de um garoto em uma moto", 1997);
        Filmes naruto = new Filmes("naruto", "naruto e um ninja sem familia", 2002);
        Filmes venon = new Filmes("Venon", "conta a historia do vilao do homi aranha", 2021);
        Filmes goku = new Filmes("Dragon Ball", "Conta a historia de goku crianca", 1990);
        Filmes gokua = new Filmes("Dragon ball z", "conta a historia de goku adulto", 1999);
        Filmes boruto = new Filmes("Boruto", "Continuacao de naruto", 2016);
        Filmes eternals = new Filmes("Eternals", "Filme da marvel", 2021);
        Filmes minions = new Filmes("Minions", "Filme dos minions", 2018);
        Filmes chaves = new Filmes("Chaves", "nao e o filme do pele", 1970);
        Filmes pele = new Filmes("Pele", "nao e o filme do chaves", 1970);
        Filmes carrosel = new Filmes("Carrosel", "filme do cirilo", 2015);
        Filmes cinza = new Filmes("50 tons de cinza", "filme de safadeza", 2013);
        Filmes aoi = new Filmes("Aoi tori", "filme sobre musica", 2017);
        Filmes flamengo = new Filmes("Flamengo", "documentario sobre o Flamengo", 2010);
        Filmes vasco = new Filmes("Vasco", "documentario sobre o Vasco", 2000);
        Filmes palmeiras = new Filmes("Palmeiras", "filme conta a historia sobre ilhas do oceano pacifico", 1987);
        Filmes loro = new Filmes("Ana maria braga receitas", "filme contem as melhores receitas que passaram no programa", 2013);
        Filmes ingles = new Filmes("Dora aventureira", "filme sobre as aventuras de dora aventureira", 1999);

        try (Connection connection = (Connection) new ConnectionFactory().recuperarConexao()){
            if (new OperacoesFilmes(connection).getlistaFilmes().size() == 0){
                new OperacoesFilmes(connection).salvaFilme(ratatuile);
                new OperacoesFilmes(connection).salvaFilme(carros);
                new OperacoesFilmes(connection).salvaFilme(akira);
                new OperacoesFilmes(connection).salvaFilme(naruto);
                new OperacoesFilmes(connection).salvaFilme(venon);
                new OperacoesFilmes(connection).salvaFilme(goku);
                new OperacoesFilmes(connection).salvaFilme(gokua);
                new OperacoesFilmes(connection).salvaFilme(boruto);
                new OperacoesFilmes(connection).salvaFilme(eternals);
                new OperacoesFilmes(connection).salvaFilme(minions);
                new OperacoesFilmes(connection).salvaFilme(chaves);
                new OperacoesFilmes(connection).salvaFilme(pele);
                new OperacoesFilmes(connection).salvaFilme(carrosel);
                new OperacoesFilmes(connection).salvaFilme(cinza);
                new OperacoesFilmes(connection).salvaFilme(aoi);
                new OperacoesFilmes(connection).salvaFilme(flamengo);
                new OperacoesFilmes(connection).salvaFilme(vasco);
                new OperacoesFilmes(connection).salvaFilme(palmeiras);
                new OperacoesFilmes(connection).salvaFilme(loro);
                new OperacoesFilmes(connection).salvaFilme(ingles);
            }else{
                System.out.println("Filmes ja cadastrados!");
            }


        }

    }
    // n = numero da pagina
    //p = quantidade de paginas
    public void exibeFilmes(Integer n, Integer p) throws SQLException{
        int i = 0;
        int k;

        if (n == 1){
            k = 0;
        }else{
            k = p;
            p = p*n;
        }
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            do {

                if (k < p) {
                    i = new OperacoesFilmes(connection).exibeFilmes(k);
                    k++;
                }else{
                    i = 0;
                }
            } while (i != 0);
        }



       // try (Connection connection = new ConnectionFactory().recuperarConexao()){
         //   new OperacoesFilmes(connection).exibeFilmes();

        //}

    }
}
