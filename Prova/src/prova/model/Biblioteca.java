package prova.model;
import java.util.Objects;
public class Biblioteca {
    private int idEmprestimo;
    private String nomeAluno, nomeLivro;
    private double valorMultaDia, nroDiasAtraso, valorMultaApagar;

    public Biblioteca() {
    }
    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro, double valorMultaDia, double nroDiasAtraso, double valorMultaApagar) {
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        this.valorMultaApagar = valorMultaApagar;
    }

    public double calculoMulta(){
        return this.valorMultaApagar = this.getNroDiasAtraso() * this.getValorMultaDia();
    }
    
    @Override
    public String toString() {
        return "Biblioteca{" + "ID do emprestimo=" + idEmprestimo + 
                ", nome aluno=" + nomeAluno + 
                ", nome livro=" + nomeLivro + 
                ", valor da multa por dia=" + valorMultaDia + 
                ", numero de dias atrasado=" + nroDiasAtraso + 
                ", valor da multa a pagar=" + valorMultaApagar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idEmprestimo;
        hash = 17 * hash + Objects.hashCode(this.nomeAluno);
        hash = 17 * hash + Objects.hashCode(this.nomeLivro);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valorMultaDia) ^ (Double.doubleToLongBits(this.valorMultaDia) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.nroDiasAtraso) ^ (Double.doubleToLongBits(this.nroDiasAtraso) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valorMultaApagar) ^ (Double.doubleToLongBits(this.valorMultaApagar) >>> 32));
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
        final Biblioteca other = (Biblioteca) obj;
        if (this.idEmprestimo != other.idEmprestimo) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorMultaDia) != Double.doubleToLongBits(other.valorMultaDia)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroDiasAtraso) != Double.doubleToLongBits(other.nroDiasAtraso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorMultaApagar) != Double.doubleToLongBits(other.valorMultaApagar)) {
            return false;
        }
        if (!Objects.equals(this.nomeAluno, other.nomeAluno)) {
            return false;
        }
        return Objects.equals(this.nomeLivro, other.nomeLivro);
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public double getValorMultaDia() {
        return valorMultaDia;
    }

    public void setValorMultaDia(double valorMultaDia) {
        this.valorMultaDia = valorMultaDia;
    }

    public double getNroDiasAtraso() {
        return nroDiasAtraso;
    }

    public void setNroDiasAtraso(double nroDiasAtraso) {
        this.nroDiasAtraso = nroDiasAtraso;
    }

    public double getValorMultaApagar() {
        return valorMultaApagar;
    }

    public void setValorMultaApagar(double valorMultaApagar) {
        this.valorMultaApagar = valorMultaApagar;
    }
}
