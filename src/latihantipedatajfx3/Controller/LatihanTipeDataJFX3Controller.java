/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package latihantipedatajfx3.Controller;

import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import latihantipedatajfx3.Models.Salary_Calculator;
import javafx.scene.control.TextField;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class LatihanTipeDataJFX3Controller implements Initializable {

    Salary_Calculator sc = new Salary_Calculator();
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
    @FXML
    private TextField Login_Time;
    @FXML
    private TextField Logout_time;
    @FXML
    private TextField total_procedures;
    @FXML
    private TextField total_salary;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Calculate_btn_click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            sc.setWork_in(wkt.parse(Login_Time.getText()));
            sc.setWork_out(wkt.parse(Logout_time.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (sc.getWork_out().getTime() - sc.getWork_in().getTime()) / 1000) / 600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        sc.setProduce(jam * 5);
        total_procedures.setText(String.valueOf(sc.getProduce()));
        sc.setSalary(sc.getProduce()*2000);
        total_salary.setText(formater.format(sc.getSalary()));

    }

    @FXML
    private void cancel_click(ActionEvent event) {
        Logout_time.setText("");
        Login_Time.setText("");
        total_procedures.setText("");
        total_salary.setText("");

    }

    @FXML
    private void quit_btn_click(ActionEvent event) {
        System.exit(0);
    }

}
