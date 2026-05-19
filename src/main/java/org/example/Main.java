package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label lblTelefono = new Label("Ingrese un número de teléfono:");

        TextField txtTelefono = new TextField();
        txtTelefono.setPromptText("Ejemplo: 6123456789");

        Button btnValidar = new Button("Validar");

        btnValidar.setOnAction(e -> {

            String telefono = txtTelefono.getText();

            // Validación de 10 dígitos
            if (telefono.matches("\\d{10}")) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Correcto");
                alert.setHeaderText(null);
                alert.setContentText("Número válido: " + telefono);
                alert.showAndWait();

            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("El teléfono debe tener 10 dígitos.");
                alert.showAndWait();
            }
        });

        VBox root = new VBox(10, lblTelefono, txtTelefono, btnValidar);
        root.setPadding(new Insets(15));

        Scene scene = new Scene(root, 350, 180);

        stage.setTitle("Validación Teléfono");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}