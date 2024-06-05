public abstract class conta implements iConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public conta() {
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    
    
 
    @Override
    public String toString() {
        return "conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }



    @Override
    public void depositar() {
        
        
    }



    @Override
    public void sacar() {
        
     
    }



    @Override
    public void transferir(double valor, conta contaDestino) {
        
        
    }

    public int getAgencia() {
        return agencia;
    }



    public int getNumero() {
        return numero;
    }



    public double getSaldo() {
        return saldo;
    }

    

    protected void imprimirInfoscomuns() {
        System.out.println(String.format("Agencia = %d" + agencia));
        System.out.println(String.format("Conta = %d" + numero));
        System.out.println(String.format("Saldo = %.2f" + saldo));

    }

    
}