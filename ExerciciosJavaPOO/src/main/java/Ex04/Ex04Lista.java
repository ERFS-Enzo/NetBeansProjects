package Ex04;
public class Ex04Lista {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1, "Enzo", 0f);
        c1.depositar(100);
        c1.sacar(50);
        c1.depositar(250);
        c1.sacar(200);
        c1.dados();
    }
}
