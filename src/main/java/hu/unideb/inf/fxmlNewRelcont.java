package hu.unideb.inf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class fxmlNewRelcont {
    ObservableList<String> testalkatList = FXCollections.observableArrayList("Fullos","Átlagos","Többet soha");
    @FXML
    private RadioButton maleBtn;
    @FXML
    private RadioButton femaleBtn;
    @FXML
    private ChoiceBox testalkat;

    @FXML
    private void initialize (){
        testalkat.setItems(testalkatList);
        testalkat.setValue("mmm");
    }

    @FXML
    private TextField neName;

    @FXML
    private TextField telephoneNumber;

    @FXML
    private CheckBox active;

    @FXML
    void pushButtonSave(){

    }

    @FXML
    void pushButtonExit(ActionEvent event) throws IOException {
        Parent registri = FXMLLoader.load(getClass().getResource("/fxml/fxmlreg.fxml"));
        Scene registriScene = new Scene(registri);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(registriScene);
        window.show();
    }
}
