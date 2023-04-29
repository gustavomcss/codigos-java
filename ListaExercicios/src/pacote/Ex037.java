package pacote;

import java.util.Scanner;

public class Ex037 {
    
    public static void main(String[] args) {
        int num1, num2, i = 2, mdc = 1;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com o primeiro valor: ");
        num1 = s1.nextInt();
        System.out.print("Entre com o segundo valor: ");
        num2 = s1.nextInt();
        s1.close();

        while (i < 10) {
            if (((num1 % i) == 0) || ((num2 % i) == 0)) {
                num1 = num1 / i;
                num2 = num2 / i;
                mdc = mdc * i;
            } else {
                i++;
            }
        }

        System.out.println("O mdc dos dois numeros eh: ");
    }
}
