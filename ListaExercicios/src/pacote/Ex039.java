package pacote;

import java.util.Scanner;

public class Ex039 {
    
    public static void main(String[] args) {
        int contMedia = 0, contMaiorMedia = 0, soma = 0, cont30 = 0, i = 0;
        float media;
        int[] num = new int[10];
        Scanner s1 = new Scanner(System.in);

        while (i < 10) {
            System.out.print("Entre com um número: ");
            num[i] = s1.nextInt();

            soma = soma + num[i];

            if (num[i] == 30) {
                cont30 = cont30 + 1;
            }

            i++;

        }

        media = soma / 10;

        for (i = 0; i < 10; i++) {
            if (num[i] > media) {
                contMaiorMedia = contMaiorMedia + 1;
            }
            if (num[i] == media) {
                contMedia = contMedia + 1;
            }
        }

        System.out.println("\nMedia: " + media);
        System.out.println("Iguais a 30: " + cont30);
        System.out.println("Maior a Media: " + contMaiorMedia);
        System.out.println("Iguais a Media: " + contMedia);
    }
}
