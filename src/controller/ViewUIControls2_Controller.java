package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author JorgeLPR
 */
public class ViewUIControls2_Controller implements Initializable {
         
    @FXML
    private CheckBox checkBoxIndeterminate;
    
    @FXML
    private RadioButton radioHome, radioCalendar, radioContacts;
    
    @FXML
    private ToggleGroup group;
    
    @FXML
    private ImageView containerImage;
    
    @FXML
    private ComboBox<String> combobox1, combobox2;
        
    @FXML
    private void mouseEvent(MouseEvent event){
    
        if(checkBoxIndeterminate.isIndeterminate()){
            System.out.println("Indeterminado");
        }else if(checkBoxIndeterminate.isSelected()){
            System.out.println("Selected");        
        }else{
            System.out.println("No Selected");            
        }
        
    
    } 
        
    @FXML
    private void comboboxEvent(ActionEvent e){
    
        Object evt = e.getSource();
        
        if(evt.equals(combobox1)){
            
            System.out.println(combobox1.getSelectionModel().getSelectedItem());
        
        }
    
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
        radioHome.setUserData("home");
        radioCalendar.setUserData("calendar");
        radioContacts.setUserData("contact");
        
        group.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {
            if(group.getSelectedToggle() != null){
                
                Image image = new Image(
                        getClass().getResourceAsStream("/images/"+group.getSelectedToggle().getUserData().toString()+".png"));
                
                containerImage.setImage(image);
                
            }
        });
                
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, new String[]{"Masculino", "Femenino"});
        
        combobox1.getItems().addAll(list);
                
        combobox2.getItems().add("Maria@gmail.com");
        combobox2.getItems().add("jose@gmail.com");
        combobox2.getItems().add("lusia@gmail.com");        
        
        
        
    }    
    
}
