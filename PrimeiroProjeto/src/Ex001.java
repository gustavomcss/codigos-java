import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args){
        int num, dezena, resto;

        System.out.print("Digite um número de 3 casas: ");
        Scanner s1 = new Scanner(System.in);
        num = s1.nextInt();
        s1.close();

        resto = num % 100;
        dezena = resto / 10;
        
        System.out.printf("O número de dezenas é %d \n",dezena);
    }
}
