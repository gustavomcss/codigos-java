package pacote;

import java.util.Scanner;

public class Ex023 {
    
    public static void main(String[] args) {
        int nasc, idade;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento (aaaa): ");
        nasc = s1.nextInt();
        s1.close();

        idade = 2023 - nasc;
        
        System.out.println("\nVoce tem " + idade + " anos.");
    }
}
