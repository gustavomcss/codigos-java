package pacote;

import java.util.Scanner;

public class Ex057 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] A = new int[10];
        int i, num;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "o valor: ");
            A[i] = s1.nextInt();
        }

        System.out.print("\nDigite um valor para pesquisar no vetor: ");
        num = s1.nextInt();
        
        if (buscaVetor(A, num) == true) {
            System.out.println("\nO elemento " + num + " esta presente no vetor!");
        } else {
            System.out.println("\nO elemento " + num + " nao esta presente no vetor!");

        }
    }

    public static Boolean buscaVetor(int[] A ,int num){
        int j;

        for (j = 0; j < 10; j++) {
            if (A[j] == num) {
                return true;
            }
        }

        return false;
    }
}
