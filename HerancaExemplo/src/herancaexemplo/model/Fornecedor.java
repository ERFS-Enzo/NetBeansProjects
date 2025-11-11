package herancaexemplo.model;
public class Fornecedor extends Pessoa {
    private double capitalSocial, faturamentoBruto;

    public Fornecedor(double capitalSocial, double faturamentoBruto, int id, String nome, String cpfCnpj) {
        super(id, nome, cpfCnpj);
        this.capitalSocial = capitalSocial;
        this.faturamentoBruto = faturamentoBruto;
    }
    
    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public double getFaturamentoBruto() {
        return faturamentoBruto;
    }

    public void setFaturamentoBruto(double faturamentoBruto) {
        this.faturamentoBruto = faturamentoBruto;
    }

    @Override
    public String toString() {
        return super.toString()+" Fornecedor{" + "capitalSocial=" + capitalSocial + ", faturamentoBruto=" + faturamentoBruto + '}';
    }
    
    
}
