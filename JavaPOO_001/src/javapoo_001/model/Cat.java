package javapoo_001.model;
public class Cat {

    private String name, gender, age, weight, color;

    public Cat() {
        this.name = "";
        this.gender = "";
        this.age = "";
        this.weight = "";
        this.color = "";
    }

    public Cat(String name, String gender, String age, String weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    
    
    /*
    Em qualquer definição de uma classe, quando estou criando um classe, nao se pode ter
    dois atributos do mesmo nome, isso funciona para metodos tambem, mas deu certo em cima pois um dos
    construtores nao possui parametro, e o outro possui. caso um seja diferente do outro, pode, pois
    o objeto é diferenciado automaticamente.
    
    nome do metodo + parametros -> assinatura do método
    
    desde que tenha assinaturas diferentes, pode se ter os nomes diferentes.
    O que diferencia uma assinatura da outro é o tipo dos parâmetros
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public String printCat(){
        return "Cat name: "+this.name+
                "\nAge: "+this.age+
                "\nWeight: "+this.weight+
                "\nGender: "+ this.gender;
    }
    //Conceito: 
    /*
    Overload (mesma classe, metodo c/ mesmo nome, assinaturas diferentes)
    Override (classes difentes, metodos c/ mesma assinatura, herança)
    
    ambos são sobreposição de métodos
    */

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", weight=" + weight + ", color=" + color + '}';
    }
    
    
}
