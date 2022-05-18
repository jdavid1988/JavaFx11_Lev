package hu.unideb.inf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class fxmlNewRelcont {
    ObservableList<String> testalkatList = FXCollections.observableArrayList("Fullos","Átlagos","Többet soha");

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
    void pushButtonExit(){

    }
}
