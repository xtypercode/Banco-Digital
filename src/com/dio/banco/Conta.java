package com.dio.banco;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Conta {
    private String numConta;
    private Cliente cliente;
    private double saldo;
    private double limite;
    private Set<String> accoes = new LinkedHashSet<>();
    private String banco;

    public Conta (String numConta, Cliente cliente, double saldo, double limite){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean deposito (double valor){
        this.saldo += valor;
        accoes.add("\nDeposito (" + LocalDate.now() + "): " + valor + " Akz");
        return true;
    }

    public boolean saque (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            accoes.add("\nLevantamento (" + LocalDate.now() + "): " + valor + " Akz");
            return true;
        }

        return false;
    }

    public boolean transferir (Conta conta, double valor){
        if(this.saldo >= valor){
            saque(valor);
            accoes.add("\nTransferência (" + LocalDate.now() + "): " + valor + " Akz" +
                        " -> Destinatário: " + conta.getNumConta() + " - " + conta.cliente.getNome() +" - Banco: " + conta.getBanco());
            return conta.deposito(valor);
        }
        return false;
    }

    public String extrato (){
        accoes.add("\n");
        return  "---------------------------\n"+
                "Banco: "+ this.banco +"\n"+
                "Nome: "+ cliente.getNome() +"\n"+
                "Numero da Conta: "+ getNumConta() +"\n"+
                "Saldo Actual: "+getSaldo() +"\n"+
                "Movimentos na Conta: " +"\n"+
                 getAccoes() +"\n"+
                "---------------------------\n";
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Set<String> getAccoes() {
        return accoes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAccoes(String accoes) {
        this.accoes.add(accoes);
    }

    @Override
    public String toString() {
        return "Nº Conta: " + getNumConta() + ", Titular: " + cliente.getNome();
    }
}
