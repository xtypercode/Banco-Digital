package com.dio.banco;
import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {
    String nome;
    Set<Conta> Contas = new LinkedHashSet<>();

    public Banco(String nome){
        this.nome = nome;
    }

    public boolean registrarConta(Conta conta){
        if(!Contas.contains(conta)){
            Contas.add(conta);
            conta.setBanco(nome);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "---------------------------\n"+
                "Banco: '" + nome + "'\n" +
                "Contas: \n" + Contas + "\n" +
                "---------------------------\n";
    }
}
