package javapoo_002.model;
import java.util.Scanner;
public class Veiculo {
    Scanner sc = new Scanner(System.in);
    //atributos
    String marca, modelo, ano, placa;
    double valorVenda;
   
    //construtor
    public Veiculo(){    
    }

    //metodos

    
    public void exibir(){
        System.out.println("Marca: "+this.getMarca()+
                "\nModelo: "+this.getModelo()+
                "\nAno do Carro: "+this.getAno()+
                "\nValor de Venda: "+this.getValorVenda()+
                "\nPlaca: "+this.getPlaca());
    }

    //getter e setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
