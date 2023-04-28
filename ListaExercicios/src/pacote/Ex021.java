package pacote;

import java.util.Scanner;

public class Ex021 {
    
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();

        System.out.println("");
        if ((num % 2) == 0) {
            System.out.println("O numero " + num + " eh divisivel por 2!");
        } 
        
        if ((num % 5) == 0) {
            System.out.println("O numero " + num + " eh divisivel por 5!");
        } 
        
        if ((num % 10) == 0) {
            System.out.println("O numero " + num + " eh divisivel por 10!");
        }

        if ((num % 2) != 0 && ((num % 5) != 0) && ((num % 10) != 0)) {
            System.out.println("O numero " + num + " nao eh divisivel por nenhum numero.");
        }
    }
}
