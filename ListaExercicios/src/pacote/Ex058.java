package pacote;

import java.util.Scanner;

public class Ex058 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int tamanho, i;

        System.out.print("Entre com o tamanho do vetor: ");
        tamanho = s1.nextInt();

        int[] A = new int[tamanho];

        for(i = 0; i < tamanho; i++) {
            System.out.print("Entre com o " + (i+1) + "o valor: ");
            A[i] = s1.nextInt();
        }

        if (ordenacao(A, tamanho) == 1) {
            System.out.println("\nO vetor esta ordenado decrescentemente! ");
        } else {
            System.out.println("\nO vetor nao esta ordenado decrescentemente! ");
        }

    }

    public static int ordenacao(int[] B, int tamanho) {
        int j;

        for (j = 1; j < tamanho; j++) {
            if (B[j] < B[j-1]) {
                return 1;
            }
        }
        return 0;
    }
}
