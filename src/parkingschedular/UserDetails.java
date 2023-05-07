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

/**
 * <p>
 * UserDetails class.
 * </p>
 *
 * @author Nirbhay Pundir
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
