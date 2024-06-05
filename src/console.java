public class console { 
        public static void main(String[] args) {
            
            cliente Ramilton = new cliente();
            Ramilton.setNome("Ramilton");
    
            conta cc = new contacorrente();
            conta poupanca = new contapoupanca();
    
            cc.depositar();
            cc.transferir(100, poupanca);
    
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
}


