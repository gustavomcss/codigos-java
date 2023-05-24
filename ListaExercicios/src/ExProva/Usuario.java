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

    
}
