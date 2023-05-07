/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package parkingschedular;

import java.awt.Color;
import java.time.LocalDateTime;
import parkingschedular.login.LoginGUI;
import parkingschedular.register.RegisterGUI;
import parkingschedular.server.Server;
import parkingschedular.user.UserDashboardGUI;

/**
 * <p>
 * ParkingSchedular class.
 * </p>
 *
 * @author Parkers
 * @version $Id: $Id
 */
public class ParkingSchedular {

    /**
     * Constant <code>lg</code>
     */
    public static LoginGUI lg;
    /**
     * Constant <code>rg</code>
     */
    public static RegisterGUI rg;
    /**
     * Constant <code>udg</code>
     */
    public static UserDashboardGUI udg;
    /**
     * Constant <code>server</code>
     */
    public static Server server;
    public static Color enterButtonColor = new Color(40, 200, 55);
    public static Color buttonColor = new Color(0, 214, 34);
    public static Color panelColor = new Color(0, 0, 0, 60);
    /**
     * Constant <code>Email="null"</code>
     */
    public static String Email = null;
    public static String date;
    public static String time;
    public static LocalDateTime currentTime;

    /**
     * <p>
     * main.
     * </p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        lg = new LoginGUI();
        rg = new RegisterGUI();
        udg = new UserDashboardGUI();
        server = new Server();

        rg.setVisible(false);
        rg.setEnabled(false);
        udg.setVisible(false);
        udg.setEnabled(false);

        lg.setVisible(true);
        lg.setEnabled(true);
    }
}
