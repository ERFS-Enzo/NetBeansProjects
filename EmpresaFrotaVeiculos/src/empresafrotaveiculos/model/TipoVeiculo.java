package empresafrotaveiculos.model;
import java.util.ArrayList;
public class TipoVeiculo {
    private int id;
    private String descricao;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    
    public TipoVeiculo() {
    }

    public TipoVeiculo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoVeiculo{" + 
                "\nid=" + id + 
                "\ndescricao=" + descricao + 
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

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
}
