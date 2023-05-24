package ExProva;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livrosDisponiveis;
    private List<Usuario> usuariosCadastrados;

    public Biblioteca() {
        this.livrosDisponiveis = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }

    public List<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuariosCadastrados.add(usuario);
    }

    public void exibirUsuariosComEmprestimo() {
        System.out.println("\n-- USUÁRIOS COM EMPRÉSTIMOS --");
        for (Usuario usuario : usuariosCadastrados) {
            List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
            if (!livrosEmprestados.isEmpty()) {
                System.out.println("Usuário: " + usuario.getNome());
                System.out.println("Livros Emprestados: ");
                for (Livro livro : livrosEmprestados) {
                    System.out.println("- " + livro.getTitulo() + " (" + livro.getAutor() + ") ");
                }
            }
        }
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("\n----- LIVROS DISPONÍVEIS -----");
        for (Livro livro : livrosDisponiveis) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de páginas: " + livro.getNumeroPaginas());
            System.out.println();
        }
    }

}
