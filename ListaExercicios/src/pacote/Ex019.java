package pacote;

import java.util.Scanner;

public class Ex019 {
    
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = s1.nextInt();
        s1.close();

        if ((num % 5) == 0) {
            System.out.println("\nO numero " + num + " eh divisivel por 5!");
        } else {
            System.out.println("\nO numero " + num + " nao eh divisivel por 5!");
        }
    }
}
