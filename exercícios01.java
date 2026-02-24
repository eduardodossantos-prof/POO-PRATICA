class ContaBancaria{
    private String titular;
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }
    
    //Serve para retornar o valor de um atributo privado ou protegido por uma classe
    public String getTitular(){
        return titular;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    //Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    //Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else if (valor > saldo){
            System.out.println("Saque negado! Saldo insuficiente para o valor de R$ " + valor);
        } else{
            System.out.println("Valor inválido para saque.");
        }
    }
}

class Main{
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("Maria Oliveira", 98765);

        System.out.println("Conta criada para: " + conta1.getTitular());
        System.out.println("Número da conta: " + conta1.getNumeroDaConta());
        System.out.println("Saldo inicial: R$ " + conta1.getSaldo());
        System.out.println("-----------------------------------------------");

        conta1.depositar(1000.0);
        conta1.sacar(300.0);
        conta1.sacar(800.0);

        System.out.println("---------------------------------");
        System.out.println("Saldo final de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());
    }
}