package Ex05;
public class Ex05Lista {
    public static void main(String[] args) {
        Carro c1 = new Carro("Renault Kwid", 2024);
        c1.acelerar(10);
        c1.acelerar(40);
        c1.frear(20);
        c1.estado();
    }
}
