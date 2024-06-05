public class Main {
    public static void main(String[] args, cliente cliente) {
        
        cliente Ramilton = new cliente();
        Ramilton.setNome("");

        conta cc = new contacorrente();
        conta poupanca = new contapoupanca();

        cc.depositar();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}