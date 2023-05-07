package pacote;

import java.util.Scanner;

public class Ex045 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[][] A = new int[3][3];
        int i, j, linha;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Entre com um numero em [" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = s1.nextInt();
            }
        }

        do {
            System.out.println("\nLinha desejada para visualizar: [1 - 3]");
            linha = s1.nextInt();
        } while (linha < 1 || linha > 3);

        System.out.print("\nLinha [" + (linha) + "]: ");
        for (i = 0; i < 3; i++) {
            System.out.print("[" + A[linha-1][i] + "] ");
        }
        System.out.println("");
    }
}
