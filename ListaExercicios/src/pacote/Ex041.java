package pacote;

import java.util.Scanner;

public class Ex041 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] lista = new int[10];
        int tamanhoSublista = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            lista[i] = s1.nextInt();
        }

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > lista[i-1]) {
                tamanhoSublista++;
            }
        }

        if (tamanhoSublista == 1) {
            tamanhoSublista = 0;
        }
        s1.close();
        
        System.out.println("A subslista tem " + tamanhoSublista + " itens em ordem.");
    }
}
