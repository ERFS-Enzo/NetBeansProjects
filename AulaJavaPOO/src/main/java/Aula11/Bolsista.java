package Aula11;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do "+this.getNome());
    }
    
    @Override //sobreposto
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
