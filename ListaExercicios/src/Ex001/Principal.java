package Ex001;

import java.util.Scanner;

public class Principal {
    
    public static void exibirMenu() {
        System.out.println("\n========= MENU =========\n");
        System.out.println("[1] Depositar dinheiro");
        System.out.println("[2] Sacar dinheiro");
        System.out.println("[3] Verificar saldo");
        System.out.println("[4] Sair do Programa");
        System.out.print("\nEscolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String nomeTitular;
        int numeroConta, opc;
        double valorDeposito, valorSaque;

        System.out.print("Nome do Titutlar da Conta: ");
        nomeTitular = s1.nextLine();
        System.out.print("Digite o Numero da Conta: ");
        numeroConta = s1.nextInt();

        ContaBancaria conta = new ContaBancaria(nomeTitular, numeroConta);
        System.out.println("\nBem Vindo, " + conta.nome + "! O numero da sua conta eh: " + conta.numeroConta);


        do {
            exibirMenu();
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    valorDeposito = s1.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    valorSaque = s1.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.verificarSaldo();
                    break;
                case 4:
                    System.out.println("\nEncerrando Programa... ");
                    break;
                default:
                    System.out.println("Opcao Invalida!!");
                    break;
            }

        } while (opc != 4);
        
        s1.close();
    }

}
