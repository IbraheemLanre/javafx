package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    public void init(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);

    }

    @FXML
    public void onButtonClick(ActionEvent e){
        if(e.getSource().equals(helloButton)){
            System.out.println("Saying Hello..., " + nameField.getText());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Saying Bye..., " + nameField.getText());
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}
