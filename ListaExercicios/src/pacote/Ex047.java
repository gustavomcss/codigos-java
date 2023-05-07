package pacote;

import java.util.Scanner;

public class Ex047 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num;

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();

        if (ehPrimo(num) == true) {
            System.out.println("O numero " + num + "eh primo! ");
        }
        else {
            System.out.println("O numero " + num + "nao eh primo! ");
        }
    }

    public static Boolean ehPrimo(int numero) {
        int i;
                
        for (i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
