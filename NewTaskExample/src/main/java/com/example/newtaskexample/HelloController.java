package com.example.newtaskexample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {
    private Task<ObservableList<String>> task;

    @FXML
    private ListView listView;

    public void initialize(){
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                ObservableList<String> employees = FXCollections.observableArrayList(
                        "Ekeh John",
                        "Bill Rogers",
                        "Jack Jill",
                        "Joan Andrews",
                        "Mary Johnson",
                        "Bob Dylan"
                );

                return employees;
            }
        };

        listView.itemsProperty().bind(task.valueProperty());
    }


   // @FXML
    //private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
        new Thread(task).start();
    }
}