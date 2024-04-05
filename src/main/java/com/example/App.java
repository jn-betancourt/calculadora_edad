package com.example;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */

 // Somos el grupo que se reinicio el pc ejecutando el programa
 // Integrantes:
 // Juan Antonio Betancourt
 // Esteban Gomez Leon
 // Jacobo Villa
public class App extends Application {
    // Crear un DatePicker
    private DatePicker datePicker = new DatePicker();
    private Label label = new Label("Escoge tu fecha de nacimiento");

    @Override
    public void start(Stage primaryStage) {
        // Crear un contenedor para colocar el DatePicker
        VBox root = new VBox();
        root.getChildren().add(label);
        root.getChildren().add(datePicker);

        // Crear la escena y añadir el contenedor
        Scene scene = new Scene(root, 600, 400);

        // Configurar la ventana principal
        primaryStage.setTitle("Seleccionar Fecha");
        primaryStage.setScene(scene);

        datePicker.setOnAction(e->getDate());
        // Mostrar la ventana
        primaryStage.show();
    }

    public void getDate() {
        int año = datePicker.getValue().getYear();
        int añoActual = LocalDate.now().getYear();
        int edad = añoActual-año;
        label.setText("Tu edad es: "+edad+" años");
    }

    public static void main(String[] args) {
        launch(args);
    }

}