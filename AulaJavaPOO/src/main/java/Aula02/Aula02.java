package Aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.4f, "Preto");
        c1.status();
        
        //c1.setModelo("Bic");
        //c1.setPonta(0.5f);        
        //System.out.println("Eu tenho uma caneta "+ c1.getModelo()+ " de ponta "+ c1.getPonta());  
        
        Caneta c2 = new Caneta("Faber Castell", 0.5f, "Azul");
        c2.status();
    }
}
