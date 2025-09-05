package javafxbasico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class FXMLAlertController implements Initializable {

    @FXML
    private Button btnAbrirAlert;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    
    public void abrirAlert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Titulo");
        alert.setHeaderText("CUIDADO");
        alert.setContentText("Houve um erro (conteudo)");
        alert.show();
    }
}
