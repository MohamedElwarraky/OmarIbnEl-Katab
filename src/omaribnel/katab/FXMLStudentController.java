/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omaribnel.katab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


/**
 * FXML Controller class
 *
 * @author FacultyStudent
 */
public class FXMLStudentController implements Initializable {

    @FXML
    private TabPane TabpaneSubject;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AddSubjectTabMenuOnAction(ActionEvent event) {
          try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLAddSubject.fxml"));
            Scene scene = new Scene(root2);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("اضافة ماده");
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void DeleteSubjectTabMenuOnAction(ActionEvent event) {
        
    }

    @FXML
    private void AddSubjectTabOnAction(ActionEvent event) {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLAddSubject.fxml"));
            Scene scene = new Scene(root2);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("اضافة ماده");
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void SearchToolsMenuItem(ActionEvent event) {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLSearch.fxml"));
            Scene scene = new Scene(root2);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("بحث");
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void SettingToolsMenuItem(ActionEvent event) {
          try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLSettings.fxml"));
            Scene scene = new Scene(root2);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("اعدادات");
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void AddTeacherToolsMenuItem(ActionEvent event) {
          try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLTeacher.fxml"));
            Scene scene = new Scene(root2);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("اضافه مدرس");
            stage.show();
  
        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void CloseProgramToolsMenuItem(ActionEvent event) {
        Platform.exit();
    }

}
