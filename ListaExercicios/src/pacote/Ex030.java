package pacote;

import java.util.Scanner;

public class Ex030 {

    public static void main(String[] args) {
        double[] num = new double[10];
        int i;
        Scanner s1 = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Entre com um numero: ");
            num[i] = s1.nextInt();
        }

        System.out.println("\nA metade de cada numero eh: ");
        for (i = 0; i < 10; i++) {
            num[i] = num[i] / 2;
            System.out.print(" [" + num[i] + "] ");
        }
        System.out.println("\n");

    }    
}
