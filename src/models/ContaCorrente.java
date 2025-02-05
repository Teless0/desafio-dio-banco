package models;

public class ContaCorrente extends Conta{

  
    public ContaCorrente(Cliente cliente) {
            super(cliente);
        }
    
        public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosComuns();
    }

        @Override
        public void exibirHistorico() {
            super.exibirHistorico();
        }
        
  
}
