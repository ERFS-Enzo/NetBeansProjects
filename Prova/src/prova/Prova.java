package prova;
import java.util.Scanner;
import prova.model.Biblioteca;
public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        System.out.println("Informe o ID do emprestimo: ");
        biblioteca.setIdEmprestimo(sc.nextInt());
        sc.nextLine();
        System.out.println("Informe o nome do aluno: ");
        biblioteca.setNomeAluno(sc.nextLine());
        System.out.println("Informe o nome do livro: ");
        biblioteca.setNomeLivro(sc.nextLine());
        System.out.println("Informe o valor da multa por dia: ");
        biblioteca.setValorMultaDia(sc.nextDouble());
        System.out.println("Informe o numero dia de atrasos: ");
        biblioteca.setNroDiasAtraso(sc.nextDouble());
        
        biblioteca.calculoMulta();
        System.out.println(biblioteca.toString());
    }
}
