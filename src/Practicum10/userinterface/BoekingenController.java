package Practicum10.userinterface;

import Practicum10.model.Boeking;
import Practicum10.model.Hotel;
import Practicum10.model.Kamer;
import Practicum10.model.KamerType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoekingenController {

    @FXML public TextField naamVeld;
    @FXML public TextField AdresVeld;
    @FXML public DatePicker aankkomstdatumVeld;
    @FXML public DatePicker vertrekdatumVeld;
    @FXML public ComboBox<KamerType> kamertypeVeld;
    ObservableList<KamerType> kamertypeLijst = FXCollections.observableArrayList(Hotel.getHotel().getKamerTypen());
    @FXML public Label errorVeld;

    public void initialize(){
        kamertypeVeld.setItems(kamertypeLijst);
    }

    public void voegBoekingToe(ActionEvent actionEvent) {
        if(aankkomstdatumVeld.getValue() != null && vertrekdatumVeld.getValue()!= null && naamVeld.getText()!= null && AdresVeld.getText()!= null && kamertypeVeld.getValue()!= null) {
            try {
                Hotel.getHotel().voegBoekingToe(aankkomstdatumVeld.getValue(), vertrekdatumVeld.getValue(), naamVeld.getText(), AdresVeld.getText(), kamertypeVeld.getValue());
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            errorVeld.setVisible(true);
        }

    }

    public void geefNaamIn(ActionEvent actionEvent) {
    }

    public void geefAdresIn(ActionEvent actionEvent) {
    }

    public void geefAankomstdatum(ActionEvent actionEvent) {
    }

    public void geefVertrekdatum(ActionEvent actionEvent) {
    }

    public void kamertypeCombobox(ActionEvent actionEvent) {

    }

    public void resetAlleVelden(ActionEvent actionEvent) {
        naamVeld.setText("");
        AdresVeld.setText("");
        aankkomstdatumVeld.setValue(null);
        vertrekdatumVeld.setValue(null);
        kamertypeVeld.setValue(null);
    }
}

