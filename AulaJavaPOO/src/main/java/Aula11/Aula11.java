package Aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); esse codigo nao pode pq a classe pessoa é abstrata.
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Sistemas de informação");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Brian");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}
