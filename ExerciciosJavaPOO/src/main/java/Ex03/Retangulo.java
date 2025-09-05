package Ex03;
public class Retangulo {
    float largura, comprimento, perimetro, area;
    
    //construtor   
    public Retangulo(float largura, float comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    //metodos
    public float CalcularArea() { //Lado * Lado
        area = largura*comprimento;
        return area; //ao retornar o "public void" tem que ser "public float", e tenho que retornar para poder usar o resultado em calculos()
    }
    public float CalcularPerimetro(){ //soma dos lados       
        perimetro = (largura*2)+(comprimento*2);
        return perimetro; //ao retornar o "public void" tem que ser "public float", e tenho que retornar para poder usar o resultado em calculos()
    }
    public void calculos(){
        System.out.println("-----------------------------------------");
        System.out.println("O retangulo tem a Area de "+CalcularArea()+"m²");
        System.out.println("O retangulo tem o perimetro de "+CalcularPerimetro()+"m");
    }
    //getters e setters
    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comrpimento) {
        this.comprimento = comprimento;
    }    
}
