package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label text;

    public void SayHi(ActionEvent event){
String prefix = text.getText();
text.setText(prefix + " Andrius");

    }
}

