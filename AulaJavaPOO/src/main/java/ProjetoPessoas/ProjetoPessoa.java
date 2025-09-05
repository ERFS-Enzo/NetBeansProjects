package ProjetoPessoas;
public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(20);
        p2.setIdade(70);
        p3.setIdade(45);
        p4.setIdade(33);
        
        p2.setCurso("Sistemas de Informação");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p3.receberAumento(550.20f);
        p4.mudaTrabalho();
        p2.cancelarMatricula();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
