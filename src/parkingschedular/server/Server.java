/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingschedular.server;

import parkingschedular.ParkingSchedular;
import parkingschedular.UserDetails;
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
 * <p>
 * Server class.
 * </p>
 *
 * @author Parkers
 * @version $Id: $Id
 */
public class Server {

    static String url = "jdbc:mysql://localhost:3306/parkingschedular?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static String user = "root";
    static String pass = "Abcxyz@8979";

    /**
     * <p>
     * connect.
     * </p>
     *
     * @return a Connection object
     */
    public static Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            return con;

        } catch (SQLException e) {
            return con;
        }
    }

    /**
     * <p>
     * register.
     * </p>
     *
     * @param name a {@link java.lang.String} object
     * @param phone a {@link java.lang.String} object
     * @param email a {@link java.lang.String} object
     * @param pass a {@link java.lang.String} object
     * @param vehicle a {@link java.lang.String} object
     * @param vehicleType a int
     * @return a int
     */
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

    /**
     * <p>
     * login.
     * </p>
     *
     * @param email a {@link java.lang.String} object
     * @param password a {@link java.lang.String} object
     * @return a int
     */
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
            return -1;
        }
    }

    /**
     * <p>
     * userDetails.
     * </p>
     *
     * @param email a {@link java.lang.String} object
     * @return a {@link com.parkers.parkingschedular.UserDetails} object
     */
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

    /**
     * <p>
     * getAvailableSlot.
     * </p>
     *
     * @return a int
     */
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

    /**
     * <p>
     * bookSlot.
     * </p>
     *
     * @param id a int
     * @param name a {@link java.lang.String} object
     * @param vehicle a {@link java.lang.String} object
     * @param arrivalTime a {@link java.lang.String} object
     * @param payment a {@link java.lang.String} object
     * @param type a int
     * @return a int
     */
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

    /**
     * <p>
     * getSlotTable.
     * </p>
     *
     * @param t a {@link javax.swing.JTable} object
     */
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

    /**
     * <p>
     * updateUserDetails.
     * </p>
     *
     * @param name a {@link java.lang.String} object
     * @param phone a {@link java.lang.String} object
     * @param email a {@link java.lang.String} object
     * @param vehicle a {@link java.lang.String} object
     * @param vehicleType a int
     */
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
