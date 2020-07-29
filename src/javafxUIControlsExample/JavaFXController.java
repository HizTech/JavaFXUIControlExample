/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxUIControlsExample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeLPR
 */
public class JavaFXController extends Application {
    
    private String url="";
    
    @Override
    public void init(){
        
        int option = Integer.parseInt(JOptionPane.showInputDialog("INTERFACES GRÁFICAS\n"
                + "1- ViewUIControls_1.fxml\n"
                + "2- ViewUIControls_2.fxml"));

        switch(option){
            
            case 1:
                url = "/view/ViewUIControls_1.fxml";
            break;
            
            case 2:
                url = "/view/ViewUIControls_2.fxml";                
            break;
            
            default:
                url = "/view/ViewUIControls_1.fxml";                
            break;
            
        }
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource(url));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
