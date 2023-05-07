package pacote;

import java.util.Scanner;

public class Ex056 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int tamanho, i, maior = 0;

        System.out.print("Digite o tamanho do vetor: ");
        tamanho = s1.nextInt();

        int[] A = new int[tamanho];
        for (i = 0; i < tamanho; i++) {
            System.out.print("Valor de [" + (i+1) + "]: ");
            A[i] = s1.nextInt();
        }

        for (i = 0; i < tamanho; i++) {
            if (A[i] > maior) {
                maior = A[i];
            }
        }

        System.out.println("\nO menor valor foi: " + maior);
    }
}
