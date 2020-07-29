package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeLPR
 */
public class ViewUIControls1_Controller implements Initializable {
        
    @FXML
    private Button button;
    
    @FXML
    private TextField txt1, txt2, txt3, txt4;
    
    @FXML
    private void eventKey(KeyEvent event){
    
        Object evt = event.getSource();
        
        if(evt.equals(txt1)){
            
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")){
                event.consume();
            }
            
        }else if(evt.equals(txt2)){
        
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }            
            
        }else if(evt.equals(txt3)){

            if(!Character.isDigit(event.getCharacter().charAt(0)) && !Character.isLetter(event.getCharacter().charAt(0))
                                 && !event.getCharacter().equals(" ")){
                event.consume();
            }            
            
        }else if(evt.equals(txt4)){
        
            if(txt4.getText().length() > 7){
                event.consume();
            }
            
        }
    
    }
    
    
    @FXML
    private void eventButton(ActionEvent event){
    
        JOptionPane.showMessageDialog(null, "Hola Mundo ");
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

        
    }    
    
}
