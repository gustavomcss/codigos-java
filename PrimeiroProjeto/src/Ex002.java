import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        int data, day, mes, ano;

        System.out.print("Digite a data no formato ddmmaa: ");
        Scanner s1 = new Scanner(System.in);
        data = s1.nextInt();
        s1.close();

        day = data / 10000;
        mes = (data % 10000) / 100;
        ano = data % 100;

        System.out.printf("\nDia: %d \nMês: %d \nAno: %d \n", day, mes, ano);
    }
}
