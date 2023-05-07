package pacote;

import java.util.Scanner;

public class Ex048 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num;

        System.out.print("Entre com um numero: ");
        num = s1.nextInt();
        s1.close();

        if(ehPar(num) == true) {
            System.out.println("O numero " + num + " eh par! ");
        }
        else {
            System.out.println("O numero " + num + " eh impar! ");
        }
    }

    public static Boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }
}
