package Ex02;
public class Ex02Lista {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 4.5f, 16); //adiciona o produto, preço e quantidade
        p1.mostrarDados(); //vai mostrar os dados acima
        p1.comprar(4); //adiciona 4 itens desse produto 
        p1.vender(5); //retira 5 itens desse produto
        System.out.println("\nApós movimentações");
        p1.mostrarDados(); //mostra os dados após alterações
    }
}
