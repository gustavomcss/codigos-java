package pacote;

import java.util.Scanner;

public class Ex011 {
    
    public static void main(String[] args) {
        int valor;
        double total;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite o valor gasto no restaurante: ");
        valor = s1.nextInt();
        s1.close();

        total = (valor * 0.10) + valor;

        System.out.println("\nO valor total com a gorjeta de 10% eh: " + total);
    }
}
