package pacote;

import java.util.Scanner;

public class Ex029 {
    
    public static void main(String[] args) {
        String nomeProduto;
        int valorCompra, lucro;
        double valorVenda;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Nome do Produto: ");
        nomeProduto = s1.next();
        System.out.print("Valor da Compra: ");
        valorCompra = s1.nextInt();
        s1.close();

        if (valorCompra < 10) {
            lucro = 70;
            valorVenda = (valorCompra * 0.70) + valorCompra;
            System.out.println("\nO produto " + nomeProduto + " foi vendido por " + valorVenda + ". O que deu um lucro de " + lucro + "%");
        }        

        if (valorCompra >= 10 && valorCompra < 30) {
            lucro = 50;
            valorVenda = (valorCompra * 0.50) + valorCompra;
            System.out.println("\nO produto " + nomeProduto + " foi vendido por " + valorVenda + ". O que deu um lucro de " + lucro + "%");
        }

        if (valorCompra >= 30 && valorCompra < 50) {
            lucro = 40;
            valorVenda = (valorCompra * 0.40) + valorCompra;
            System.out.println("\nO produto " + nomeProduto + " foi vendido por " + valorVenda + ". O que deu um lucro de " + lucro + "%");
        }

        if (valorCompra >= 50) {
            lucro = 30;
            valorVenda = (valorCompra * 0.30) + valorCompra;
            System.out.println("\nO produto " + nomeProduto + " foi vendido por " + valorVenda + ". O que deu um lucro de " + lucro + "%");
        }
    }
}
