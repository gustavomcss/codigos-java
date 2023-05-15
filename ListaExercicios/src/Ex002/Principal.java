package Ex002;

import java.util.Scanner;

public class Principal {
    
    public static void exibirMenu() {
        System.out.println("\n========= MENU ========\n");
        System.out.println("[1] Adicionar Passageiros");
        System.out.println("[2] Remover Passageiros");
        System.out.println("[3] Verificar Passageiros");
        System.out.println("[4] Sair do Programa");
        System.out.print("\nSua Escolha: ");
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String dataVoo, horarioVoo;
        int opc;

        System.out.print("Data do Voo: ");
        dataVoo = s1.nextLine();
        System.out.print("Horario do Voo: ");
        horarioVoo = s1.nextLine();

        Voo voo1 = new Voo(dataVoo, horarioVoo);

        do {
            exibirMenu();
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Passageiros a Adicionar: ");
                    voo1.AddPassageiros(s1.nextInt());
                    break;
                case 2:
                    System.out.print("Passageiros a Remover: ");
                    voo1.RemPassageiros(s1.nextInt());
                    break;
                case 3:
                    System.out.println(voo1.toString());
                    break;
                case 4:
                    System.out.println("\nEncerrando o Programa! ");
                    break;
                default:
                    System.out.println("\nOpcao Invalida! ");
            }

        } while (opc != 4);

        s1.close();
    }
}
