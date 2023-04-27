package pacote;

import java.util.Scanner;

public class Ex015 {
    
    public static void main(String[] args) {
        int baseMaior, baseMenor, altura;
        double area;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com a Base Maior: ");
        baseMaior = s1.nextInt();
        System.out.print("Entre com a Base Menor: ");
        baseMenor = s1.nextInt();
        System.out.print("Entre com a altura: ");
        altura = s1.nextInt();
        s1.close();

        area = ((baseMaior + baseMenor) * altura) / 2.0;

        System.out.println("\nA Area do Trapezio eh: " + area);
    }
}
