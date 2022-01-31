package com.mobilizar;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("joão");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        Banco banco = new Banco();
        banco.getContas().add(cc);
        banco.getContas().add(cp);

        banco.bemVindo();
        banco.listarCliente();

        cc.depositar(100);
        cc.imprimirExtrato();

        cp.depositar(600);
        cp.sacar(200);
        cp.imprimirExtrato();

        cp.trasnferencia(100, cc);

        cp.imprimirExtrato();
        cc.imprimirExtrato();

        cp.trasnferencia(1000, cc);
    }
}
