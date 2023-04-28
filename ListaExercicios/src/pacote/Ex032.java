package pacote;

public class Ex032 {

    public static void main(String[] args) {
        int num, soma = 0;

        for (num = 25; num <= 200; num++) {
            if (num % 2 == 0) {
                soma = soma + num;
            }
        }

        System.out.println("A soma dos numeros pares entre 25 e 200 eh: " + soma);
    }    
}
