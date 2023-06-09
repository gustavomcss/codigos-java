package pacote;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		int anguloGraus;
		double anguloRadiano, seno;
		
		System.out.print("Entre com um numero: ");
		Scanner s1 = new Scanner(System.in);
		anguloGraus = s1.nextInt();
		s1.close();
		
		//anguloRadiano = anguloGraus * Math.PI / 180;
		anguloRadiano = Math.toRadians(anguloGraus);
		seno = Math.sin(anguloRadiano);
		
		System.out.println("\nO seno do angulo " + anguloGraus + " eh: " + seno);
		System.out.println("O cosseno do angulo " + anguloGraus + " eh: " + Math.cos(anguloRadiano));
		System.out.println("O tangente do angulo " + anguloGraus + " eh: " + Math.tan(anguloRadiano));
		System.out.println("A secante do angulo " + anguloGraus + " eh: " + 1/Math.cos(anguloRadiano));
		System.out.println("A cossecante do angulo " + anguloGraus + " eh: " + 1/Math.sin(anguloRadiano));
		System.out.println("A cotangente do angulo " + anguloGraus + " eh: " + 1/Math.tan(anguloRadiano));
	}

}
