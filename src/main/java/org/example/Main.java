package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage stage) {

        // Etiqueta que indica qué debe introducir el usuario
        Label lblTelefono = new Label(
                "Ingrese un número de teléfono:"
        );

        // Campo de texto para escribir el teléfono
        TextField txtTelefono = new TextField();

        // Texto guía que aparece dentro del campo
        txtTelefono.setPromptText(
                "Ejemplo: 6123456789"
        );

        // Creación del botón validar
        Button btnValidar = new Button("Validar");

        // Evento que se ejecuta al pulsar el botón
        btnValidar.setOnAction(e -> {

            // Obtener texto introducido
            String telefono =
                    txtTelefono.getText();

            // Validación usando expresión regular
            // \\d = dígitos del 0 al 9
            // {10} = exactamente 10 caracteres
            if (telefono.matches("\\d{10}")) {

                // Ventana emergente de éxito
                Alert alert =
                        new Alert(
                        Alert.AlertType.INFORMATION
                );

                // Configuración de la alerta
                alert.setTitle("Correcto");
                alert.setHeaderText(null);

                // Mensaje mostrado
                alert.setContentText(
                        "Número válido: " + telefono
                );

                // Mostrar alerta
                alert.showAndWait();

            } else {

                // Ventana emergente de error
                Alert alert =
                        new Alert(
                        Alert.AlertType.ERROR
                );

                // Configuración
                alert.setTitle("Error");
                alert.setHeaderText(null);

                // Mensaje de error
                alert.setContentText(
                    "El teléfono debe tener 10 dígitos."
                );

                // Mostrar alerta
                alert.showAndWait();
            }
        });

        // VBox organiza elementos verticalmente
        // El 10 indica separación entre componentes
        VBox root = new VBox(
                10,
                lblTelefono,
                txtTelefono,
                btnValidar
        );

        // Añade márgenes internos
        root.setPadding(new Insets(15));

        // Crear escena
        Scene scene = new Scene(root, 350, 180);

        // Configurar ventana
        stage.setTitle("Validación Teléfono");
        stage.setScene(scene);

        // Mostrar ventana
        stage.show();
    }

    // Método principal para iniciar aplicación
    public static void main(String[] args) {
        launch();
    }
}
