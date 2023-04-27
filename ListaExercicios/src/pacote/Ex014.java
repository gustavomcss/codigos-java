package pacote;

import java.util.Scanner;

public class Ex014 {
    
    public static void main(String[] args) {
        int num, prim, segu, terc, quar, inverso;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Digite um numero de 4 algarismos: ");
        num = s1.nextInt();
        s1.close();

        prim = (num / 1000);
        segu = ((num % 1000) / 100) * 10;
        terc = ((num % 100) / 10) * 100;
        quar = (num % 10) * 1000;
        inverso = prim + segu + terc + quar;
         
        System.out.println("\nO inverso de " + num + " eh: " + inverso);
    }
}
