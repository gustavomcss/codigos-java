package pacote;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Digite um número: ");
		Scanner s1 = new Scanner(System.in);
		num = s1.nextInt();
		s1.close();
		
		System.out.println("O seu antecessor é: " + (num-1) + "\nO seu sucessor é: " + (num+1));
	}

}
