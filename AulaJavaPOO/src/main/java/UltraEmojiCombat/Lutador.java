package UltraEmojiCombat;
public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    //metodos publicos
    public void apresentar(){
        System.out.println("CHEGOU A HORA DE APRESENTAR O LUTADOR "+this.getNome());
        System.out.println("DIRETAMENTE DE "+this.getNacionalidade());
        System.out.println("COM "+this.getIdade()+" ANOS E "+this.getAltura()+" DE ALTURA");
        System.out.println("PESANDO "+this.getPeso()+"KG");
        System.out.println(this.getVitorias()+" VITORIAS");
        System.out.println(this.getDerrotas()+" DERROTAS");
        System.out.println(this.getEmpates()+" EMPATES");
    }
    public void status(){
        System.out.println(this.getNome()+" é um "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, 
                   int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }
    //getterrs e setters

    public String getNome() {
        return nome;
    }
    public String toString() { //esse aqui é pra aparecer o nome de quem venceu
        return this.getNome();
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Peso Medio";
        } else if(this.peso <= 120.2){
            this.categoria = "Peso Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
}
