package ProjetoLivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Enzo", "M", 18);
        
        l[0] = new Livro("Aprendendo Java", "Guanabara", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Julia de Oliveira", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println("");
        System.out.println(l[1].detalhes());
    }
}
