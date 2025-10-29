package exagregacaoabastecer.model;
public class Abastecimento {
    private int id;
    private double kmPercorrido, quantidadeLitros, valorAbastecimento, mediaConsumo;
    private Combustivel combustivel;
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getKmPercorrido() {
        return kmPercorrido;
    }
    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getQuantidadeLitros() {
        return quantidadeLitros;
    }
    public void setQuantidadeLitros(double quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public double getValorAbastecimento() {
        return valorAbastecimento;
    }
    public void setValorAbastecimento(double valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }
    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}
