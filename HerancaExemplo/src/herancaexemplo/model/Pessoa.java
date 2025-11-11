package herancaexemplo.model;
public abstract class Pessoa {
    private int id;
    private String nome, cpfCnpj;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpfCnpj=" + cpfCnpj + '}';
    }
   
    
}
