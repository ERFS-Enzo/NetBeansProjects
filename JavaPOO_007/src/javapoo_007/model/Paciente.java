package javapoo_007.model;
import java.util.Objects;
public class Paciente {
    private int id, idade;
    private String nome, diagnostico;

    public Paciente() {
    }
    
    public Paciente(int id, int idade, String nome, String diagnostico) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.diagnostico = diagnostico;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.idade;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.diagnostico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.diagnostico, other.diagnostico);
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", idade=" + idade + ", nome=" + nome + ", diagnostico=" + diagnostico + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
