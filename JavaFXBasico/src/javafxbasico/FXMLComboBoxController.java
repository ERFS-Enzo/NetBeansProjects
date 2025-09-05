package javafxbasico;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import javafxbasico.model.Categoria;

public class FXMLComboBoxController implements Initializable {

    
    @FXML
    private ComboBox<Categoria> cbCategorias;
    
    private List<Categoria> categorias = new ArrayList<>();
    private ObservableList<Categoria> obsCategorias;
    
    @FXML
    private void pegarSelecionado(){
        
        Categoria categoria = cbCategorias.getSelectionModel().getSelectedItem();
        System.out.println("ID: "+categoria.getId()+" - NOME: "+categoria.getNome());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarCategorias();
    }    
    
    public void carregarCategorias(){
        Categoria categoria1 = new Categoria(1, "Bebidas");
        Categoria categoria2 = new Categoria(2, "Comidas");
        
        categorias.add(categoria1);
        categorias.add(categoria2);
        
        obsCategorias = FXCollections.observableArrayList(categorias);
        
        cbCategorias.setItems(obsCategorias);
    }
}
