package pacote;

import java.util.Scanner;

public class Ex053 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int dec;
        
        System.out.print("Entre com um numero: ");
        dec = s1.nextInt();
        s1.close();

        System.out.println("\nO numero " + dec + " em binario eh: " + decimalParaBinario(dec));
    }

    public static String decimalParaBinario(int dec) {
        String bin = "";
        int resto;
        
        if (dec == 0) {
            return "0";
        }
        
        while (dec > 0) {
            resto = dec % 2;
            bin = resto + bin;
            dec = dec / 2;
        }

        return bin;
    }
}
