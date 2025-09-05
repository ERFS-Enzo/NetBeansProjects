package Ex08;
public class Vendedor extends Funcionario{
    private float comissao;

    public Vendedor(String nome, float salarioBase, float comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }   
    @Override
    public float calcularSalario(){
       return salarioBase + comissao; 
    }
}
