package com.tony.crud;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("Hola mundo");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello world");
            }
        });
        CheckBox chek = new CheckBox("Check Box");
        TextField text = new TextField("Text Field");

        HBox hbox = new HBox();
        hbox.getChildren().addAll(chek, text);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(hbox);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hola mundo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}