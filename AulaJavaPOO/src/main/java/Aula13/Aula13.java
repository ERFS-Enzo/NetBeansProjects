package Aula13;
public class Aula13 {
    public static void main(String[] args) {
        Mamifero x = new Mamifero();
        Lobo y = new Lobo();
        Cachorro z = new Cachorro();
        
        x.emitirSom();
        y.emitirSom();
        z.emitirSom();
        System.out.println("");
        
        z.reagir("Olá");
        z.reagir("Vai apanhar");
        System.out.println("");
        z.reagir(true);
        z.reagir(false);
        System.out.println("");
        z.reagir(11, 45);
        z.reagir(21, 00);
        System.out.println("");
        z.reagir(2, 12.5f);
        z.reagir(17, 4.5f);
    }
}
