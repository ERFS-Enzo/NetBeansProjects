package javapoo_004.model;

import java.util.Objects;


public class Emprestimo {
    
    private String cliente, banco;
    private int nroParcelas;
    private double valorEmprestimo, valorParcela, valorParcelaPagas=0, valorParcelaPagar;

    //construtor
    public Emprestimo() {
    }
    
    //metodos
    public String pagarParcela(){
        if(valorParcelaPagar <= 0){
            return "Empréstimo já quitado!";
        }
    
        valorParcelaPagas += valorParcela;
        valorParcelaPagar -= valorParcela;

        if(valorParcelaPagar <= 0){
            valorParcelaPagar = 0;
            return "Parcela paga! Empréstimo quitado!";
        } else {
            return "Parcela paga! Restam R$ " + valorParcelaPagar;
        }
    }
    public String calcularContrato(){
        return "\n===Extrato do Contrato===\n" +
               "\nCliente: "+cliente+
               "\nBanco: "+banco+
               "\nValor do Empréstimo: R$ "+valorEmprestimo+
               "\nNúmero de Parcelas: "+nroParcelas+
               "\nValor da Parcela: R$ "+valorParcela+
               "\nTotal Pago: R$ "+valorParcelaPagas+
               "\nSaldo Devedor: R$ "+valorParcelaPagar;
    }

    @Override
    public String toString() {
        return "\nEmprestimo{" + "cliente=" + cliente + ", banco=" + banco + ", Numero de Parcelas=" + nroParcelas + ", Valor do Emprestimo=" + valorEmprestimo + ", Valor da Parcela=" + valorParcela + ", Valor de Parcelas Pagas=" + valorParcelaPagas + ", Valor de Parcela a Pagar=" + valorParcelaPagar + '}'+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.cliente);
        hash = 89 * hash + Objects.hashCode(this.banco);
        hash = 89 * hash + this.nroParcelas;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorEmprestimo) ^ (Double.doubleToLongBits(this.valorEmprestimo) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorParcela) ^ (Double.doubleToLongBits(this.valorParcela) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorParcelaPagas) ^ (Double.doubleToLongBits(this.valorParcelaPagas) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorParcelaPagar) ^ (Double.doubleToLongBits(this.valorParcelaPagar) >>> 32));
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
        final Emprestimo other = (Emprestimo) obj;
        if (this.nroParcelas != other.nroParcelas) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorEmprestimo) != Double.doubleToLongBits(other.valorEmprestimo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcela) != Double.doubleToLongBits(other.valorParcela)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcelaPagas) != Double.doubleToLongBits(other.valorParcelaPagas)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorParcelaPagar) != Double.doubleToLongBits(other.valorParcelaPagar)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return Objects.equals(this.banco, other.banco);
    }
    
    
    
    
    //g & s
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNroParcelas() {
        return nroParcelas;
    }

    public void setNroParcelas(int nroParcelas) {
        this.nroParcelas = nroParcelas;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = this.valorEmprestimo/this.nroParcelas; //calcular valor da parcela
    }

    public double getValorParcelaPagas() {
        return valorParcelaPagas;
    }

    public void setValorParcelaPagas(double valorParcelaPagas) {
        this.valorParcelaPagas = valorParcelaPagas;
    }

    public double getValorParcelaPagar() {
        return valorParcelaPagar;
    }

    public void setValorParcelaPagar(double valorParcelaPagar) {
        this.valorParcelaPagar = valorParcelaPagar;
    } 
    
}
