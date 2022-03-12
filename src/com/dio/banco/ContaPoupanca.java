package com.dio.banco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numConta, Cliente cliente, double saldo, double limite){
        super(numConta, cliente, saldo, limite);
    }
}
