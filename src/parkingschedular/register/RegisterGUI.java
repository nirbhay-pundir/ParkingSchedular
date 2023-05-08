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
package parkingschedular.register;

import parkingschedular.ParkingSchedular;
import parkingschedular.utility.Utility;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Nirbhay Pundir
 */
public class RegisterGUI extends javax.swing.JFrame {

    Utility u;

    public RegisterGUI() {
        u = new Utility();
        initComponents();
        u.setCorners(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehicleTypeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel() {
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gp = new GradientPaint(0, getHeight(),
                    getBackground().brighter().brighter(), 0, 0,
                    getBackground().darker());
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight()); 

            }
        };
        btnClose = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phoneText = new javax.swing.JFormattedTextField();
        email = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        vehicle = new javax.swing.JLabel();
        vehicleText = new javax.swing.JTextField();
        vehicleType = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        carRadio = new parkingschedular.utility.RadioButtonCustom();
        motorcycleRadio = new parkingschedular.utility.RadioButtonCustom();
        registerBtn = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(u.iconImage);
        setMinimumSize(new java.awt.Dimension(810, 440));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 252, 52));
        jPanel1.setMaximumSize(new java.awt.Dimension(810, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(810, 440));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExit(evt);
            }
        });

        tittle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        tittle.setForeground(new java.awt.Color(204, 255, 255));
        tittle.setIcon(u.icon);
        tittle.setText("Parking Schedular");

        jPanel2.setBackground(new Color(0,0,0,60));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 221, 225), 2), "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 36), new java.awt.Color(204, 255, 255))); // NOI18N

        name.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(217, 255, 252));
        name.setText("Name:");

        nameText.setBackground(new java.awt.Color(100, 221, 143));
        nameText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        nameText.setCaretColor(new java.awt.Color(204, 255, 255));
        nameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFocusLost(evt);
            }
        });

        phone.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(217, 255, 252));
        phone.setText("Phone: (+91)");

        phoneText.setBackground(nameText.getBackground());
        phoneText.setBorder(nameText.getBorder());
        phoneText.setForeground(new java.awt.Color(255, 255, 255));
        phoneText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        phoneText.setCaretColor(new java.awt.Color(204, 255, 255));
        phoneText.setFont(nameText.getFont());
        phoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFocusLost(evt);
            }
        });

        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        email.setForeground(new java.awt.Color(217, 255, 252));
        email.setText("Email:");

        emailText.setBackground(new java.awt.Color(100, 221, 143));
        emailText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        emailText.setCaretColor(new java.awt.Color(204, 255, 255));
        emailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFocusLost(evt);
            }
        });

        pass.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(217, 255, 252));
        pass.setText("Password:");

        passText.setBackground(new java.awt.Color(100, 221, 143));
        passText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        passText.setForeground(new java.awt.Color(102, 102, 102));
        passText.setBorder(emailText.getBorder());
        passText.setCaretColor(new java.awt.Color(204, 255, 255));
        passText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTextFocusLost(evt);
            }
        });

        vehicle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        vehicle.setForeground(new java.awt.Color(217, 255, 252));
        vehicle.setText("Vehicle Number:");

        vehicleText.setBackground(new java.awt.Color(100, 221, 143));
        vehicleText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        vehicleText.setForeground(new java.awt.Color(255, 255, 255));
        vehicleText.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        vehicleText.setCaretColor(new java.awt.Color(204, 255, 255));
        vehicleText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicleTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vehicleTextFocusLost(evt);
            }
        });

        vehicleType.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        vehicleType.setForeground(new java.awt.Color(217, 255, 252));
        vehicleType.setText("Vehicle Type:");

        jPanel3.setBackground(emailText.getBackground());

        carRadio.setBackground(new java.awt.Color(100, 221, 143));
        carRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vehicleTypeGroup.add(carRadio);
        carRadio.setForeground(new java.awt.Color(255, 255, 255));
        carRadio.setSelected(true);
        carRadio.setText("Car");
        carRadio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        carRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carRadioActionPerformed(evt);
            }
        });

        motorcycleRadio.setBackground(new java.awt.Color(100, 221, 143));
        motorcycleRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vehicleTypeGroup.add(motorcycleRadio);
        motorcycleRadio.setForeground(new java.awt.Color(255, 255, 255));
        motorcycleRadio.setText("Motorcycle");
        motorcycleRadio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(carRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(motorcycleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorcycleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        registerBtn.setBackground(ParkingSchedular.buttonColor);
        registerBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(204, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setBorder(null);
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnMouseExited(evt);
            }
        });

        login.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Back to Login!");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(phone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vehicle)
                                    .addComponent(vehicleType, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vehicleText)
                                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(email)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicleText)
                    .addComponent(vehicle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleType, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tittle)
                        .addGap(206, 206, 206)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose))
                    .addComponent(tittle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnClose.setIcon(u.imageClose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_carRadioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_carRadioActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }// GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setIcon(u.imageCloseh);
    }// GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExit(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCloseMouseExit
        btnClose.setIcon(u.imageClose);
    }// GEN-LAST:event_btnCloseMouseExit

    private void passTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_passTextFocusGained
        u.fieldFocused(passText);
    }// GEN-LAST:event_passTextFocusGained

    private void passTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_passTextFocusLost
        u.fieldLeave(passText);
    }// GEN-LAST:event_passTextFocusLost

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginMouseClicked
        u.switchFrame(this, ParkingSchedular.lg);
    }// GEN-LAST:event_loginMouseClicked

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerBtnMouseClicked
        registerBtn.setBackground(new Color(204, 204, 204));
        if (nameText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out your name.");
        } else if (phoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out phone number.");
        } else if (emailText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out email address.");
        } else if (passText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out password.");
        } else if (vehicleText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out vehicle number.");
        } else {
            int vehicleType = 0;
            if (motorcycleRadio.isSelected()) {
                vehicleType = 1;
            }
            int result = ParkingSchedular.server.register(nameText.getText(), phoneText.getText(), emailText.getText(),
                    passText.getText(),
                    vehicleText.getText(), vehicleType);
            if (result == -1) {
                JOptionPane.showMessageDialog(this, "Failed to establish connection with server!", "Connection Failed", ERROR_MESSAGE);
            } else if (result == 0) {
                JOptionPane.showMessageDialog(this, "User alredy exist");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Welcome, " + nameText.getText() + " your account is sucessfully created");
                u.switchFrame(this, ParkingSchedular.lg);
            }
        }
    }// GEN-LAST:event_registerBtnMouseClicked

    private void registerBtnMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerBtnMouseEntered
        if (registerBtn.isEnabled()) {
            registerBtn.setBackground(ParkingSchedular.enterButtonColor);
        }
    }// GEN-LAST:event_registerBtnMouseEntered

    private void registerBtnMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerBtnMouseExited
        if (registerBtn.isEnabled()) {
            registerBtn.setBackground(ParkingSchedular.buttonColor);
        }
    }// GEN-LAST:event_registerBtnMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - u.xMouse, y - u.yMouse);
    }// GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MousePressed
        u.xMouse = evt.getX();
        u.yMouse = evt.getY();
    }// GEN-LAST:event_jPanel1MousePressed

    private void vehicleTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_vehicleTextFocusGained
        u.fieldFocused(vehicleText);
    }// GEN-LAST:event_vehicleTextFocusGained

    private void vehicleTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_vehicleTextFocusLost
        u.fieldLeave(vehicleText);
    }// GEN-LAST:event_vehicleTextFocusLost

    private void nameTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_nameTextFocusGained
        u.fieldFocused(nameText);
    }// GEN-LAST:event_nameTextFocusGained

    private void nameTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_nameTextFocusLost
        u.fieldLeave(nameText);
    }// GEN-LAST:event_nameTextFocusLost

    private void emailTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_emailTextFocusGained
        u.fieldFocused(emailText);
    }// GEN-LAST:event_emailTextFocusGained

    private void emailTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_emailTextFocusLost
        u.fieldLeave(emailText);
    }// GEN-LAST:event_emailTextFocusLost

    private void phoneTextFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_phoneTextFocusGained
        u.fieldFocused(phoneText);
    }// GEN-LAST:event_phoneTextFocusGained

    private void phoneTextFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_phoneTextFocusLost
        u.fieldLeave(phoneText);
    }// GEN-LAST:event_phoneTextFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private parkingschedular.utility.RadioButtonCustom carRadio;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private parkingschedular.utility.RadioButtonCustom motorcycleRadio;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel phone;
    private javax.swing.JFormattedTextField phoneText;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel vehicle;
    private javax.swing.JTextField vehicleText;
    private javax.swing.JLabel vehicleType;
    private javax.swing.ButtonGroup vehicleTypeGroup;
    // End of variables declaration//GEN-END:variables
}
