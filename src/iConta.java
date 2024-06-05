public interface iConta {
     void sacar(); 

     void depositar(); 

     void transferir(double valor, conta contaDestino); 

     void imprimirExtrato();
}
