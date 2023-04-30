package pacote;

import java.util.Scanner;

public class Ex041 {
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] vetor = new int[10];

        // Loop para ler 10 números inteiros do usuário e adicioná-los ao vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = s1.nextInt();
        }

        // Inicialização das variáveis de controle
        int tamanhoSublistaAtual = 1;
        int tamanhoSublistaMaximo = 1;
        int inicioSublistaAtual = 0;
        int inicioSublistaMaximo = 0;

        // Loop para percorrer o vetor e encontrar a maior sublista ordenada crescentemente
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] >= vetor[i-1]) { // Verifica se o elemento atual é maior ou igual ao elemento anterior
                tamanhoSublistaAtual++; // Incrementa o tamanho da sublista atual
            } else {
                // Se a sublista atual for maior que a sublista máxima encontrada até agora, atualiza as variáveis de controle
                if (tamanhoSublistaAtual > tamanhoSublistaMaximo) {
                    tamanhoSublistaMaximo = tamanhoSublistaAtual;
                    inicioSublistaMaximo = inicioSublistaAtual;
                }
                // Reinicia o tamanho da sublista atual e define o início da nova sublista
                tamanhoSublistaAtual = 1;
                inicioSublistaAtual = i;
            }
        }

        // Verifica se a sublista atual é maior que a sublista máxima e atualiza as variáveis de controle se necessário
        if (tamanhoSublistaAtual > tamanhoSublistaMaximo) {
            tamanhoSublistaMaximo = tamanhoSublistaAtual;
            inicioSublistaMaximo = inicioSublistaAtual;
        }

        // Imprime o tamanho e os elementos da maior sublista ordenada crescentemente
        System.out.println("\nA maior sublista ordenada crescentemente tem " + tamanhoSublistaMaximo + " elementos:");
        for (int i = inicioSublistaMaximo; i < inicioSublistaMaximo + tamanhoSublistaMaximo; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
    }
}
