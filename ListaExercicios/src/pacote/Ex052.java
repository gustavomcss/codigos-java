package pacote;

import java.util.Scanner;

public class Ex052 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] A = new int[3];
        int i;

        for (i = 0; i < 3; i++) {
            System.out.print("Entre com o " + (i+1) + "o numero: ");
            A[i] = s1.nextInt();
        }  
                
        System.out.print("\nLista Ordenada Decrescentemente: ");
        for (i = 0; i < 3; i++) {
            System.out.print("[" + ordenarNumeros(A)[i] + "] ");
        }      
        System.out.println("");
    
    }

    public static int[] ordenarNumeros(int[] B) {

        if (B[0] < B[1]) {
            int temp = B[0];
            B[0] = B[1];
            B[1] = temp;
        }
        if (B[1] < B[2]) {
            int temp = B[1];
            B[1] = B[2];
            B[2] = temp;
            if (B[0] < B[1]) {
                temp = B[0];
                B[0] = B[1];
                B[1] = temp;
            }
        }
        return B;
    }
}
