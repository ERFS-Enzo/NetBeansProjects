package Ex05;
public final class Carro {
    //atributo
    String modelo;
    int ano;
    float velocidadeAtual;
    //construtor

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.setVelocidadeAtual(0);
    }
    //metodos
    public void acelerar(float valor){
        if (valor <= 0) {
            System.out.println("Digite um valor positivo");
            return;
        }
        if (velocidadeAtual + valor > 180) {
            System.out.println("O carro não suporta acelerar mais que 180 km/h");
        } else {
            velocidadeAtual += valor;
        }
    }
    public void frear(float valor){
        if (valor <= 0) {
            System.out.println("Digite um valor positivo");
            return;
        }
        if (velocidadeAtual == 0) {
            System.out.println("O carro já está parado");
        } else {
            velocidadeAtual -= valor;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }
    public void estado(){
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Velocidade: "+this.getVelocidadeAtual()+"km/h");
    }
    //getters setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
}
