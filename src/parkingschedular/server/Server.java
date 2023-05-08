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
package parkingschedular.server;

import parkingschedular.ParkingSchedular;
import parkingschedular.utility.UserDetails;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nirbhay Pundir
 */
public class Server {

    static String url = "jdbc:mysql://localhost:3306/parkingschedular?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static String user = "";
    static String pass = "";

    public static Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            return con;

        } catch (SQLException e) {
            return con;
        }
    }

    public int register(String name, String phone, String email, String pass, String vehicle, int vehicleType) {
        try {
            String query = "INSERT INTO userinfo values('" + name + "','" + phone + "','" + email + "','" + pass + "','"
                    + vehicle
                    + "',"
                    + vehicleType + ")";
            System.out.println(query);
            int res;
            try (Connection con = connect(); Statement sta = con.createStatement()) {
                res = sta.executeUpdate(query);
            }
            return res;
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            System.out.println(e);
            return 0;
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    public int login(String email, String password) {
        int result = 1;
        try {
            String query = "SELECT * FROM userinfo WHERE email = '" + email + "' AND password = '" + password + "'";
            System.out.println(query);
            ResultSet res;
            try (Connection con = connect(); PreparedStatement sta = con.prepareStatement(query)) {
                res = sta.executeQuery();
                if (!res.next()) {
                    result = 0;
                }
            }
            res.close();
            return result;
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public UserDetails userDetails(String email) {
        try {
            String query = "SELECT * FROM userinfo WHERE email = '" + email + "'";
            System.out.println(query);
            ResultSet res;
            UserDetails ud;
            try (Connection con = connect(); PreparedStatement sta = con.prepareStatement(query)) {
                res = sta.executeQuery();
                res.next();
                ud = new UserDetails(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
                        res.getString(5), res.getInt(6));
            }
            res.close();
            return ud;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
            return null;
        }
    }

    public int getAvailableSlot() {
        try {
            String query = "SELECT * FROM slots";
            ResultSet res;
            int result;
            try (Connection con = connect(); PreparedStatement sta = con.prepareStatement(query)) {
                res = sta.executeQuery();
                result = 0;
                while (res.next()) {
                    result++;
                    if (result != res.getInt(1)) {
                        result--;
                        break;
                    }
                }
            }
            res.close();
            return result;
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    public int bookSlot(int id, String name, String vehicle, String arrivalTime, String payment, int type) {
        try {
            String query = "INSERT INTO slots values(" + id + ",'" + name + "','" + ParkingSchedular.Email + "','"
                    + vehicle + "','" + arrivalTime + "'," + type + ",'" + payment + "')";
            System.out.println(query);
            int res;
            try (Connection con = connect(); Statement sta = con.createStatement()) {
                res = sta.executeUpdate(query);
            }
            return res;
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            System.out.println(e);
            return 0;
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    public void getSlotTable(JTable t, JComboBox b) {
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        DefaultComboBoxModel bModel = (DefaultComboBoxModel) b.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
            bModel.removeElementAt(i);
        }
        try {
            String query = "SELECT * FROM slots where email='" + ParkingSchedular.Email + "'";

            Connection con = connect();
            PreparedStatement sta = con.prepareStatement(query);
            ResultSet res = sta.executeQuery();
            while (res.next()) {
                String r = "Slot " + res.getInt(1);
                Object[] row = {res.getInt(1), res.getString(2), res.getString(4), res.getString(5), res.getString(6),
                    res.getString(7)};
                model.addRow(row);
                bModel.addElement(r);
            }
            con.close();
            sta.close();
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
        }
    }

    public void updateUserDetails(String name, String phone, String email, String vehicle, int vehicleType) {
        try {
            String query = "UPDATE userinfo SET name='" + name + "', phone='" + phone + "', email='" + email
                    + "', vehicle='" + vehicle + "', vehicle_type = " + vehicleType + " WHERE email='"
                    + ParkingSchedular.Email + "'";
            System.out.println(query);
            Connection con = connect();
            PreparedStatement sta = con.prepareStatement(query);
            ResultSet res = sta.executeQuery();
            con.close();
            sta.close();
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
        }
    }

    public void releaseSlot(int index, JTable t, String time, String charge) {
        try {
            String query = "DELETE FROM slots WHERE id = " + t.getValueAt(index, 0);
            System.out.println(query);
            Statement sta;
            int res;
            try (Connection con = connect()) {
                sta = con.createStatement();
                res = sta.executeUpdate(query);
            }
            sta.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
        }
        try {
            String query = "INSERT INTO released_slots values(" + t.getValueAt(index, 0) + ",'" + t.getValueAt(index, 1) + "','" + ParkingSchedular.Email + "','"
                    + t.getValueAt(index, 2) + "'," + t.getValueAt(index, 4) + ",'" + t.getValueAt(index, 3) + "','" + time + "','" + charge + "')";
            System.out.println(query);
            Statement sta;
            int res;
            try (Connection con = connect()) {
                sta = con.createStatement();
                res = sta.executeUpdate(query);
            }
            sta.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
        }
    }
}
