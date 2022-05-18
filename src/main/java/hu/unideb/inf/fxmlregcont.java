package hu.unideb.inf;

import com.sun.javafx.stage.EmbeddedWindow;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class fxmlregcont {

    private MainApp main;
    ObservableList<String> genderList = FXCollections.observableArrayList("Férfi","Nő");

    @FXML
    private TextField name;

    @FXML
    private TextField age;

    @FXML
    private ChoiceBox gender;

    @FXML
    private void initialize (){
        gender.setItems(genderList);
        gender.setValue("mm");
    }

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private PasswordField userpsw;
    private EmbeddedWindow stage;

    @FXML
    public void pushButtonReg(ActionEvent event) throws IOException {

        Parent registration = FXMLLoader.load(getClass().getResource("/fxml/fxmlwelc.fxml"));
        Scene registrationScene = new Scene(registration);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(registrationScene);
        window.show();

    }
    @FXML
    void pushButtonEntry(ActionEvent event) throws IOException {
        Parent registration = FXMLLoader.load(getClass().getResource("/fxml/fxmlwelc.fxml"));
        Scene registrationScene = new Scene(registration);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(registrationScene);
        window.show();

    }
}
