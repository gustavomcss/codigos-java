package pacote;

import java.util.Scanner;

public class Ex012 {
    
    public static void main(String[] args) {
        int hora, minutos, passados;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Entre com a hora atual: ");
        hora = s1.nextInt();
        System.out.print("Entre com os minutos atuais: ");
        minutos = s1.nextInt();
        s1.close();

        passados = (hora * 60) + minutos;

        System.out.println("\nSe passaram " + passados + " minutos.");
    }
}
