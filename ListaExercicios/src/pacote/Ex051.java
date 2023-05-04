package pacote;

import java.util.Scanner;

public class Ex051 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num, aux;
        System.out.print("Entre com um numero para verificar se eh capicua: ");
        num = s1.nextInt();
        
        aux = reverso(num);
        
        System.out.println("Num: " + num + " Aux: " + aux);
        if (aux == num) {
        	System.out.println("\nÉ capicua.");
        } else {
        	System.out.println("\nNao eh capicua.");
        }
    }
    
    public static int reverso(int num) {
    	int soma = 0, resto;
    	while (num != 0) {
    		resto = num % 10;
    		soma = (soma * 10)  + resto;
    		num = num / 10;
    	}
    	
    	return soma;
    }
}