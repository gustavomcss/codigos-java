package ExProva;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getIdade() {
        return idade;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void exibirLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Você não possui livros emprestados.\n");
            return;
        }

        System.out.println("\n--- MEUS LIVROS EMPRESTADOS ---");
        for (Livro livro : livrosEmprestados) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de páginas: " + livro.getNumeroPaginas());
            System.out.println();
        }
    }
}
