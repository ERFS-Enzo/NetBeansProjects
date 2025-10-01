package javapoo_008.model;

import java.util.Objects;
public class Biblioteca {
    private int idEmprestimo;
    private String nomeAluno, nomeLivro;
    private double valorMultaDia, nroDiasAtraso, valorMultaPagar;

    public Biblioteca() {
    }

    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro, double valorMultaDia, double nroDiasAtraso, double valorMultaPagar) {
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        this.valorMultaPagar = valorMultaPagar;
    }

    public double calculoMultaPagar(){
        return nroDiasAtraso * valorMultaDia;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idEmprestimo;
        hash = 89 * hash + Objects.hashCode(this.nomeAluno);
        hash = 89 * hash + Objects.hashCode(this.nomeLivro);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorMultaDia) ^ (Double.doubleToLongBits(this.valorMultaDia) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.nroDiasAtraso) ^ (Double.doubleToLongBits(this.nroDiasAtraso) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorMultaPagar) ^ (Double.doubleToLongBits(this.valorMultaPagar) >>> 32));
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
        if (Double.doubleToLongBits(this.valorMultaPagar) != Double.doubleToLongBits(other.valorMultaPagar)) {
            return false;
        }
        if (!Objects.equals(this.nomeAluno, other.nomeAluno)) {
            return false;
        }
        return Objects.equals(this.nomeLivro, other.nomeLivro);
    }

    @Override
    public String toString() {
        return "Biblioteca{" + 
                "\nID Emprestimo: " + idEmprestimo + 
                "\nNome Aluno: " + nomeAluno + 
                "\nNome do Livro: " + nomeLivro + 
                "\nValor da Multa por Dia: " + valorMultaDia + 
                "\nNumero de Dias de Atraso: " + nroDiasAtraso + 
                "\nValor da Multa a Pagar: " + calculoMultaPagar() + "\n}";
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

    public double getValorMultaPagar() {
        return valorMultaPagar;
    }

    public void setValorMultaPagar(double valorMultaPagar) {
        this.valorMultaPagar = valorMultaPagar;
    }
    
    
    
}
