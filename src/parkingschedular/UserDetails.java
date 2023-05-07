/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingschedular;

/**
 * <p>
 * UserDetails class.
 * </p>
 *
 * @author Parkers
 * @version $Id: $Id
 */
public class UserDetails {

    private String name;
    private String email;
    private String phone;
    private String password;
    private String vehicle;
    private String vehicleType;

    /**
     * <p>
     * Constructor for UserDetails.
     * </p>
     *
     * @param name a {@link java.lang.String} object
     * @param phone a {@link java.lang.String} object
     * @param email a {@link java.lang.String} object
     * @param password a {@link java.lang.String} object
     * @param vehicle a {@link java.lang.String} object
     * @param vehicleType a int
     */
    public UserDetails(String name, String phone, String email, String password, String vehicle, int vehicleType) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.vehicle = vehicle;
        this.vehicleType = (vehicleType == 0) ? "Car" : "Motorcycle";
    }

    /**
     * <p>
     * Setter for the field <code>name</code>.
     * </p>
     *
     * @param name a {@link java.lang.String} object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Setter for the field <code>email</code>.
     * </p>
     *
     * @param email a {@link java.lang.String} object
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Setter for the field <code>phone</code>.
     * </p>
     *
     * @param phone a {@link java.lang.String} object
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * <p>
     * Setter for the field <code>password</code>.
     * </p>
     *
     * @param password a {@link java.lang.String} object
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Setter for the field <code>vehicle</code>.
     * </p>
     *
     * @param vehicle a {@link java.lang.String} object
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * <p>
     * Setter for the field <code>vehicleType</code>.
     * </p>
     *
     * @param vehicleType a {@link java.lang.String} object
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * <p>
     * Getter for the field <code>name</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Getter for the field <code>email</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * Getter for the field <code>phone</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <p>
     * Getter for the field <code>password</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * Getter for the field <code>vehicle</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * <p>
     * Getter for the field <code>vehicleType</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void logout() {
        this.name = null;
        this.email = null;
        this.phone = null;
        this.password = null;
        this.vehicle = null;
        this.vehicleType = null;
    }

}
