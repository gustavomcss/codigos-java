package pacote;

import java.util.Scanner;

public class Ex038 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int i;
		
		Scanner s1 = new Scanner(System.in);
		
		for (i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um numero: ");
			vetorA[i] = s1.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		s1.close();
		
		System.out.println("");
		for (i = 0; i < vetorA.length; i++) {
			System.out.println("O dobro do vetor é: " + vetorB[i]);
		}
	}

}
