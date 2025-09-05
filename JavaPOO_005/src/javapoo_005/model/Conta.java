package javapoo_005.model;
import java.util.Objects;
import java.util.Scanner;
public class Conta {
    Scanner sc = new Scanner(System.in);
    private String banco, numeroAgencia, numeroConta;
    private double saldoAtual;

    public String sacar(double valor){       
         if (valor <= 0) {
            return "Valor inválido para saque.";
        }
        if (valor > saldoAtual) {
            return "Saldo insuficiente!";
        }
        saldoAtual -= valor;
        return "Saque realizado com sucesso!";
    }
    
    public String depositar(double valor){
        if (valor <= 0) {
            return "Valor inválido para depósito.";
        }
        saldoAtual += valor;
        return "Depósito realizado com sucesso!";
    }

    @Override
    public String toString() {
        return "Banco: " + banco +
            "\nAgência: " + numeroAgencia +
            "\nConta: " + numeroConta +
            "\nSaldo Atual: R$ " + saldoAtual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.banco);
        hash = 97 * hash + Objects.hashCode(this.numeroAgencia);
        hash = 97 * hash + Objects.hashCode(this.numeroConta);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldoAtual) ^ (Double.doubleToLongBits(this.saldoAtual) >>> 32));
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
        final Conta other = (Conta) obj;
        if (Double.doubleToLongBits(this.saldoAtual) != Double.doubleToLongBits(other.saldoAtual)) {
            return false;
        }
        if (!Objects.equals(this.banco, other.banco)) {
            return false;
        }
        if (!Objects.equals(this.numeroAgencia, other.numeroAgencia)) {
            return false;
        }
        return Objects.equals(this.numeroConta, other.numeroConta);
    }

    
    
    
    
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    
}
