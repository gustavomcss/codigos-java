package pacote;

import java.util.Scanner;

public class Ex008 {
    
    public static void main(String[] args) {
        double saldo;

        System.out.print("Digite o valor do saldo: ");
        Scanner s1 = new Scanner(System.in);
        saldo = s1.nextDouble();
        s1.close();

        saldo = (saldo * 0.01) + saldo;
        System.out.println("\nO novo saldo com reajuste de 1% eh: " + saldo);
    }
}
