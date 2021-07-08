package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    
    @FXML
    public void onButtonClick(){
        System.out.println("Saying Hello..., " + nameField.getText());
    }
}
