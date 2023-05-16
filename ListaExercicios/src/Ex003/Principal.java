package Ex003;

import java.util.Scanner;

public class Principal {
    
    public static void exibirMenu() {
        System.out.println("\n=========== INFO ===========");
        System.out.println("[1] Ligar/Desligar TV");
        System.out.println("[2] Aumentar Volume");
        System.out.println("[3] Diminuir Volume");
        System.out.println("[4] Subir Canal");
        System.out.println("[5] Diminuir Canal");
        System.out.println("[6] Sair do Programa");
        System.out.print("\nSua escolha: ");
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int opc;

        Televisao tv = new Televisao();
        tv.mostrarInfo();

        do {
            exibirMenu();
            opc = s1.nextInt();
            System.out.println("");

            switch (opc) {
                case 1:
                    if (tv.onOff == true) {
                        tv.desligarTelevisao();
                    } else {
                        tv.ligarTelevisao();
                    }
                    tv.mostrarInfo();
                    break;
                case 2:
                    tv.aumentarVolume();
                    tv.mostrarInfo();
                    break;
                case 3:
                    tv.diminuirVolume();
                    tv.mostrarInfo();
                    break;
                case 4:
                    tv.subirCanal();
                    tv.mostrarInfo();
                    break;
                case 5:
                    tv.diminuirCanal();
                    tv.mostrarInfo();
                    
                    break;
                case 6:
                    System.out.println("Encerrando o Programa...");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        } while (opc != 6);

        s1.close();
    }
}
