package pacote;

import java.util.Scanner;

public class Ex044 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[][] A = new int[4][4];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Entre com um numero em [" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = s1.nextInt();
            }
        }

        for (j = 0; j < 4; j++) {
            for (i = 0; i < 4; i++) {
                System.out.print("[" + A[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
