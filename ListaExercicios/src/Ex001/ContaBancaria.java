package Ex001;

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
        System.out.println("\nDepósito Realizado!\nNovo Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("\nSaque Realizado!\nNovo Saldo: " + saldo);
        } else {
            System.out.println("\nSaldo Insuficiente.");
        }
    }

    public void verificarSaldo() {
        System.out.println("\nConta: " + numeroConta + "  Titular: " + nome);
        System.out.println("Saldo Atual: " + saldo);
    }
}
