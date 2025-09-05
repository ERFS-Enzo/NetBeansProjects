package javapoo_003;

import java.util.Scanner;
import javapoo_003.model.Biblioteca;

public class JavaPOO_003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.println("Informe o Id: ");
        b.setIdEmprestimo(sc.nextInt());
        System.out.println("Informe o nome do aluno: ");
        b.setNomeAluno(sc.next());
        System.out.println("informe o valor do livro: ");
        b.setNomeLivro(sc.next());
        System.out.println("Informe o valor da multa por dia: ");
        b.setValorMultaDia(sc.nextDouble());
        System.out.println("Informe o numero de dias em atraso: ");
        b.setNroDiasAtraso(sc.nextDouble());
        
        
        //System.out.println(b.exibir());
        
        //usando toString();
        System.out.println(b.toString());
        
    }
}
