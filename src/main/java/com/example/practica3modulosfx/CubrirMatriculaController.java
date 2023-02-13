package com.example.practica3modulosfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CubrirMatriculaController {
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellidos;
    @FXML
    private TextField NIF;
    @FXML
    private TextField codigoPostal;
    @FXML
    private TextField correoElectronico;
    @FXML
    private Button mostrarMatricula;
    @FXML
    private Label horasSeleccionadas;
    @FXML
    private CheckBox checkBoxProgramacion;
    @FXML
    private CheckBox checkBoxDiseñoInterfaces;
    @FXML
    private CheckBox checkBoxAccesoDatos;

    @FXML
    protected void onMostrarMatriculaClick() throws Exception {

        try {

            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(MatriculaApplication.class.getResource("Mostrar-Matricula.fxml"));

            // Cargo la ventana
            Parent root = loader.load();

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Error, debe .....!");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            System.out.println(e.getMessage().toString());
            alert.showAndWait();
        }

    }




}