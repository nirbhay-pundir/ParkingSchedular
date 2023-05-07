/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingschedular.utility;

import java.awt.Color;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * <p>
 * Utility class.
 * </p>
 *
 * @author Parkers
 * @version $Id: $Id
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

    /**
     * <p>
     * Constructor for Utility.
     * </p>
     */
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

    /**
     * <p>
     * setCorners.
     * </p>
     *
     * @param frame a {@link javax.swing.JFrame} object
     */
    public void setCorners(JFrame frame) {
        roundedRectangle = new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 20, 20);
        frame.setShape(roundedRectangle);
    }

    /**
     * <p>
     * fieldFocused.
     * </p>
     *
     * @param field a {@link javax.swing.JTextField} object
     */
    public void fieldFocused(JTextField field) {
        field.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 255, 255)),
                javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
    }

    /**
     * <p>
     * fieldLeave.
     * </p>
     *
     * @param field a {@link javax.swing.JTextField} object
     */
    public void fieldLeave(JTextField field) {
        field.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)),
                javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
    }

    /**
     * <p>
     * scaleImage.
     * </p>
     *
     * @param location a {@link java.lang.String} object
     * @param size     a int
     * @return a {@link javax.swing.ImageIcon} object
     */
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

    /**
     * <p>
     * switchFrame.
     * </p>
     *
     * @param f1 a {@link javax.swing.JFrame} object
     * @param f2 a {@link javax.swing.JFrame} object
     */
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

    /**
     * <p>
     * table.
     * </p>
     *
     * @param t a {@link javax.swing.JTable} object
     */
    public void table(JTable t) {
        t.getTableHeader().setBackground(new Color(80, 200, 103));
        t.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        t.getTableHeader().setForeground(new java.awt.Color(204, 255, 255));
        t.setBackground(new Color(120, 230, 150, 180));
    }
}
