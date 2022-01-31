package com.mobilizar;

import java.sql.SQLOutput;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println(String.format("Saque: %s, Saldo atual: %s ", valor, saldo));

            return true;
        }

        System.out.println("Saque: Saldo indisponível!");
        return false;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("Deposito: %s, Novo Saldo: %s ", valor, saldo));
    }

    @Override
    public void trasnferencia(double valor, Conta contaDesposito) {
        if (this.sacar(valor)) {
            contaDesposito.depositar(valor);
            System.out.println(String.format("Transferência valor: %s, Para: %s ",valor, contaDesposito.cliente.getNome()));
        }else {
            System.out.println("Transferência falhou!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
