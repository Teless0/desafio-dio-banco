package interfaces;
/**
 * @author Teles
 * @version 1.0
 */
public interface Iconta {

/**
 * metodo para sacar valor em uma conta
 * @param valor valor a ser sacado
 */
     void sacar(double valor);
    /**
     * metodo para depositar valor em uma conta
     * @param valor valor a ser depositao
     */
     void depositar(double valor);
     /**
      * Metodo para transferir o valor de uma conta para outra, 
      * @param valor valor que vai ser sacado e depositado
      * @param contaDestino conta de destino para o valor ser depositado 
      */

     void transferir(double valor, Iconta contaDestino);
     /**
      * Método usado ná classe Conta para imprimir as informações do extrato do cliente
      */
     void imprimirExtrato();
     
     

    

}
