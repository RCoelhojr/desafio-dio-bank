public class contapoupanca extends conta {

    @Override
    public void transferir(double valor, conta contaDestino) {
     
        super.transferir(valor, contaDestino);
    }

    @Override
    public void depositar() {
       
        
    }

    @Override
    public void sacar() {
        
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfoscomuns();
        imprimirExtrato();
        
    }
    
}
