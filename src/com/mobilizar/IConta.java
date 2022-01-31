package com.mobilizar;

public interface IConta {
    boolean sacar(double valor);

    void depositar(double valor);

    void trasnferencia(double valor, Conta contaDesposito);

    void imprimirExtrato();
}
