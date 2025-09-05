package Aula01;
public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //c1 é o nome do objeto que pertence a classe Caneta
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul"; 
        //.ponta = 0.5f; é privada, ou seja, não posso mexer
        c1.carga = 80;
        
        //c1.tampada = false; esta privada, mas como o metodo tampar e destampar é publico, posso acessar a resposta assim
        c1.tampar();
        
        c1.rabiscar();       
        c1.status();
    }
}
