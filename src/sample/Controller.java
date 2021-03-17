package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Controller {
    public Label helloWorld;
    public Button btnHW;
    public GridPane fldGrid;

    public void textChange(ActionEvent actionEvent) {

        btnHW.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                helloWorld.setText("Hello World!");
                fldGrid.setStyle("-fx-background-color: red");
            }
        });
    }
}
