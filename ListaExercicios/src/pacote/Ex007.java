package pacote;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		int anguloGraus;
		double anguloRadiano, seno;
		
		System.out.print("Entre com um n�mero: ");
		Scanner s1 = new Scanner(System.in);
		anguloGraus = s1.nextInt();
		s1.close();
		
		//anguloRadiano = anguloGraus * Math.PI / 180;
		anguloRadiano = Math.toRadians(anguloGraus);
		seno = Math.sin(anguloRadiano);
		
		System.out.println("\nO seno do angulo " + anguloGraus + " �: " + seno);
		System.out.println("O cosseno do angulo " + anguloGraus + " �: " + Math.cos(anguloRadiano));
		System.out.println("O tangente do angulo " + anguloGraus + " �: " + Math.tan(anguloRadiano));
		System.out.println("A secante do angulo " + anguloGraus + " �: " + 1/Math.cos(anguloRadiano));
		System.out.println("A cossecante do angulo " + anguloGraus + " �: " + 1/Math.sin(anguloRadiano));
		System.out.println("A cotangente do angulo " + anguloGraus + " �: " + 1/Math.tan(anguloRadiano));
	}

}
