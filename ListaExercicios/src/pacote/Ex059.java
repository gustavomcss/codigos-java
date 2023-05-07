package pacote;

import java.util.Scanner;

public class Ex059 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int l1, l2, l3;

        System.out.print("Entre com o lado 1: ");
        l1 = s1.nextInt();
        System.out.print("Entre com o lado 2: ");
        l2 = s1.nextInt();
        System.out.print("Entre com o lado 3: ");
        l3 = s1.nextInt();

        if (formaTriangulo(l1, l2, l3) == true) {
            System.out.println("\nOs lados formam um triangulo! ");
        } else {
            System.out.println("\nOs lados nao formam um triangulo!");
        }

        if (formaTriangulo(l1, l2, l3) == true) {
            if (tipoTriangulo(l1, l2, l3) == 0) {
                System.out.print("Eh um triangulo EQUILATERO!\n");
            } else {
                if (tipoTriangulo(l1, l2, l3) == 1) {
                    System.out.print("Eh um triangulo ESCALENO!\n");
                } else {
                    System.out.print("Eh um triangulo ISOCELES!\n");
                }
            }
        }

        if(formaTriangulo(l1, l2, l3) == true) {
            System.out.println("O perimetro do triangulo eh: " + perimetro(l1, l2, l3));
        }
    }

    public static boolean formaTriangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true; // Formam um triângulo
        } else {
            return false; // Não formam um triângulo
        }
    }

    public static int tipoTriangulo(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return 0; // Equilátero
        } else {
            if (a != b && b != c && a != c) {
                return 1; // Escaleno
            } else {
                return 2; // Isósceles
            }
        }   
    }

    public static int perimetro(int a, int b, int c) {
        int perimetro = a + b + c;
        return perimetro;
    }
}
