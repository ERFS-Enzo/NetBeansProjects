package javapoo_006.model;

import java.util.Objects;

public class OrdemServico {
    
    private int id;
    private String nomeCliente, nomeProfissional;
    private double valorServicoHora, valorKmDeslocamento, nroHorasTrabalhadas, nroKmPercorrido;
    private double valorServico, valorDeslocamento, valorPagar;
    
    public OrdemServico() {
        
    }
    public OrdemServico(int id, String nomeCliente, String nomeProfissional, double valorServicoHora, double valorKmDeslocamento, double nroHorasTrabalhadas, double nroKmPercorrido, double valorServico, double valorDeslocamento, double valorPagar) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.nomeProfissional = nomeProfissional;
        this.valorServicoHora = valorServicoHora;
        this.valorKmDeslocamento = valorKmDeslocamento;
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
        this.nroKmPercorrido = nroKmPercorrido;
        this.valorServico = valorServico;
        this.valorDeslocamento = valorDeslocamento;
        this.valorPagar = valorPagar;
    }
    
    public void calculo(){
        this.valorServico = this.getValorServicoHora() * this.getNroHorasTrabalhadas();
        this.valorDeslocamento = this.getValorKmDeslocamento() * this.getNroKmPercorrido();
        this.valorPagar = this.getValorServico() + this.getValorDeslocamento();
    }
    
    @Override
    public String toString() {
        return "OrdemServico{" + 
                "id=" + id + 
                ", nomeCliente=" + nomeCliente + 
                ", nomeProfissional=" + nomeProfissional + 
                ", valorServicoHora=" + valorServicoHora + 
                ", valorKmDeslocamento=" + valorKmDeslocamento + 
                ", nroHorasTrabalhadas=" + nroHorasTrabalhadas + 
                ", nroKmPercorrido=" + nroKmPercorrido + 
                ", valorServico=" + valorServico + 
                ", valorDeslocamento=" + valorDeslocamento + 
                ", valorPagar=" + valorPagar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.nomeCliente);
        hash = 19 * hash + Objects.hashCode(this.nomeProfissional);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valorServicoHora) ^ (Double.doubleToLongBits(this.valorServicoHora) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valorKmDeslocamento) ^ (Double.doubleToLongBits(this.valorKmDeslocamento) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.nroHorasTrabalhadas) ^ (Double.doubleToLongBits(this.nroHorasTrabalhadas) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.nroKmPercorrido) ^ (Double.doubleToLongBits(this.nroKmPercorrido) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valorServico) ^ (Double.doubleToLongBits(this.valorServico) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valorDeslocamento) ^ (Double.doubleToLongBits(this.valorDeslocamento) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valorPagar) ^ (Double.doubleToLongBits(this.valorPagar) >>> 32));
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
        final OrdemServico other = (OrdemServico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorServicoHora) != Double.doubleToLongBits(other.valorServicoHora)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorKmDeslocamento) != Double.doubleToLongBits(other.valorKmDeslocamento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroHorasTrabalhadas) != Double.doubleToLongBits(other.nroHorasTrabalhadas)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nroKmPercorrido) != Double.doubleToLongBits(other.nroKmPercorrido)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorServico) != Double.doubleToLongBits(other.valorServico)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorDeslocamento) != Double.doubleToLongBits(other.valorDeslocamento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorPagar) != Double.doubleToLongBits(other.valorPagar)) {
            return false;
        }
        if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
            return false;
        }
        return Objects.equals(this.nomeProfissional, other.nomeProfissional);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public double getValorServicoHora() {
        return valorServicoHora;
    }

    public void setValorServicoHora(double valorServicoHora) {
        this.valorServicoHora = valorServicoHora;
    }

    public double getValorKmDeslocamento() {
        return valorKmDeslocamento;
    }

    public void setValorKmDeslocamento(double valorKmDeslocamento) {
        this.valorKmDeslocamento = valorKmDeslocamento;
    }

    public double getNroHorasTrabalhadas() {
        return nroHorasTrabalhadas;
    }

    public void setNroHorasTrabalhadas(double nroHorasTrabalhadas) {
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
    }

    public double getNroKmPercorrido() {
        return nroKmPercorrido;
    }

    public void setNroKmPercorrido(double nroKmPercorrido) {
        this.nroKmPercorrido = nroKmPercorrido;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getValorDeslocamento() {
        return valorDeslocamento;
    }

    public void setValorDeslocamento(double valorDeslocamento) {
        this.valorDeslocamento = valorDeslocamento;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    
}
