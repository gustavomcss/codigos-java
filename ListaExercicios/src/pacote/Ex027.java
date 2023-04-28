package pacote;

import java.util.Scanner;

public class Ex027 {
    
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        lado1 = s1.nextInt();
        System.out.print("Digite o lado 2: ");
        lado2 = s1.nextInt();
        System.out.print("Digite o lado 3: ");
        lado3 = s1.nextInt();
        s1.close();

        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
            System.out.println("\nÉ possivel formar um triangulo!");
        } else {
            System.out.println("\nNao eh possivel formar um triangulo!");
        }
    }
}
