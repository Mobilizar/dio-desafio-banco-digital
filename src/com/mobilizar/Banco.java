package com.mobilizar;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        if (this.contas == null)
            this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void bemVindo() {
        System.out.println("Bem-vindo, ao Banco Do Silvo Santos");
    }

    public void listarCliente() {
        for (Conta conta : contas) {
            System.out.println(String.format("Cliente: %s", conta.cliente.getNome()));
        }
    }
}
