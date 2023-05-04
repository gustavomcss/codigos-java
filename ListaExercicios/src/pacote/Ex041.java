package pacote;

import java.util.Scanner;

public class Ex041 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int[] lista = new int[10];
		int temp = 1, maiorSub = 1, i;
		boolean marcador = false;
		
		for (i = 0; i < lista.length; i++) {
			System.out.print("Digite o " + (i+1) + "° numero: ");
			lista[i] = s1.nextInt();
		}
		
		for (i = 0; i < 9; i++) {
			if (lista[i+1] > lista[i]) {
				temp++;
			}
			else {
				if (maiorSub < temp) {
					maiorSub = temp;
					temp = 1;
					marcador = true;
				}
				else {
					temp = 1;
				}
			}
		}
		
		if (!marcador) {
			maiorSub = temp;
		}
		
		/* if (maiorSub > temp) {
			System.out.println("\nA maior sublista possui: " + maiorSub + " elementos");
		} else {
			System.out.println("\nA maior sublista possui: " + temp + " elementos");
		}
		*/
		
		System.out.println("\nImprimindo Vetor: ");
		for (i = 0; i < lista.length; i++) {
			System.out.print("[" + lista[i] + "] ");
		}
		
		System.out.println("\n\nA maior sublista tem: " + maiorSub + " elementos.");
	}

}
