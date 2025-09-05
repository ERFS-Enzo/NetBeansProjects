package Ex08;
public class Gerente extends Funcionario{
    private float bonus;
    
    public Gerente(String nome, float salarioBase, float bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    @Override
    public float calcularSalario(){
        return salarioBase + bonus;
    }
}
