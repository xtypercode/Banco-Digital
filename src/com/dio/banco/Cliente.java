package com.dio.banco;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String nif;

    public Cliente(String nome, String sobrenome, String nif){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
