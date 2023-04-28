package pacote;

import java.util.Scanner;

public class Ex024 {
    
    public static void main(String[] args) {
        int num1, num2, maior = 0;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        num1 = s1.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = s1.nextInt();
        s1.close();

        if (num1 > maior) {
            maior = num1;
        } 
        
        if (num2 > maior) {
            maior = num2;
        }

        System.out.println("\nO maior numero eh: " + maior);
    }
}
