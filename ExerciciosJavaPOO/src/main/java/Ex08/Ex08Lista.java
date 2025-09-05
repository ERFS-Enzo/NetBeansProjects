package Ex08;
public class Ex08Lista {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Enzo", 1000f);
        System.out.println(f.calcularSalario());
        Gerente g = new Gerente("Cleber", 10000f, 450.75f);
        System.out.println(g.calcularSalario());
        Vendedor v = new Vendedor("Glaucio", 2500f, 365f);
        System.out.println(v.calcularSalario());
    }
}
