package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class fxmlStrConncont {

    @FXML
    void pushButtonBack (ActionEvent event) throws IOException {
        Parent registry = FXMLLoader.load(getClass().getResource("/fxml/fxmlwelc.fxml"));
        Scene registryScene = new Scene(registry);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(registryScene);
        window.show();
    }

    @FXML
    void pushButtonEdit (ActionEvent event) throws IOException {
        Parent newrely = FXMLLoader.load(getClass().getResource("/fxml/fxmlNewRel.fxml"));
        Scene newrelyScene = new Scene(newrely);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(newrelyScene);
        window.show();
    }
    @FXML
    void pushButtonMainMenu (ActionEvent event) throws IOException {
        Parent registry = FXMLLoader.load(getClass().getResource("/fxml/fxmlwelc.fxml"));
        Scene registryScene = new Scene(registry);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(registryScene);
        window.show();
    }
    @FXML
    void pushButtonForward (){

    }
}
