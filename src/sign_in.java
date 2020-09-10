import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class sign_in extends javax.swing.JFrame {
String imgpth=null;
    public sign_in() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        signin_textfield1 = new javax.swing.JTextField();
        Register_user = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        signin_textfield2 = new javax.swing.JTextField();
        signin_textfield6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        signin_textfield4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        signin_textfield5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        signin_textfield3 = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        img2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");
        jLabel1.setPreferredSize(new java.awt.Dimension(135, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 157, 27));

        signin_textfield1.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield1.setForeground(new java.awt.Color(253, 227, 167));
        signin_textfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_textfield1ActionPerformed(evt);
            }
        });
        jPanel2.add(signin_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 38, 149, -1));

        Register_user.setBackground(new java.awt.Color(0, 0, 0));
        Register_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Register_user.setForeground(new java.awt.Color(255, 255, 255));
        Register_user.setText("Register");
        Register_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_userActionPerformed(evt);
            }
        });
        jPanel2.add(Register_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 408, 98, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name:-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 157, 27));

        signin_textfield2.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield2.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(signin_textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 101, 149, -1));

        signin_textfield6.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield6.setForeground(new java.awt.Color(253, 227, 167));
        signin_textfield6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_textfield6ActionPerformed(evt);
            }
        });
        jPanel2.add(signin_textfield6, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 35, 149, 27));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Father's Name:-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 226, 157, 27));

        signin_textfield4.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield4.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(signin_textfield4, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 230, 149, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail Address:-");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 157, 27));

        signin_textfield5.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield5.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(signin_textfield5, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 287, 149, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 97, -1, 27));

        jComboBox1.setBackground(new java.awt.Color(108, 122, 137));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male ", "Female", "Others" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 353, 149, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mother's Name:-");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 157, 27));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender:-");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 349, 157, 27));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Username");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 34, -1, 27));

        pass2.setBackground(new java.awt.Color(108, 122, 137));
        pass2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pass2.setForeground(new java.awt.Color(253, 227, 167));
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel2.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 160, 153, 27));

        signin_textfield3.setBackground(new java.awt.Color(108, 122, 137));
        signin_textfield3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin_textfield3.setForeground(new java.awt.Color(253, 227, 167));
        signin_textfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_textfield3ActionPerformed(evt);
            }
        });
        jPanel2.add(signin_textfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 163, 147, -1));

        password1.setBackground(new java.awt.Color(108, 122, 137));
        password1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(253, 227, 167));
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        jPanel2.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 98, 151, 27));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RetypePassword");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 159, -1, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already Registered?Click here to login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 414, -1, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Image");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 220, 138, 38));

        jButton1.setText("Browse image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 336, 153, 38));

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesofproject/circle-cropped.png"))); // NOI18N
        jPanel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 140, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signin_textfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_textfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_textfield1ActionPerformed

    private void signin_textfield6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_textfield6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_textfield6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void signin_textfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_textfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signin_textfield3ActionPerformed

    private void Register_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_userActionPerformed
        if(verify()){
        Connection con=Myconnection.getConnection();
        PreparedStatement ps=null;
        
        try {
            ps=con.prepareStatement("INSERT INTO `students1`(`first_name`, `last_name`, `mother`, `father`, `email`, `uname`, `password`, `photo`,`marks`) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, signin_textfield1.getText());
            ps.setString(2, signin_textfield2.getText());
            ps.setString(3, signin_textfield3.getText());
            ps.setString(4, signin_textfield4.getText());
            ps.setString(5, signin_textfield5.getText());
            ps.setString(6, signin_textfield6.getText());
            ps.setString(7, String.valueOf(password1.getPassword())); 
            
            
               InputStream is=new FileInputStream(new File(imgpth));
               ps.setBlob(8,is);
               ps.setInt(9, 0);
                
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"Account Created");
                 email_verify lg=new email_verify();
       lg.setVisible(true);
       lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Something wrong");
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_Register_userActionPerformed

    public boolean verify(){
        if(signin_textfield1.getText().equals("") || 
                signin_textfield2.getText().equals("") ||
                    signin_textfield3.getText().equals("") ||
                        signin_textfield4.getText().equals("") ||
                            signin_textfield5.getText().equals("") ||
                                signin_textfield6.getText().equals("") ||
                                    String.valueOf(password1.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"One or more fields are empty");
            return false;            
        }
        else if(!String.valueOf(password1.getPassword()).equals(String.valueOf(pass2.getPassword()))){
            JOptionPane.showMessageDialog(null,"password does not match");
            return false;
        }
        else{
            return true;
        }
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       login_form lg=new login_form();
       lg.setVisible(true);
       lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
           Connection con;
           PreparedStatement pst;
           ResultSet rs;
           con=Myconnection.getConnection();
           JFileChooser jfc = new JFileChooser();
       
//        jc.setVisible(true);
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
 int result=      jfc.showOpenDialog(this);
       if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = jfc.getSelectedFile();
    String fname = selectedFile.getAbsolutePath();
    imgpth=fname;
   ImageIcon im=new ImageIcon(fname);
    ImageIcon imgicon=new ImageIcon(imgpth);
      Image img = imgicon.getImage().getScaledInstance(img2.getWidth(),img2.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon icon=new ImageIcon(img);
                img2.setIcon(icon);
    System.out.println("Selected file: "+fname);
    
   pst=con.prepareStatement("insert into students1(photo) values(?)");
   InputStream is=new FileInputStream(new File(fname));   
   pst.setBlob(1,is);
           pst.executeUpdate();
   
    
            
           
       }
       }catch(Exception e)
       {
           System.out.print(e);
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register_user;
    public javax.swing.JLabel img2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField pass2;
    public javax.swing.JPasswordField password1;
    public javax.swing.JTextField signin_textfield1;
    public javax.swing.JTextField signin_textfield2;
    public javax.swing.JTextField signin_textfield3;
    public javax.swing.JTextField signin_textfield4;
    public javax.swing.JTextField signin_textfield5;
    public javax.swing.JTextField signin_textfield6;
    // End of variables declaration//GEN-END:variables
}
