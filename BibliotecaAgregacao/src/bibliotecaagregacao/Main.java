package bibliotecaagregacao;
import bibliotecaagregacao.model.Biblioteca;
import bibliotecaagregacao.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Biblioteca> bibliotecas = new ArrayList<>();
        int escolha1, escolha2;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("[1] Cadastrar Biblioteca");
            System.out.println("[2] Sair");
            System.out.print("Escolha: ");
            escolha1 = sc.nextInt();
            sc.nextLine();

            if (escolha1 == 2) {
                System.out.println("Saindo do cadastro de bibliotecas...");
                break; 
            } else if (escolha1 != 1) {
                System.out.println("Opção inválida! Tente novamente.");
                i--; 
                continue;
            }
            Biblioteca biblioteca = new Biblioteca();
            System.out.print("ID da biblioteca: ");
            biblioteca.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nome da biblioteca: ");
            biblioteca.setNomeBiblioteca(sc.nextLine());
            do {
                System.out.println("\n[1] Adicionar livro");
                System.out.println("[2] Finalizar cadastro de livros");
                System.out.print("Escolha: ");
                escolha2 = sc.nextInt();
                sc.nextLine();

                switch (escolha2) {
                    case 1:
                        Livro livro = new Livro();
                        System.out.print("ID do livro: ");
                        livro.setIdLivro(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Título: ");
                        livro.setTitulo(sc.nextLine());
                        System.out.print("Autor: ");
                        livro.setAutor(sc.nextLine());
                        System.out.print("Editora: ");
                        livro.setEditora(sc.nextLine());
                        System.out.print("ISBN: ");
                        livro.setIsbn(sc.nextLine());
                        System.out.print("Valor da obra: ");
                        livro.setValorObra(sc.nextDouble());
                        sc.nextLine();

                        biblioteca.adicionarLivro(livro);
                        System.out.println("Livro adicionado com sucesso!");
                        break;

                    case 2:
                        System.out.println("Cadastro de livros finalizado.");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (escolha2 != 2);

            bibliotecas.add(biblioteca);
            System.out.println("Biblioteca cadastrada com sucesso!");
        }

        System.out.println("\n===INVENTARIO===");
        if (bibliotecas.isEmpty()) {
            System.out.println("Nenhuma biblioteca cadastrada.");
        } else {
            for (Biblioteca b : bibliotecas) {
                System.out.println(b);
                System.out.println("------------------------------------");
            }
        }
        
    }
}
