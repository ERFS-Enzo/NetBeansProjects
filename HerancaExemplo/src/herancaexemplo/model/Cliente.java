package herancaexemplo.model;
public class Cliente extends Pessoa{
    private String mesAniversario;
    private double limiteCredito;

    public Cliente(String mesAniversario, double limiteCredito, int id, String nome, String cpfCnpj) {
        super(id, nome, cpfCnpj);
        this.mesAniversario = mesAniversario;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente{" + "mesAniversario=" + mesAniversario + ", limiteCredito=" + limiteCredito + '}';
    }
    
    
    
}
