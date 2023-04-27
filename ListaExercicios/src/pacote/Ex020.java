package pacote;

import java.util.Scanner;

public class Ex020 {
    
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = s1.nextInt();
        s1.close();

        System.out.println("");
        if ((num % 3) == 0) {
            System.out.println("O numero " + num + " eh divisivel por 3!");
        } 
        
        if ((num % 7) == 0) {
            System.out.println("O numero " + num + " eh divisivel por 7!");
        }
    }
}
