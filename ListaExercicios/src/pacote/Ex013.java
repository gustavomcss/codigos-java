package pacote;

import java.util.Scanner;

public class Ex013 {
    
    public static void main(String[] args) {
        double num, inteira, frac, redondo;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com um numero com parte fracionaria: ");
        num = s1.nextDouble();
        s1.close();

        inteira = (int) num;
        frac = num - (int)num;
        redondo = Math.round(num);

        System.out.println("Parte Inteira: " + inteira);
        System.out.println("Parte Fracionaria: " + frac);
        System.out.println("Arredondamento: " + redondo);
    }
}
