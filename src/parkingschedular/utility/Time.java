/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingschedular.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import parkingschedular.ParkingSchedular;

/**
 *
 * @author Parkers
 */
public class Time extends Thread {

    /**
     *
     */
    JLabel t;
    JLabel d;
    public void start(JLabel t, JLabel d){
        this.t = t;
        this.d = d;
        start();
    }
    
    @Override
    public void run() {
        try {
            while(true){
            LocalDateTime now = LocalDateTime.now();
            ParkingSchedular.currentTime = now;
            DateTimeFormatter timeF = DateTimeFormatter.ofPattern("hh:mm:ss a");
            ParkingSchedular.time = now.format(timeF);
            t.setText(ParkingSchedular.time);
            
            DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd/MM/yyy");
            ParkingSchedular.date = now.format(dateF);
            d.setText(ParkingSchedular.date);
            
            Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
