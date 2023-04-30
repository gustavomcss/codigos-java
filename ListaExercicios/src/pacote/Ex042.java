package pacote;

import java.util.Scanner;

public class Ex042 {
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int i, j;
        Scanner s1 = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Valor em [" + (i+1) + "] [" + (j+1) + "]: ");
                matriz[i][j] = s1.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i >= j) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
