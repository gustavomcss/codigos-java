package pacote;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		int num, dezena;
		
		System.out.print("Entre com um numero de 3 algarismos: ");
		Scanner s1 = new Scanner(System.in);
		num = s1.nextInt();
		s1.close();
		
		dezena = (num % 100) / 10;
		
		System.out.println("A dezena do numero " + num + " eh: " + dezena);
	}

}
