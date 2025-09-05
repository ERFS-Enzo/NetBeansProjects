package Ex02;
public class Produto {
    //atributos
    String nome;
    float preco;
    int quantidade;
    
    //construtor
    public Produto(String nome, float preco, int quantidade){    
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodos
    public void comprar(int quantidade) {
        //O método comprar precisa de um número inteiro para funcionar (por exemplo: 10 unidades).
        this.quantidade += quantidade;
    }
    public void vender(int quantidade){
        this.quantidade -= quantidade;
    }
    public float ValorTotalEstoque(){
        return this.preco * this.quantidade;
    }
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$" + ValorTotalEstoque());
    }
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preço) {
        this.preco = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
