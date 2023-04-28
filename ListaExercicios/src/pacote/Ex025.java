package pacote;

import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        num1 = s1.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = s1.nextInt();
        s1.close();

        if (num1 > num2) {
            System.out.println("\nCrescente: [" + num2 + "] [" + num1 + "]");
        } else {
            System.out.println("\nCrescente: [" + num1 + "] [" + num2 + "]");
        }
    }
}
