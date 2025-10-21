package empresafrotaveiculos.model;
public class Veiculo {
    private int idVeiculo;
    private String marca, modelo, odometro;
    private double valorVeiculo;

    
    public Veiculo(int idVeiculo, String marca, String modelo, String Odometro, double valorVeiculo) {
        this.idVeiculo = idVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.odometro = Odometro;
        this.valorVeiculo = valorVeiculo;
    }

    public Veiculo() {
    }

    @Override
    public String toString() {
        return "Veiculo{" + 
                "\nidVeiculo=" + idVeiculo + 
                "\nmarca=" + marca + 
                "\nmodelo=" + modelo + 
                "\nOdometro=" + odometro + 
                "\nvalorVeiculo=" + valorVeiculo +
                "\n}";
    }

    
    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

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

    public String getOdometro() {
        return odometro;
    }

    public void setOdometro(String Odometro) {
        this.odometro = Odometro;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
    
    
}
