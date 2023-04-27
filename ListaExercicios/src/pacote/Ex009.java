package pacote;

import java.util.Scanner;

public class Ex009 {
    
    public static void main(String[] args) {
        int base, altura, perimetro, area;
        double diagonal;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        base = s1.nextInt();
        System.out.print("Altura do retângulo: ");
        altura = s1.nextInt();
        s1.close();

        perimetro = (2 * base) + (2 * altura);
        area = base * altura;
        diagonal = Math.sqrt((altura * altura) + (base * base));

        System.out.println("\nPerimetro: " + perimetro);
        System.out.println("Area: " + area);
        System.out.printf("Diagonal: %.2f\n", diagonal);
    }
}
