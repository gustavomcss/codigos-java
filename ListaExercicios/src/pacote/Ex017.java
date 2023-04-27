package pacote;

import java.util.Scanner;

public class Ex017 {
   
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = s1.nextInt();
        s1.close();

        if ((num % 2) == 0) {
            System.out.println("\nO numero " + num + " eh par!");
        } else {
            System.out.println("\nO numero " + num + " eh impar!");
        }
    }
}
