package ExProva;

import java.util.Scanner;
import java.util.List;

public class Principal {
    static Scanner s1 = new Scanner(System.in);
    
    public static void main(String[] args) {
        Biblioteca bilioteca = new Biblioteca();
        int opc;

        do {
            System.out.println("------------ MENU ------------");
            System.out.println("[1] Entrar como Biblioteca");
            System.out.println("[2] Entrar como Usuário");
            System.out.println("[0] Sair do Programa");
            System.out.print("\nSUA ESCOLHA: ");
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    entrarComoBiblioteca(bilioteca, s1);
                    break;
                case 2:
                    entrarComoUsuario(bilioteca, s1);
                    break;
                case 0:
                    System.out.println("\nX-- Encerrando o Programa...");
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente.");
                    break;
            }
        } while (opc != 0);
    }

    private static void entrarComoBiblioteca(Biblioteca biblioteca, Scanner s1) {
        int opc;

        do {
            System.out.println("\n--------- BIBLIOTECA ---------");
            System.out.println("[1] Cadastrar Novo Usuário");
            System.out.println("[2] Exibir Usuários com Empréstimos");
            System.out.println("[3] Adicionar Livro à Biblioteca");
            System.out.println("[4] Exibir Livros Disponíveis");
            System.out.println("[0] Voltar ao MENU");
            System.out.print("\nSUA ESCOLHA: ");
            s1.nextLine();
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    cadastrarUsuario(biblioteca, s1);
                    break;
                case 2:
                    biblioteca.exibirUsuariosComEmprestimo();
                    break;
                case 3:
                    adicionarLivro(biblioteca, s1);
                    break;
                case 4:
                    biblioteca.exibirLivrosDisponiveis();
                    break;
                case 0:
                    System.out.println("\n<-- Voltando ao MENU...\n");
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente.");
                    break;
            }

        } while (opc != 0);
    }

    private static void entrarComoUsuario(Biblioteca biblioteca, Scanner s1) {
        String nome;
        int opc;

        System.out.print("\nDigite seu nome: ");
        nome = s1.next();
       
        Usuario usuario = encontrarUsuario(biblioteca, nome);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!\n");
            return;
        }

        do {
            System.out.println("\n------- USUÁRIO: " + usuario.getNome() + " -------");
            System.out.println("[1] Emprestar Livro");
            System.out.println("[2] Devolver Livro");
            System.out.println("[3] Exibir Livros Disponíveis");
            System.out.println("[4] Exibir Livros Emprestados");
            System.out.println("[0] Voltar ao MENU");
            System.out.print("\nSUA ESCOLHA: ");
            opc = s1.nextInt();

            switch (opc) {
                case 1:
                    emprestarLivro(biblioteca, usuario, s1);
                    break;
                case 2:
                    devolverLivro(biblioteca, usuario, s1);
                    break;
                case 3:
                    biblioteca.exibirLivrosDisponiveis();
                    break;
                case 4:
                    exibirLivrosEmprestados(usuario);
                    break;
                case 0:
                    System.out.println("\n<-- Voltando ao MENU...\n");
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente.");
                    break;
            }
        } while (opc != 0);
    }

    private static void cadastrarUsuario(Biblioteca biblioteca, Scanner s1) {
        String nome;
        int idade;

        System.out.print("\nDigite o nome do Usuário: ");
        nome = s1.next();
        System.out.print("Digite a idade do Usuário: ");
        idade = s1.nextInt();

        Usuario usuario = new Usuario(nome, idade);
        biblioteca.cadastrarUsuario(usuario);
        System.out.println("USUÁRIO CADASTRADO COM SUCESSO!\n");
    }
 
    private static void adicionarLivro(Biblioteca biblioteca, Scanner s1) {
        String titulo, autor;
        int numeroPagina;
        
        System.out.print("\nDigite o Título do Livro: ");
        titulo = s1.next();
        System.out.print("Digite o Autor do Livro: ");
        autor = s1.next();
        System.out.print("Digite o Numero de Paginas: ");
        numeroPagina = s1.nextInt();

        Livro livro = new Livro(titulo, autor, numeroPagina);
        biblioteca.adicionarLivro(livro);
        System.out.println("LIVRO ADICIONADO À BIBLIOTECA COM SUCESSO!\n");
    }

    private static Usuario encontrarUsuario(Biblioteca biblioteca, String nome) {
        List<Usuario> usuarios = biblioteca.getUsuariosCadastrados();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }

    private static void emprestarLivro(Biblioteca biblioteca, Usuario usuario, Scanner s1){
        String titulo;

        if (usuario.getLivrosEmprestados().size() >= 3) {
            System.out.println("\nVocê já possui 3 livros emprestados.\nDevolva algum livro antes de fazer um novo empréstimo.\n");
            return;
        }

        System.out.print("\nTítulo do livro que deseja emprestar: ");
        titulo = s1.next();

        Livro livro = encontrarLivroDisponivel(biblioteca, titulo);
        if (livro == null) {
            System.out.println("Livro não disponível na biblioteca.\n");
            return;
        }

        usuario.emprestarLivro(livro);
        biblioteca.getLivrosDisponiveis().remove(livro);
        System.out.println("Livro emprestado com sucesso.");
    }

    private static void devolverLivro(Biblioteca biblioteca, Usuario usuario, Scanner s1) {
        String titulo;
        
        System.out.print("\nDigite o título do livro que deseja devolver: ");
        titulo = s1.next();

        Livro livro = encontrarLivroEmprestado(usuario, titulo);
        if (livro == null) {
            System.out.println("Você não possui esse livro emprestado.\n");
            return;
        }

        usuario.devolverLivro(livro);
        biblioteca.getLivrosDisponiveis().add(livro);
        System.out.println("Livro devolvido com sucesso.");
    }

    private static void exibirLivrosEmprestados(Usuario usuario) {
        List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
        
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

    private static Livro encontrarLivroDisponivel(Biblioteca biblioteca, String titulo) {
        List<Livro> livrosDisponiveis = biblioteca.getLivrosDisponiveis();
        
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    private static Livro encontrarLivroEmprestado(Usuario usuario, String titulo) {
        List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
        
        for (Livro livro : livrosEmprestados) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
