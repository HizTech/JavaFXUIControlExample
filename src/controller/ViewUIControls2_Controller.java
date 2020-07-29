package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
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
    private void mouseEvent(MouseEvent event){
    
        if(checkBoxIndeterminate.isIndeterminate()){
            System.out.println("Indeterminado");
        }else if(checkBoxIndeterminate.isSelected()){
            System.out.println("Selected");        
        }else{
            System.out.println("No Selected");            
        }
        
    
    } 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
        radioHome.setUserData("home");
        radioCalendar.setUserData("calendar");
        radioContacts.setUserData("contact");
        
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                
                if(group.getSelectedToggle() != null){
                    
                    Image image = new Image(
                    getClass().getResourceAsStream("/images/"+group.getSelectedToggle().getUserData().toString()+".png"));
                
                    containerImage.setImage(image);
                    
                }

            }
        });
        
        
    }    
    
}
