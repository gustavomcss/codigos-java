package pacote;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		int data, dia, mes, ano;
		
		System.out.print("Digite uma data no formato ddmmaa: ");
		Scanner s1 = new Scanner(System.in);
		data = s1.nextInt();
		s1.close();
		
		dia = data / 10000;
		mes = (data % 10000) / 100;
		ano = data % 100;
		
		System.out.println("\nDia: " + dia + "\nMes: " + mes + "\nAno: " + ano);
	}

}
