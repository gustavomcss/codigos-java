package pacote;

import java.util.Scanner;

public class Ex049 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num;

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();

        if(ehImpar(num) == true) {
            System.out.println("O numero " + num + " eh impar! ");
        }
        else {
            System.out.println("O numero " + num + " nao eh impar!");
        }
    }

    public static Boolean ehImpar(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        return true;
    }
}
