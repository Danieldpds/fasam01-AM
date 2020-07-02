package br.edu.fasam.atividade1.model;

public class Pessoa {
    private final String nome;
    private final String anoDeNascimento;
    private final String corDosOlhos;
    private final String genero;
    private final String corDoCabelo;

    public Pessoa(String nome, String anoDeNascimento, String corDosOlhos, String genero, String corDoCabelo) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.corDosOlhos = corDosOlhos;
        this.genero = genero;
        this.corDoCabelo = corDoCabelo;
    }

    @Override
    public String toString() {
        return ("Nome= " + nome + '\n' +
                "Ano de Nascimento= " + anoDeNascimento + '\n' +
                "Cor dos Olhos= " + corDosOlhos + '\n' +
                "Genero= " + genero + '\n' +
                "Cor do Cabelo= " + corDoCabelo
        );
    }
}
