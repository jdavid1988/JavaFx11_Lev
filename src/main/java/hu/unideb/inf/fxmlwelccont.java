package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class fxmlwelccont {

    @FXML
    private TextField allConnections;

    @FXML
    private TextField activeConnections;

    @FXML
    void pushButtonNewRelationship(ActionEvent event) throws IOException {
        Parent newrel = FXMLLoader.load(getClass().getResource("/fxml/fxmlNewRel.fxml"));
        Scene newrelScene = new Scene(newrel);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(newrelScene);
        window.show();
    }

    @FXML
    void pushButtonStoredContacts(ActionEvent event) throws IOException {
        Parent storedcont = FXMLLoader.load(getClass().getResource("/fxml/fxmlStrConn.fxml"));
        Scene storedcontScene = new Scene(storedcont);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(storedcontScene);
        window.show();
    }
}
