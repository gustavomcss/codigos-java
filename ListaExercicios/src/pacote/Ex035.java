package pacote;

public class Ex035 {

	public static void main(String[] args) {
		double alturaChico = 1.5, alturaJuca = 1.1;
		int anos = 0;
		String strChico, strJuca;
		
		while (alturaJuca <= alturaChico) {
			alturaChico = alturaChico + 0.02;
			alturaJuca = alturaJuca + 0.03;
			anos = anos + 1;
			System.out.println("\nAno: " + anos);
			
			strChico = String.format("%.2f", alturaChico);
			strJuca = String.format("%.2f", alturaJuca);
			System.out.println("Altura Chico: " + strChico);
			System.out.println("Altura Juca " + strJuca);			
		}
		
		System.out.println("\nPara Juca ser maior que Chico, vão passar: " + anos + " anos.");
	}

}
