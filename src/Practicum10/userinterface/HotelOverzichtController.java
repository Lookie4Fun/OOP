package Practicum10.userinterface;

import Practicum10.model.Boeking;
import Practicum10.model.Hotel;
import Practicum10.model.Klant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.List;

public class HotelOverzichtController {
    @FXML private Label hotelnaamLabel;
    @FXML private ListView boekingenListView;
    @FXML private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Boekingen.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
            initialize();
        }
        catch (Exception e){
            System.out.println(e);

        }
    }

    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();

        List<Boeking> alleBoekingen = hotel.getBoekingen();
        for (Boeking boeking: alleBoekingen){
            boekingen.add("Vanaf "+boeking.getAankomstDatum()+" tot "+boeking.getVertrekDatum()+" is "+boeking.getKamer()+" geboekt door "+ boeking.getBoeker().getNaam());
        }
        boekingenListView.setItems(boekingen);
    }
}