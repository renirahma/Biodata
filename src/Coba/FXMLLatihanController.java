/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author client
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField absen;
    @FXML
    private TextField telp;
    @FXML
    private JFXTextArea TA;
    @FXML
    private Button proses;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
       String Nama=nama.getText();
       String Alamat=alamat.getText();
       String Absen=absen.getText();
       String Telp=telp.getText();
 
       TA.setText("Nama : "+Nama+"\nAlamat : "+Alamat+"\nAbsen : "+Absen+"\nNo Telepon : "+Telp);
    }

    @FXML
    private void buttonHapus(ActionEvent event) {
        TA.setText("");
        nama.setText("");
        absen.setText("");
        alamat.setText("");
        telp.setText("");
    }
    
}
