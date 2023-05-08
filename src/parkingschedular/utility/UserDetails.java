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
package parkingschedular.utility;

/**
 *
 * @author Nirbhay Pundir
 */
public class UserDetails {

    private String name;
    private String email;
    private String phone;
    private String password;
    private String vehicle;
    private String vehicleType;

    public UserDetails(String name, String phone, String email, String password, String vehicle, int vehicleType) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.vehicle = vehicle;
        this.vehicleType = (vehicleType == 0) ? "Car" : "Motorcycle";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getVehicle() {
        return vehicle;
    }

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
