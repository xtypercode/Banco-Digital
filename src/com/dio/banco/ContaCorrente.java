package com.dio.banco;
import java.time.LocalDate;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numConta, Cliente cliente, double saldo, double limite){
        super(numConta, cliente, saldo, limite);
    }

    @Override
    public boolean saque (double valor){
        if(getSaldo() >= (valor + 0.10)){
            setSaldo(getSaldo() - (valor + 0.10));
            setAccoes("\nLevantamento (" + LocalDate.now() + "): " + valor + " Akz");
            return true;
        }

        return false;
    }
}
