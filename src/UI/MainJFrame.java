/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.Student.StudentDashboard;
import UI.Professor.ProfessorDashboard;
import java.awt.CardLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import model.Main.EducationSystem;
import model.Professor.Professor;
import Model.Student.Student;

/**
 *
 * @author sidvi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    EducationSystem lc;
    

    public MainJFrame(EducationSystem lc) {
        initComponents();
        this.lc= lc;
        
        for (Professor professor : lc.ProfessorList) {
            System.out.println("PROFESSOR LIST");
            System.out.println("Professor ID: " + professor.getProfessorUserId());
            System.out.println("Professor Name: " + professor.getProfessorName());
            System.out.println("Professor Username: " + professor.getProfessorUsername());
            System.out.println("Professor Password: " + professor.getProfessorPassword());
            System.out.println("Professor DOB: " + professor.getProfessorDateOfBirth());
            System.out.println("Professor ROLE: " + professor.getProfessorRole());
            System.out.println("\n");
        }
        
        for (Student student : lc.SudentList) {
            System.out.println("STUDENT LIST");
            System.out.println("Student ID: " + student.getStudentUserId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Username: " + student.getStudentUsername());
            System.out.println("Student Password: " + student.getStudentPassword());
            System.out.println("Student DOB: " + student.getStudentDateOfBirth());
            System.out.println("Student ROLE: " + student.getStudentRole());
            System.out.println("\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        welcomepanel = new javax.swing.JPanel();
        lblusername1 = new javax.swing.JLabel();
        lblpassword2 = new javax.swing.JLabel();
        lblloginas = new javax.swing.JLabel();
        txtlpassword = new javax.swing.JPasswordField();
        txtlusername = new javax.swing.JTextField();
        txtloginas = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnsignup = new javax.swing.JButton();
        cardpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomepanel.setBackground(new java.awt.Color(153, 204, 255));
        welcomepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        welcomepanel.setMinimumSize(new java.awt.Dimension(300, 700));
        welcomepanel.setPreferredSize(new java.awt.Dimension(300, 700));
        welcomepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusername1.setBackground(new java.awt.Color(0, 0, 0));
        lblusername1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblusername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername1.setText("USERNAME:");
        welcomepanel.add(lblusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        lblpassword2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpassword2.setText("PASSWORD:");
        welcomepanel.add(lblpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        lblloginas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblloginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblloginas.setText("ROLE:");
        welcomepanel.add(lblloginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, -1));

        txtlpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtlpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlpasswordtxtpasswordActionPerformed(evt);
            }
        });
        welcomepanel.add(txtlpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 196, 166, -1));

        txtlusername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtlusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlusernametxtusernameActionPerformed(evt);
            }
        });
        txtlusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlusernametxtusernameKeyPressed(evt);
            }
        });
        welcomepanel.add(txtlusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 117, 166, -1));

        txtloginas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtloginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginastxtloginasActionPerformed(evt);
            }
        });
        welcomepanel.add(txtloginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, -1));

        btnlogin.setBackground(new java.awt.Color(51, 51, 255));
        btnlogin.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 204));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginbtnloginActionPerformed(evt);
            }
        });
        welcomepanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 100, -1));

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2jCheckBox1ActionPerformed(evt);
            }
        });
        welcomepanel.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "PROFESSOR", "STUDENT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2jComboBox1ActionPerformed(evt);
            }
        });
        welcomepanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        btnsignup.setBackground(new java.awt.Color(51, 51, 255));
        btnsignup.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 204));
        btnsignup.setText("SIGNUP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupbtnsignupActionPerformed(evt);
            }
        });
        welcomepanel.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        jSplitPane1.setLeftComponent(welcomepanel);

        cardpanel.setBackground(new java.awt.Color(204, 204, 204));
        cardpanel.setPreferredSize(new java.awt.Dimension(400, 700));
        cardpanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(cardpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlpasswordtxtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlpasswordtxtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlpasswordtxtpasswordActionPerformed

    private void txtlusernametxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlusernametxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlusernametxtusernameActionPerformed

    private void txtlusernametxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlusernametxtusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlusernametxtusernameKeyPressed

    private void btnloginbtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginbtnloginActionPerformed
        // TODO add your handling code here:

        String enteredUsername = txtlusername.getText(); // Get the entered username
        char[] enteredPasswordChars = txtlpassword.getPassword(); // Get the entered password as a char array
        String enteredPassword = new String(enteredPasswordChars); // Convert char array to string
        String loginas= txtloginas.getText();
        System.out.println("\n");
        System.out.println("username : " + enteredUsername);
        System.out.println("password entered : " + enteredPassword);
        System.out.println("\n");
       
        // Hash the entered password
        String hashedEnteredPassword = PasswordHasher.hashPassword(enteredPassword);
        System.out.println("entered hashed: " + hashedEnteredPassword);
        

         // Hash the reference password "adminpass"
         String referenceaPassword = "adminpass"; // "\"adminpass\"" for quotes to be considered
         String hashedReferenceaPassword = PasswordHasher.hashPassword(referenceaPassword);
         
        if ("ADMIN".equals(loginas) && "admin".equals(enteredUsername) && hashedEnteredPassword != null && hashedEnteredPassword.equals(hashedReferenceaPassword))
         {
             
             JOptionPane.showMessageDialog(this, "Logged in as ADMIN!");
             //PersonJFrame pj=new PersonJFrame(pc);
             //pj.setVisible(true);
             return;
         } 

       
        if (enteredUsername.isEmpty() || enteredPassword.isEmpty() || loginas.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please fill in all details.");
            return;
        }
        if ("PROFESSOR".equals(loginas)) 
        {
            boolean professorfound = false;
            for (Professor professor : lc.ProfessorList) 
            {
                
                if (enteredUsername.equals(professor.getProfessorUsername())) 
                {
                    int id = professor.getProfessorUserId();
                    String name=professor.getProfessorName();
                    String referencePassword = professor.getProfessorPassword();
                    System.out.println("ReferencePassword in professor: " + referencePassword);
                    
                    String hashedReferencePassword = PasswordHasher.hashPassword(referencePassword);
                    System.out.println("hashedReferencePassword in professor: " + hashedReferencePassword);
            
                    if (hashedEnteredPassword.equals(hashedReferencePassword)) 
                    {
                        JOptionPane.showMessageDialog(this, "Login Successful!");
                        txtlusername.setText("");
                        txtlpassword.setText("");
                        txtloginas.setText("");
                        ProfessorDashboard pj = new ProfessorDashboard(lc);
                        pj.txtprofessorid.setText(String.valueOf(id));
                        pj.txtprofname.setText(name);
                        pj.setVisible(true);
                        pj.show();
                        return;
                    } 
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Password Incorrect for Role Professor");
                        return;
                    }
                }
            }
            if (!professorfound) //after checking all in list 
            {
                JOptionPane.showMessageDialog(this, "Inavlid Credentials");
                return;
            }
        }
        
        else 
        {
            boolean studentfound = false;
            for (Student student : lc.SudentList) 
            {
                if (enteredUsername.equals(student.getStudentUsername())) 
                {
                    int id = student.getStudentUserId();
                    String name=student.getStudentName();
                    String referencePassword = student.getStudentPassword();
                    System.out.println("ReferencePassword in student: " + referencePassword);
                    
                    String hashedReferencePassword = PasswordHasher.hashPassword(referencePassword);
                    System.out.println("hashedReferencePassword in student: " + hashedReferencePassword);
            
                    if (hashedEnteredPassword.equals(hashedReferencePassword)) 
                    {
                        JOptionPane.showMessageDialog(this, "Login Successful!");
                        txtlusername.setText("");
                        txtlpassword.setText("");
                        txtloginas.setText("");
                        StudentDashboard sj = new StudentDashboard(lc);
                        sj.txtstudentid.setText(String.valueOf(id));
                        sj.txtstudentname.setText(name);
                        sj.setVisible(true);
                        sj.show();
                        return;
                    } 
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Password Incorrect for Role Student");
                        return;
                    }
                }
            }
            if (!studentfound) //after checking all in list 
            {
                JOptionPane.showMessageDialog(this, "Invalid Crdentials");
                return;
            }
        }
    }//GEN-LAST:event_btnloginbtnloginActionPerformed

    private void jCheckBox2jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()){
            txtlpassword.setEchoChar((char)0);
        }
        else{
            txtlpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2jCheckBox1ActionPerformed

    private void jComboBox2jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedvalue=jComboBox2.getSelectedItem().toString();
        txtloginas.setText(selectedvalue);
    }//GEN-LAST:event_jComboBox2jComboBox1ActionPerformed

    private void txtloginastxtloginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginastxtloginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginastxtloginasActionPerformed

    private void btnsignupbtnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupbtnsignupActionPerformed
        // TODO add your handling code here:
        SignUpJPanel signup=new SignUpJPanel(cardpanel,lc);
        cardpanel.add("SignupJPanel",signup);
        CardLayout cardlayout= (CardLayout) cardpanel.getLayout();
        cardlayout.next(cardpanel);
    }//GEN-LAST:event_btnsignupbtnsignupActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EducationSystem existingInstance = EducationSystem.getEducationInstance();
                new MainJFrame(existingInstance).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnlogin;
    public javax.swing.JButton btnsignup;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblloginas;
    private javax.swing.JLabel lblpassword2;
    private javax.swing.JLabel lblusername1;
    public javax.swing.JTextField txtloginas;
    public javax.swing.JPasswordField txtlpassword;
    public javax.swing.JTextField txtlusername;
    public javax.swing.JPanel welcomepanel;
    // End of variables declaration//GEN-END:variables

    public class PasswordHasher {
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); //Secure Hash Algorithm 256-bit
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder stringBuilder = new StringBuilder();
            
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }

            return stringBuilder.toString();
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    } 
}
}