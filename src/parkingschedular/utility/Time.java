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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import parkingschedular.ParkingSchedular;

/**
 *
 * @author Nirbhay Pundir
 */
public class Time extends Thread {

    JLabel t;
    JLabel d;

    public void start(JLabel t, JLabel d) {
        this.t = t;
        this.d = d;
        start();
    }

    @Override
    public void run() {
        try {
            while (true) {
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
