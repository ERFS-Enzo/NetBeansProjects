package Aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal(); //é abstrato, nao posso usar
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //m.setPeso(35.3f);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        
        c.locomover();
        k.emitirSom();
        j.locomover();
    }
}
