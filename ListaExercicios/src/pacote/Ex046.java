package pacote;

import java.util.Scanner;

public class Ex046 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double radianos;

        System.out.print("Entre com valor em radianos: ");
        radianos = s1.nextDouble();
        
        System.out.printf("\nRadianos: %.2f \nGraus: %.2f\n", radianos, radianosGraus(radianos));
        s1.close();
    }

    public static double radianosGraus (double radian) {
        double graus;
        graus = radian * (180 / Math.PI);
        return graus;
    }
}
