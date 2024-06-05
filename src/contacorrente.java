public class contacorrente extends conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfoscomuns();
        imprimirExtrato();
    }

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
    
}
