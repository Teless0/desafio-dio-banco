package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Iconta;

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private List<Transacao> historico;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
        historico.add(new Transacao("Deposito", valor));
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo = saldo - valor;
            historico.add(new Transacao("Saque", valor));
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
    public void transferir(double valor, Iconta contaDestino) {
        if (valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            registrarTransacao("tranferencia enivada", valor);
            ((Conta)contaDestino).registrarTransacao("Tranferenica recebida", valor);
        } else {
            System.out.println("Valor insuficiente para ôperação");
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

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void exibirHistorico() {
        System.out.println("Historico de transações");
        for (Transacao transacao : historico) {
            System.out.println(transacao);

        }
    }

    private void registrarTransacao(String tipo, double valor) {
        historico.add(new Transacao(tipo, valor));
    }

  
}
