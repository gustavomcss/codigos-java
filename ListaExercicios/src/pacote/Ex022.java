package pacote;

import java.util.Scanner;

public class Ex022 {
    
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();
        
        System.out.println("");
        if (num < 20) {
            System.out.println("O numero " + num + " eh menor que 20.");
        }

        if (num > 20) {
            System.out.println("O numero " + num + " eh maior que 20.");
        }

        if (num == 20) {
            System.out.println("O numero " + num + " eh igual a 20.");
        }

    }
}
