package pacote;

import java.util.Scanner;

public class Ex054 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n1, n2;

        System.out.print("Entre com o 1o numero: ");
        n1 = s1.nextInt();
        System.out.print("Entre com o 2o numero: ");
        n2 = s1.nextInt();
        s1.close();

        System.out.println("\nO MDC entre " + n1 + " e " + n2 + " eh: "+ mdc(n1,n2));
    }

    public static int mdc(int num1, int num2) {    
        int divisor = 2;
        int mdc = 1;

        while (num1 >= divisor && num2 >= divisor) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                mdc = mdc * divisor;
                num1 = num1 / divisor;
                num2 = num2 / divisor;
            } else {
                divisor++;
            }
        }
        
        return mdc;
    }
}
