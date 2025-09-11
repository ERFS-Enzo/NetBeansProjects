package carrinho;
import carrinho.produtos.Produto;
import java.util.Scanner;
import java.util.ArrayList;
public class Carrinho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>(); //criei um arraylist da classe Produto.
        int escolha=0;
        do{
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Ver Carrinho");
            System.out.println("[3] Sair");
            escolha=sc.nextInt();
            sc.nextLine(); //limpar o scanner
            switch(escolha){
                case 1:
                    System.out.println("Insira o Nome do Produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Insira o Preço do Produto: ");
                    double valor = sc.nextDouble();
                    produtos.add(new Produto(nome, valor)); //criar um novo objeto utiliza o new
                    //como se eu fizesse um novo Produto p1 = new Produto(nome, valor); que estará no arraylist
                    System.out.println("Produto Cadastrado");
                    break;
                case 2: 
                    double total=0;
                    System.out.println("---Carrinho---");
                    if(produtos.isEmpty()){ //se o produto está vazio
                        System.out.println("Carrinho vazio");
                    } else{
                        for (Produto p : produtos) { //Imprimir usando foreach
                            System.out.println("Item: " + p.getNome() + " - R$ " + p.getValor());
                            total += p.getValor();
                        }
                        System.out.println("Valor Final: R$ " + total);
                    }
                    System.out.println("--------------\n");
                    break;
                case 3:
                    System.out.println("Até Logo!");
                    break;
                default: 
                    System.out.println("ERRO! Numero Inválido.");
                    break;
            }
        }while(escolha != 3);
    }
}
