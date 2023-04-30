package pacote;

import java.util.Scanner;

public class Ex040 {
    
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] V = new int[10];
        int i = 0, j = 0, k = 0;
        Scanner s1 = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            System.out.print("Valores da 1a Lista: ");
            A[x] = s1.nextInt();
        }

        System.out.println("");
        for (int x = 0; x < 5; x++) {
            System.out.print("Valores da 2a Lista: ");
            B[x] = s1.nextInt();
        }

        while (k < 10) {
            if (i < 5) {
                V[k] = A[i];
                i++;
                k++;
            }

            if (j < 5) {
                V[k] = B[j];
                j++;
                k++;
            }
        }

        System.out.print("\nVetor V: ");
        for (int y = 0; y < 10; y++) {
            System.out.print("[" + V[y] + "] ");
        }
    }
}
