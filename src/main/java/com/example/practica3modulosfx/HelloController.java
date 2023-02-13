package com.example.practica3modulosfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
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
    protected void onMostrarMatriculaClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    }
}