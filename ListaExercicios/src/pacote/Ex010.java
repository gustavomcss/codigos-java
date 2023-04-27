package pacote;

import java.util.Scanner;

public class Ex010 {
    
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Base do Triangulo: ");
        base = s1.nextInt();
        System.out.print("Altura do Triangulo: ");
        altura = s1.nextInt();
        s1.close();

        area = (base * altura) / 2.0;

        System.out.println("\nA area do Triangulo eh: " + area);
    }
}
