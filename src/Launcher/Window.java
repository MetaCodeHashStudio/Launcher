

/**
 * @author Runnetty aka Mats Harwiss
 * @ MetaCode Studio www.metacodestudio.com
 */

package Launcher;

import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Window extends javax.swing.JFrame {

    private boolean saveLogon = false;
    private boolean updateNext = false;
    private String updText = "Checking for update...";
    public boolean CheckVersion;
    public static int barval = 0;
    public static boolean waitState = true;
    public boolean beginUpdate = false;
    public boolean doneUpdate = false;

    public Window() throws MalformedURLException, IOException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nickBox1 = new javax.swing.JTextField();
        passBox1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        bar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Start.version);
        setResizable(false);

        nickBox1.setText("Runnetty");
        nickBox1.setEnabled(false);
        nickBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickBox1ActionPerformed(evt);
            }
        });

        passBox1.setEnabled(false);

        jCheckBox1.setText("Remember me");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bar.setStringPainted(true);
        bar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                barPropertyChange(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText(updText);

        jCheckBox2.setText("Force update");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        textField.setColumns(20);
        textField.setRows(5);
        jScrollPane1.setViewportView(textField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passBox1)
                                    .addComponent(nickBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jCheckBox2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nickBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bar.getAccessibleContext().setAccessibleName("barbox");
        bar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        if (saveLogon) {
//            //Start.frame.insertText("| - Saving");
//            AppFileHandler.saveState = "true";
//            AppFileHandler.Username = nickBox1.getText();
//            char[] pass = passBox1.getPassword();
//            String passString = new String(pass);
//            AppFileHandler.Password = passString;
//            try {
//                AppFileHandler.SaveLogon();
//            } catch (URISyntaxException ex) {
//                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            AppFileHandler.saveState = "false";
//        }
        if (updateNext || !CheckVersion) {
            Start.window.beginUpdate = true;
        }
//        if (CheckVersion) {
//            insertText("\n| - STARTING UPDATE FOR LAUNCHER");
//            try {
//                Process proc = Runtime.getRuntime().exec("java -jar " + "Utill" + FileDownloader.sep + "LUD.jar");
//                Thread.sleep(1000);
//
//            } catch (IOException ex) {
//                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        if (CheckVersion) {
            insertText("\n| - LAUNCHING GAME");
            try {
                Process proc = Runtime.getRuntime().exec("java -jar " + "bin" + Files.sep + "Yahtzoid.jar");
            } catch (IOException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (!saveLogon) {
            saveLogon = true;
            System.out.println("| - SAVING LOGON");
        } else {
            saveLogon = false;
            System.out.println("| - NOT SAVING LOGON - DELETING FOR SAFETY");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    private void nickBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickBox1ActionPerformed
    }//GEN-LAST:event_nickBox1ActionPerformed
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (!updateNext) {
            updateNext = true;
            System.out.println("| - FORCE UPDATE: ENABLED");
            insertText("\n| - FORCE UPDATE: ENABLED");
            jButton1.setText("Update");
        } else {
            updateNext = false;
            System.out.println("| - FORCE UPDATE: DISABLED");
            insertText("\n| - FORCE UPDATE: DISABLED");
            jButton1.setText("Start");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    private void barPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_barPropertyChange
    }//GEN-LAST:event_barPropertyChange
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Window().setVisible(true);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nickBox1;
    private javax.swing.JPasswordField passBox1;
    private javax.swing.JTextArea textField;
    // End of variables declaration//GEN-END:variables
    public void updateWindowOnUpdateCheck() throws MalformedURLException, IOException, URISyntaxException, InterruptedException {
        CheckVersion = Update.CheckVersion();
        
        if (CheckVersion) {
            jLabel1.setForeground(Color.blue);
            jLabel1.setText("Up To date");
            jButton1.setText("Start");
            insertText("\n| - UP TO DATE");
        } else {
            jLabel1.setForeground(Color.green);
            jLabel1.setText("Update Available");
            jButton1.setText("Update");
            insertText("\n| - UPDATE AVAILABLE");
        }
    }
    public void insertText(String inText) {
        textField.append(inText);
    }
    public void updateBar(String... progress) {
        bar.setValue(Integer.parseInt(progress[0]));
    }
    public boolean getWaitState() {
        return waitState;
    }
    public void notif() {
        waitState = false;
        synchronized (this) {
            notifyAll();
        }
    }
}
