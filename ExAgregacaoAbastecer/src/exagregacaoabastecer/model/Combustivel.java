package exagregacaoabastecer.model;

public class Combustivel {
    private int id;
    private String descricao;
    private double valorLitro;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorLitro() {
        return valorLitro;
    }
    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }
}
