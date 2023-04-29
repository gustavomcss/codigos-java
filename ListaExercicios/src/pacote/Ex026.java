package pacote;

import java.util.Scanner;

public class Ex026 {
    
    public static void main(String[] args) {
        int maior = 0, menor = 100000, i;
        int[] a = new int[5];
        try (Scanner s1 = new Scanner(System.in)) {
            for (i = 0; i < 5; i++){
                System.out.print("Digite o " + i + "o numero: ");
                a[i] = s1.nextInt();

                if (a[i] > maior) {
                    maior = a[i];
                }
                if (a[i] < menor) {
                    menor = a[i];
                }
            }
        }

        System.out.println("");
        System.out.println("O maior numero eh: " + maior);
        System.out.println("O menor numero eh: " + menor);
    }
}
