package pacote;

import java.util.Scanner;

public class Ex033 {
    
    public static void main(String[] args) {
        int num, i, soma = 0;
        Scanner s1 = new Scanner(System.in);

        for (i = 0; i < 20; i++) {
            System.out.print("Entre com um numero: ");
            num = s1.nextInt();
            if ((num * num) < 225) {
                soma = soma + num;
            }
        }

        System.out.println("\nA soma dos numeros cujos quadrados são menores que 225 (ate 15) eh: " + soma);
    }
}
