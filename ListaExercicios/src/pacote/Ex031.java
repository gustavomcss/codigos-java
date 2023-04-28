package pacote;

import java.util.Scanner;

public class Ex031 {
    
    public static void main(String[] args) {
        int limite, incremento, num = 0;
        Scanner s1 = new Scanner(System.in);

        do {
            System.out.print("Limite Superior: ");
            limite = s1.nextInt();
            if (limite <= 0) {
                System.out.println("Erro! O valor deve ser maior que 0!\n");
            }
        } while (limite <= 0);

        do {
            System.out.print("Incremento: ");
            incremento = s1.nextInt();
            if (incremento == 0) {
                System.out.println("Erro! O incremento deve ser diferente de 0!\n");
            }
        } while (incremento == 0);
        s1.close();

        System.out.print("\nIntervalo: ");
        while (num <= limite) {
            System.out.print(" [" + num + "] ");
            num = num + incremento;
        }
        System.out.println("");
    }
}
