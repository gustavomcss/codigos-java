package Ex004;

public class ContaBancaria {
    public String nome;
    public int numeroConta;
    public double saldo;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("\nDEPOSITO DE R$" + valor + " \nRealizado na Conta " +numeroConta);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("\nSAQUE DE R$" + valor + "\nRealizado na Conta " + numeroConta);
        } else {
            System.out.println("Saldo Insuficiente para Saque na Conta " + numeroConta);
        }
    }

    public void verificarSaldo() {
        System.out.println("\nSALDO DA CONTA " + numeroConta + "\nSaldo: R$" + saldo);
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            destino.depositar(valor);
            System.out.println("\nTRANSFERENCIA DE R$" + valor + "\nRealizado na Conta " + numeroConta + " para a Conta " + destino.numeroConta);
        } else {
            System.out.println("Saldo Insuficiente para Transferencia na Conta " + numeroConta);
        }
    }

}
