package services;
import java.util.ArrayList;
import java.util.List;
import models.Conta;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);

    }
    public void exibirConta(){
        System.out.println("Contas do banco" + this.nome + ":");
        for (Conta conta : this.contas) {
            conta.imprimirInfosComuns();
            System.out.println("--------------------------");
            
        }
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
