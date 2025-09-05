package Ex04;
public final class ContaBancaria {
    //atributos
    private int numero;
    private String nome;
    private float saldo;
    
    //construtor
    public ContaBancaria(int numero, String nome, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    //metodos
    public void depositar(float valor){
        saldo += valor;
    }   
    public void sacar(float valor){
        if(valor <= saldo && valor >= 0){
            saldo -= valor;
        } else if(valor > saldo){
            System.out.println("Impossivel realizar este saque, insira um valor menor ou igual ao saldo");
        } else if(valor <= 0){
            System.out.println("Digite um numero maior que 0");
        }
    }
    public void dados(){
        System.out.println("Numero: "+this.getNumero());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Saldo: "+this.getSaldo());
    }
    //getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
