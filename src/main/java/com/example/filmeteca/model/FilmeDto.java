package com.example.filmeteca.model;

public class FilmeDto {
    private String nome;
    private Integer duracao;
    private Integer ano;
    private String genero;

    public FilmeDto(String nome, Integer duracao, Integer ano, String genero) {
        this.nome = nome;
        this.duracao = duracao;
        this.ano = ano;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "DadosFilmeCadastro{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", ano=" + ano +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Integer getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }


}
