package Ex06;
public class Aluno {
    //atributos
    private String nome;
    private int matricula;
    private float nota1, nota2, nota3, media;    
    //construtor

    public Aluno(String nome, int matricula, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    //metodos
    public void CalculoMedia(){
        if(nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10){
            System.out.println("A nota deve ser menor ou igual a 10");
            return;
        }
        media = (nota1 + nota2 + nota3)/3;
    }
    public void verificar(){
        if(media >= 7){
            System.out.println("Nome: "+this.nome);
            System.out.println("Matricula: "+this.matricula);
            System.out.println("Media: "+this.media);
            System.out.println("APROVADO!!");
        } else if(media >=4 && media < 7){
            System.out.println("Nome: "+this.nome);
            System.out.println("Matricula: "+this.matricula);
            System.out.println("Media: "+this.media);
            System.out.println("RECUPERAÇÃO FINAL!!");
        } else{
            System.out.println("Nome: "+this.nome);
            System.out.println("Matricula: "+this.matricula);
            System.out.println("Media: "+this.media);
            System.out.println("REPROVADO!!");
        }
    }
}
