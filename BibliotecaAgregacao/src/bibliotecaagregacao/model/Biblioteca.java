package bibliotecaagregacao.model;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private int id;
    private String nomeBiblioteca;  
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(int id, String nomeBiblioteca, List<Livro> livros) {
        this.id = id;
        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = livros;
    }

    public Biblioteca(int id, String nomeBiblioteca) {
        this.id = id;
        this.nomeBiblioteca = nomeBiblioteca;
    }
    
    public Biblioteca() {
    }
    
    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }    
    
    public double calcularValorTotal(){
        double total=0;
        for(Livro livro : livros){
            total+=livro.getValorObra();
        }
        return total;
    }

    @Override
    public String toString() {
        String texto = "\nBiblioteca: " + nomeBiblioteca +
                       "\nID: " + id +
                       "\n------------------------------------";
        if (livros.isEmpty()) {
            texto += "\nNenhum livro cadastrado.\n";
        } else {
            texto += "\nLivros cadastrados:\n";
            for (Livro livro : livros) {
                texto += livro + "\n";
            }
            texto += "------------------------------------" +
                     "\nTotal de livros: " + livros.size() +
                     "\nValor total: R$ "+ calcularValorTotal();
        }
        return texto;
    }
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}
