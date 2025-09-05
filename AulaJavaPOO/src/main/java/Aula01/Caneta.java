package Aula01;
public class Caneta {
    
    public String modelo; //public torna possivel modificar  
    public String cor;
    private float ponta; //private deixa o acesso privado
    protected int carga;
    private boolean tampada; //protected 
    
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? "+ this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! NÃO POSSO RABISCAR");
        } else{
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
