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

import java.awt.Color;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Nirbhay Pundir
 */
public final class Utility {

    public ImageIcon imageCloseh;
    public ImageIcon imageClock;
    public ImageIcon imageClose;
    public Image iconImage;
    public ImageIcon icon;
    public Shape roundedRectangle;
    public int xMouse;
    public int yMouse;

    public Utility() {
        imageCloseh = scaleImage("closeh.png", 24);
        imageClose = scaleImage("close.png", 24);
        imageClock = scaleImage("clock.png", 26);
        icon = scaleImage("logo.png", 50);
        try {
            iconImage = ImageIO.read(Utility.class.getResource("logo.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void setCorners(JFrame frame) {
        roundedRectangle = new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 20, 20);
        frame.setShape(roundedRectangle);
    }

    public void fieldFocused(JTextField field) {
        field.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 255, 255)),
                javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
    }

    public void fieldLeave(JTextField field) {
        field.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)),
                javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
    }

    public ImageIcon scaleImage(String location, int size) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(Utility.class.getResource(location));
            int width = img.getWidth();
            int height = img.getHeight();
            int newWidth = size;
            int newHeight = size;
            if (width > height) {
                newHeight = (int) (((double) size / width) * height);
            } else {
                newWidth = (int) (((double) size / height) * width);
            }
            Image dimg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void switchFrame(JFrame f1, JFrame f2) {
        f1.setEnabled(false);
        try {
            Thread.sleep(100);
            f1.setVisible(false);
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        f2.setVisible(true);
        f2.setEnabled(true);
    }

    public void table(JTable t) {
        t.getTableHeader().setBackground(new Color(80, 200, 103));
        t.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        t.getTableHeader().setForeground(new java.awt.Color(204, 255, 255));
        t.setBackground(new Color(120, 230, 150, 180));
    }
}
