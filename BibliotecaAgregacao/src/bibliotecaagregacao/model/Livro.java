package bibliotecaagregacao.model;
public class Livro {
    private int idLivro;
    private String titulo, autor, editora, isbn;
    private double valorObra;
    private Biblioteca biblioteca;

    public Livro() {
    }

    public Livro(int idLivro, String titulo, String autor, String editora, String isbn, double valorObra) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.valorObra = valorObra;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor1) {
        this.autor = autor1;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValorObra() {
        return valorObra;
    }

    public void setValorObra(double valorObra) {
        this.valorObra = valorObra;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "\nLivro{" +
                "\nidLivro: " + idLivro +
                "\ntitulo: " + titulo +
                "\nautor: " + autor +
                "\neditora: " + editora +
                "\nIdentificação unica do livro: " + isbn +
                "\nvalor: R$" + valorObra +
                "\n}";
    }
}
