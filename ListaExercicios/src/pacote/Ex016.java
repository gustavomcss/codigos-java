package pacote;

import java.util.Scanner;

public class Ex016 {
    
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        num1 = s1.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = s1.nextInt();
        s1.close();

        soma = num1 + num2;

        System.out.println("");
        if (num1 > 10) {
            System.out.println("Você digitou um numero maior que 10, ele eh: " + num1);
        }

        if (num2 > 10) {
            System.out.println("Você digitou um numero maior que 10, ele eh: " + num2);
        }

        System.out.println("\nA soma entre " + num1 + " e " + num2 + " eh: " + soma);
    }
}
