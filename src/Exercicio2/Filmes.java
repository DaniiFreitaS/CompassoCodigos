package Exercicio2;

public class Filmes {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer ano;

    public Filmes(String nome, String descricao, Integer ano) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
