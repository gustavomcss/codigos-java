package pacote;

import java.util.Scanner;

public class Ex036 {

    public static void main(String[] args) {
        int num, i, cont = 0;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();

        for (i = 2; i <= num; i++) {
            if ((num % i) == 0) {
                cont = cont + 1;
            }
        }

        if (cont == 1) {
            System.out.println("\nO numero " + num + " eh primo!");
        } else {
            System.out.println("\nO numero " + num + " nao eh primo!");
        }

    }
}