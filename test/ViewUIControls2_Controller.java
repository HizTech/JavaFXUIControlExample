

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
    private RadioButton radioHome, radioContacts, radioCalendar;
    
    @FXML
    private ImageView imageRadio;
    
    @FXML
    private CheckBox checkBoxIndeterminate;
        
    @FXML
    private ToggleGroup groupToggle;
    
    @FXML
    private void mouseEvent(MouseEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(checkBoxIndeterminate)){
            if(checkBoxIndeterminate.isSelected()){
                System.out.println("selected");
            }else if(checkBoxIndeterminate.isIndeterminate()){
                System.out.println("indeterminate");
            }else{
                System.out.println("no selected");
            
            }
        }
        
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        radioHome.setUserData("home");
        radioCalendar.setUserData("calendar");
        radioContacts.setUserData("contact");
        
        groupToggle.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            @Override
            public void changed(ObservableValue<? extends Toggle> ov,
                Toggle old_toggle, Toggle new_toggle) {
                    if (groupToggle.getSelectedToggle() != null) {
                        
                        final Image image = new Image(
                            getClass().getResourceAsStream("/images/"+groupToggle.getSelectedToggle().getUserData().toString()+".png"
                            )
                        );
                        imageRadio.setImage(image);
                    }                
                }

        });        
        
        
    }    
    
}
