/*
 * The MIT License
 *
 * Copyright 2023 Nirbhay Pundir.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
 * @author Nirbhay Pundir
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
