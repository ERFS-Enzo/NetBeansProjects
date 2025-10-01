package javapoo_008;
import java.util.ArrayList;
import java.util.Scanner;
import javapoo_008.model.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
        
        int escolha;
        do{
            System.out.println("[1] Fazer emprestimo do Livro");
            System.out.println("[2] Sair");
            escolha=sc.nextInt();
            switch(escolha){
                case 1:
                    Biblioteca biblioteca = new Biblioteca();
                    System.out.println("Informe o ID: ");
                    biblioteca.setIdEmprestimo(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Informe o Nome: ");
                    biblioteca.setNomeAluno(sc.nextLine());
                    System.out.println("Informe o Nome do Livro: ");
                    biblioteca.setNomeLivro(sc.nextLine());
                    System.out.println("Informe O Valor da Multa por dia: ");
                    biblioteca.setValorMultaDia(sc.nextDouble());
                    System.out.println("Informe o Numero de Dias de Atraso: ");
                    biblioteca.setNroDiasAtraso(sc.nextDouble());
                    
                    bibliotecas.add(biblioteca);
                    break;
                case 2:
                    System.out.println("=====EMPRESTIMO DO LIVRO=====");
                    for(Biblioteca b : bibliotecas){
                        System.out.println(b.toString());
                        System.out.println("=============================");
                    }
                    break;
            }
        }while(escolha != 2);
    }
}
