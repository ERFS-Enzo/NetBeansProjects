package javafxbasico.model;
public class Categoria {
    private int Id;
    private String nome;

    public Categoria(int Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }

    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
