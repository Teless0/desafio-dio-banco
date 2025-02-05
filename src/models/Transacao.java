package models;

import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime dataHora;

    public Transacao(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }
   
  
    public String toString() {
        
        return dataHora + "|" + tipo + "| R$" + valor;
    }
}

