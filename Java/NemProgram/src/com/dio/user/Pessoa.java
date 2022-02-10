package com.dio.user;

public class Pessoa {
    protected String nome;
    protected String nascimento;
    protected Double altura;
    protected Double peso;

    public Pessoa(String nome, String nascimento, Double altura, Double peso) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento='" + nascimento + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
