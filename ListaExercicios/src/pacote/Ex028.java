package pacote;

import java.util.Scanner;

public class Ex028 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Entre com um n�mero entre 1 e 12 para descobrir o m�s: ");
		Scanner s1 = new Scanner(System.in);
		num = s1.nextInt();
		s1.close();
		
		if (num == 1) {
			System.out.println("Janeiro");
		}
		else if (num == 2) {
			System.out.println("Fevereiro");
		}
		else if (num == 3) {
			System.out.println("Mar�o");
		}
		else if (num == 4) {
			System.out.println("Abril");
		}
		else if (num == 5) {
			System.out.println("Maio");
		}
		else if (num == 6) {
			System.out.println("Junho");
		}
		else if (num == 7) {
			System.out.println("Julho");
		}
		else if (num == 8) {
			System.out.println("Agosto");
		}
		else if (num == 9) {
			System.out.println("Setembro");
		}
		else if (num == 10) {
			System.out.println("Outubro");
		}
		else if (num == 11) {
			System.out.println("Novembro");
		}
		else if (num == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("N�o existe o m�s com o n�mero informado. ");
		}
		
	}

}
