package pacote;

import java.util.Scanner;

public class Ex034 {
    
    public static void main(String[] args) {
        int num, i;
        Scanner s1 = new Scanner(System.in);

        do {
            int[] div = new int[10];
            System.out.println("Se desejar sair, digitar -999.");
            System.out.print("Entre com um numero: ");
            num = s1.nextInt();

            if (num != -999) {
                for (i = 1; i <= 10; i++) {
                    if ((num % i) == 0){
                        div[i-1] = i;
                    }
                }
    
                System.out.println("\nOs divisores de " + num + " sao: ");
                
                for (i = 0; i < 10; i++) {
                    System.out.print("[" + div[i] + "] ");
                }
                
                System.out.println("");
            }

            System.out.println("");

        } while (num != -999);
    }
}
