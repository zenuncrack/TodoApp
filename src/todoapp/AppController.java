/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package todoapp;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ashik
 */
public class AppController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextField description;

    @FXML
    private ListView<LocalEvent> eventlist;
    
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();
    
    @FXML
    private void addEvent(Event e)
    {
        list.add(new LocalEvent(datepicker.getValue(), description.getText()));
        eventlist.setItems(list);
        refresh();
    }
    
    public void refresh()
    {
        datepicker.setValue(LocalDate.now());
        description.setText("");
    }
    @FXML
    private void remove(Event e)
    {
        int selectedID =eventlist.getSelectionModel().getSelectedIndex();
        eventlist.getItems().remove(selectedID);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        datepicker.setValue(LocalDate.now());
    }    
    
}
