
package views;

/**
 *
 * @author ASUS
 */
public class JHomeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JHomeEmployee
     */
    public JHomeAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        tesPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        btnAccount = new javax.swing.JButton();
        btnType = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        basePanel = new javax.swing.JPanel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        tesPanel.setBackground(new java.awt.Color(255, 204, 102));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Edit User");

        lblAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lblAdmin.setText("Admin Name");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(51, 51, 51));
        lblId.setText("Id Employee");

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/download.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                profileMouseReleased(evt);
            }
        });
        profile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                profileKeyReleased(evt);
            }
        });

        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAccount.setIcon(new javax.swing.ImageIcon("D:\\Project Overtime\\icon\\cilik\\history2.png")); // NOI18N
        btnAccount.setText("Account Mgt");
        btnAccount.setToolTipText("");
        btnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccountMouseClicked(evt);
            }
        });
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnType.setIcon(new javax.swing.ImageIcon("D:\\Project Overtime\\icon\\cilik\\form2.png")); // NOI18N
        btnType.setText("Overtime Type");
        btnType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTypeMouseClicked(evt);
            }
        });

        btnEmployee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEmployee.setIcon(new javax.swing.ImageIcon("D:\\Project Overtime\\icon\\cilik\\history2.png")); // NOI18N
        btnEmployee.setText("Employee Mgt");
        btnEmployee.setToolTipText("");
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tesPanelLayout = new javax.swing.GroupLayout(tesPanel);
        tesPanel.setLayout(tesPanelLayout);
        tesPanelLayout.setHorizontalGroup(
            tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tesPanelLayout.createSequentialGroup()
                .addGroup(tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(profile)
                        .addGap(18, 18, 18)
                        .addGroup(tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(lblId)))
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tesPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton7))))
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnType))
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tesPanelLayout.setVerticalGroup(
            tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tesPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(tesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile)
                    .addGroup(tesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAdmin)
                        .addGap(7, 7, 7)
                        .addComponent(lblId)))
                .addGap(83, 83, 83)
                .addComponent(btnEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnType)
                .addGap(18, 18, 18)
                .addComponent(btnAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(30, 30, 30))
        );

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void profileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_profileKeyReleased
        
    }//GEN-LAST:event_profileKeyReleased

    private void profileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseReleased
        JIProfileForm profileForm = new JIProfileForm();
        this.basePanel.add(profileForm);
        profileForm.show();
    }//GEN-LAST:event_profileMouseReleased

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseClicked
//        String username = tx.getText()+" "+textLastName.getText();
//        String id = textEmpId.getText();
//        JIAccountForm userForm = new JIAccountForm(username, id);
//        this.basePanel.add(userForm);
//        userForm.show();
    }//GEN-LAST:event_btnAccountMouseClicked

    private void btnTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeMouseClicked
        JIOvertimeTypeForm overtimeTypeForm = new JIOvertimeTypeForm();
        this.basePanel.add(overtimeTypeForm);
        overtimeTypeForm.show();
    }//GEN-LAST:event_btnTypeMouseClicked

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked
        JIEmployeeForm employeeForm = new JIEmployeeForm();
        this.basePanel.add(employeeForm);
        employeeForm.show();
    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JHomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnType;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel tesPanel;
    // End of variables declaration//GEN-END:variables
}
