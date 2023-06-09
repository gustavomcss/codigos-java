package pacote;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int mdc = 1;
        int divisor = 2;
        
        System.out.print("Digite o primeiro número: ");
        int num1 = s1.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = s1.nextInt();  
        s1.close();     
        
        while (num1 >= divisor && num2 >= divisor) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                mdc = mdc * divisor;
                num1 = num1 / divisor;
                num2 = num2 / divisor;
            } else {
                divisor++;
            }
        }
        
        System.out.println("\nO Máximo Divisor Comum é " + mdc);
    }
}
