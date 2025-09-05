package Ex01;
public class Pessoa {
    //atributos
    String nome, sexo;
    int idade;
    
    //metodos
    public void dados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
    }
    public void verificar(){
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else if(idade < 18 && idade >= 0){
            System.out.println("Você é menor de idade");
        } else{
            System.out.println("Digite uma idade válida");
        }
    }
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }   
}
