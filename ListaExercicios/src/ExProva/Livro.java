package ExProva;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;

    public Livro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numPag;
    }
}
