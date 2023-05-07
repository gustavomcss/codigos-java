package pacote;

import java.util.Scanner;

public class Ex043 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j;
        int[][] A = new int[4][4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Entre com um numero em [" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = s1.nextInt();
            }
        }

        System.out.println("\nMatriz completa: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + A[i][j] + "] ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz com Nº impar");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (A[i][j] % 2 == 0 ) {
                    System.out.print("[  ] ");
                }
                else {
                    System.out.print("[" + A[i][j] + "] ");
                }
            }
            System.out.println("");
        }
    }
}
