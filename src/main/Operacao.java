package main;

import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;
import services.Banco;

public class Operacao {
    public static void main(String[] args) {
        Cliente Teles = new Cliente("Teles", "076.907.845-18");
        
        Banco banco = new Banco("Orion bank");
        //Criação de contas
        Conta cc = new ContaCorrente(Teles);
        Conta cp = new ContaPoupanca(Teles);

       //Realizando deposito em conta corrente
        cc.depositar(100);

        //Realizando trasnferenica entre contas
        cc.transferir(50, cp);
        //Imprimindo extrato das contas
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        //Exibindo o historico das contas
        cc.exibirHistorico();
        cp.exibirHistorico();
        
        //Adiconando as contas
        banco.adicionarConta(cp);
        banco.adicionarConta(cc);

        //Exibindo contas criadas
        banco.exibirConta();
    }
}
