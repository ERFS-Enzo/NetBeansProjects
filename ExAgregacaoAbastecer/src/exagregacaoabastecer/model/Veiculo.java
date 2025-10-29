package exagregacaoabastecer.model;
import java.util.ArrayList;
import java.util.List;
public class Veiculo {
    private int id;
    private String descricao, odometro, placa, chassis;
    private double valorVeiculo;
    private List<Abastecimento> abastecimentos;

    public Veiculo() {
        this.abastecimentos = new ArrayList<>();
    }

    
    public void adicionarAbastecimento(Abastecimento a) {
        this.abastecimentos.add(a);
    }

    @Override
    public String toString() {
        return "Veiculo{" + 
                "\nid: " + id + 
                "\ndescricao: " + descricao + 
                "\nodometro: " + odometro + 
                "\nplaca: " + placa + 
                "\nchassis: " + chassis + 
                "\nvalorVeiculo: " + valorVeiculo + 
                "\n}";
    }
    
    
    
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

    public String getOdometro() {
        return odometro;
    }
    public void setOdometro(String odometro) {
        this.odometro = odometro;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassis() {
        return chassis;
    }
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    
    public List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }
    public void setAbastecimentos(List<Abastecimento> abastecimentos) {
        this.abastecimentos = abastecimentos;
    }
    
    public double getValorVeiculo() {
        return valorVeiculo;
    }
    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
}
