package com.example.java_giorgi_shavlokhashvili;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Text dest1 = new Text("airport, city");
        ComboBox comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll(
                "germany (GER) berlin",
                "germany (GER) duseldorf",
                "germany (GER) dortmund",
                "germany (GER) memingen"
        );
        comboBox1.setPromptText("from?");
        comboBox1.setOnAction(e -> System.out.println("user select"+ comboBox1.getValue()));

        Text dest2 = new Text("airport, city");
        ComboBox comboBox2 = new ComboBox<>();
        comboBox1.getItems().addAll(
                "poland (POL) warsaw",
                "poland (POL) krakow",
                "poland (POL) katovice",
                "poland (POL) gdansk ");

                comboBox2.setPromptText("where?");
        comboBox2.setOnAction(e -> System.out.println("user select"+ comboBox2.getValue()));

       Text depart = new Text("departune");
        DatePicker datePicker =  new DatePicker();
        datePicker.setPromptText("choose time ");
        datePicker.setOnAction(actionEvent -> {
            System.out.println("arrival time"+datePicker.getValue());
        });
        Text amount = new Text("pasenger amount");
        TextField textField = new TextField();
        Text text = new Text();
        Button button = new Button("booking");
        button.setStyle("-fx-background-color: red; -fx-text-fill: blue");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                int depart = Integer.parseInt(textField.getText());
                int price = 3200;
                String result = String.valueOf(price * depart);

                text.setText(result);






            }
        });
        Text pricemss = new Text();
        GridPane gridPane = new GridPane();
        gridPane.setMaxSize(500, 250);
        gridPane.setVgap(6);
        gridPane.setHgap(5);
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(dest1, 1, 1);
        gridPane.add(comboBox1, 0, 2);
        gridPane.add(datePicker, 1, 2);
        gridPane.add(dest2, 0, 3);
        gridPane.add(comboBox2, 1, 3);
        gridPane.add(depart, 1, 4);
        gridPane.add(amount,2,1);
        gridPane.add(text,4,2);
        gridPane.add(button,2,2);


        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
}