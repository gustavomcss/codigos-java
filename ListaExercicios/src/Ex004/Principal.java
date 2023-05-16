package Ex004;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static ArrayList<ContaBancaria> contas = new ArrayList<>();
    public static Scanner s1 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;

        do {
            System.out.println("============ MENU ============");
            System.out.println("[1] Inserir Pessoa no Banco");
            System.out.println("[2] Acessar Conta Bancária");
            System.out.println("[3] Sair do Programa");
            System.out.print("\nSUA ESCOLHA: ");
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    inserirPessoa();
                    break;
                case 2:
                    acessarConta();
                    break;
                case 3:
                    System.out.println("\nEncerrando o Programa...");
                    break;
                default:
                    System.out.println("\nOpcao Invalida! ");
                    break;
            }
        } while(opc != 3);
    }

    public static void inserirPessoa() {
        String nome;
        int numeroConta;

        System.out.print("\nNome da Pessoa: ");
        nome = s1.next();
        System.out.print("Numero da Conta: ");
        numeroConta = s1.nextInt();

        if (buscarConta(numeroConta) != null) {
            System.out.println("\nNUMERO DE CONTA INDISPONIVEL!\nNao foi possivel Criar a Conta.\n");
            return;
        }

        ContaBancaria conta = new ContaBancaria(nome, numeroConta);
        contas.add(conta);

        System.out.println();
    }

    public static void acessarConta() {
        int numeroConta, numContaDestino, opc;
        double valorDeposito, valorSaque, valorTransferencia;
        
        if (contas.size() < 2) {
            System.out.println("\nEh necessário ter PELO MENOS 2 Contas Bancárias.\n");
            return;
        }

        System.out.print("\nDigite o Numero da Conta: ");
        numeroConta = s1.nextInt();
        
        ContaBancaria conta = buscarConta(numeroConta);

        if (conta == null) {
            System.out.println("\nConta não encontrada.\n");
            return;
        }

        do {
            System.out.println("\n====== CONTA BANCARIA " + numeroConta + " ======");
            System.out.println("[1] Depositar Dinheiro");
            System.out.println("[2] Sacar Dinheiro");
            System.out.println("[3] Verificar Saldo");
            System.out.println("[4] Transferir Dinheiro");
            System.out.println("[5] Voltar ao MENU");
            System.out.print("\nSua Escolha: ");
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nValor a ser Depositado: ");
                    valorDeposito = s1.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("\nValor a ser Sacado: ");
                    valorSaque = s1.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.verificarSaldo();
                    break;
                case 4:
                    System.out.print("\nNumero da Conta de Destino: ");
                    numContaDestino = s1.nextInt();
                    
                    ContaBancaria contaDestino = buscarConta(numContaDestino);

                    if (contaDestino == null) {
                        System.out.println("Conta de Destino Não Encontrada!");
                    } else {
                        System.out.print("Valor a ser Transferido: ");
                        valorTransferencia = s1.nextDouble();
                        conta.transferir(contaDestino, valorTransferencia);
                    }
                    break;
                case 5:
                    System.out.println("\nVoltando ao MENU... \n");
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente Novamente. ");
                    break;
            }
        } while (opc != 5);
        
    }

    public static ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.numeroConta == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
