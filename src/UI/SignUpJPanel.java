/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Main.EducationSystem;
import model.Professor.Professor;
import Model.Student.Student;
import UI.MainJFrame.PasswordHasher;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author sidvi
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    
    private JPanel cardpanel;
    private EducationSystem lc;
  
    public SignUpJPanel(JPanel cardpanel, EducationSystem lc) {
        initComponents();
        
        this.cardpanel=cardpanel;
        this.lc=lc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusername = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblsignup = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        lblidnumber = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtsignupas = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnsingup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusername.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername.setText("USERNAME:");
        add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, 29));

        lblname.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("NAME:");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 150, 29));

        lblpassword.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpassword.setText("PASSWORD:");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 201, 29));

        lblsignup.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblsignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignup.setText("ROLE:");
        add(lblsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 201, 29));

        lbldob.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lbldob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldob.setText("DATE OF BIRTH:");
        add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 201, 29));

        lblidnumber.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblidnumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidnumber.setText("USER ID:");
        add(lblidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 201, 29));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtxtusernameActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidtxtusernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 201, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnametxtusernameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnametxtusernameKeyPressed(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 123, 201, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordtxtusernameActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordtxtusernameKeyPressed(evt);
            }
        });
        add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 201, -1));

        txtusername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernametxtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernametxtusernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusernameKeyTyped(evt);
            }
        });
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 201, -1));

        txtsignupas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsignupas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsignupastxtusernameActionPerformed(evt);
            }
        });
        txtsignupas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsignupastxtusernameKeyPressed(evt);
            }
        });
        add(txtsignupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 201, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESSOR", "STUDENT" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 150, 30));

        btnsingup.setBackground(new java.awt.Color(51, 51, 255));
        btnsingup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsingup.setForeground(new java.awt.Color(255, 255, 255));
        btnsingup.setText("SIGN UP");
        btnsingup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsingupActionPerformed(evt);
            }
        });
        add(btnsingup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION PAGE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 30, 930, -1));

        jDateChooser2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser2KeyTyped(evt);
            }
        });
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 201, 34));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 123, 34, 29));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 34, 29));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedvalue=jComboBox2.getSelectedItem().toString();
        txtsignupas.setText(selectedvalue);
    }//GEN-LAST:event_jComboBox2jComboBox1ActionPerformed

    private void txtnametxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnametxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnametxtusernameActionPerformed

    private void txtnametxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnametxtusernameKeyPressed
        // TODO add your handling code here:
       char c = evt.getKeyChar();
       if (Character.isDigit(c)) {
           ImageIcon icon = new ImageIcon("C:\\Users\\vaish\\OneDrive\\Pictures\\cancel.png");
           jLabel2.setIcon(icon);
       } else {
           jLabel2.setIcon(null);
       }
    }//GEN-LAST:event_txtnametxtusernameKeyPressed

    private void txtpasswordtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordtxtusernameActionPerformed

    private void txtpasswordtxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordtxtusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordtxtusernameKeyPressed

    private void txtusernametxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernametxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernametxtusernameActionPerformed

    private void txtusernametxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernametxtusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernametxtusernameKeyPressed

    private void txtsignupastxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsignupastxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsignupastxtusernameActionPerformed

    private void txtsignupastxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsignupastxtusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsignupastxtusernameKeyPressed

    private void btnsingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsingupActionPerformed
        // TODO add your handling code here:
    
    String id1=txtid.getText();
    String name = txtname.getText();
    String username = txtusername.getText();
    String password = txtpassword.getText();
    String signupas = txtsignupas.getText();

    String hashedEnteredPassword = PasswordHasher.hashPassword(password);
    System.out.println("entered hashed: " + hashedEnteredPassword);

    Date selecteddate = jDateChooser2.getDate();
    System.out.println("Selected date: " + selecteddate);


    if (id1.isEmpty() || name.isEmpty() || username.isEmpty() || password.isEmpty() || signupas.isEmpty() || selecteddate == null)
    {
        JOptionPane.showMessageDialog(this, "Please fill in all details.");
        return;
    }
    
    if (id1.matches(".*[^0-9\\s].*")) {
        JOptionPane.showMessageDialog(this, "ID can only contain numbers");
        txtid.setText("");
        return;
        }
        
    if (name.matches(".*[^a-zA-Z\\s].*")) {
        JOptionPane.showMessageDialog(this, "Name can only contain alphabets");
        txtname.setText("");
        return;
        }
        
    int id= Integer.parseInt(txtid.getText());
    
    if (!isPasswordValid(password)) {
        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long,contain at least 1 uppercase letter, 1 lowercase letter and 1 digit");
        txtpassword.setText("");
        return;
    } 
    
    if (!(id >= 100 && id <= 999))
    {
        JOptionPane.showMessageDialog(this, "ID must be a 3-digit number");
        return;
    }
    
    LocalDate dob = selecteddate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dobasstring = dob.format(formatter);
    
    LocalDate currentDate = LocalDate.now();

    Period agePeriod = Period.between(dob, currentDate);
    int age = agePeriod.getYears();
   
    System.out.println("age: " + age);

    if ("STUDENT".equals(signupas) && age < 18) 
    {
        JOptionPane.showMessageDialog(this, "Need to be 18 or above to register as Student");
        jDateChooser2.setDate(null);
        return;
    }
    
    if ("PROFESSOR".equals(signupas) && age < 25) 
    {
        JOptionPane.showMessageDialog(this, "Need to be 25 or above to register as Professor");
        jDateChooser2.setDate(null);
        return;
    }

    boolean usernameExists = false;

    for (Professor professor : lc.ProfessorList) 
        {
            if (username.equals(professor.getProfessorUsername())) 
            {
            usernameExists = true;
            break;
            }
        }
    if (usernameExists) 
    {
        JOptionPane.showMessageDialog(this, "USERNAME TAKEN");
        txtusername.setText("");
        return;
    }
    
    for (Student student : lc.SudentList)
        {
            if (username.equals(student.getStudentUsername())) 
            {
                usernameExists = true;
                break;
            }
        }
    
    if (usernameExists) 
    {
        JOptionPane.showMessageDialog(this, "USERNAME TAKEN");
        txtusername.setText("");
        return;
    }
    
    boolean idExists = false;

    for (Professor professor : lc.ProfessorList) 
    {
        if (professor.getProfessorUserId() == id) 
        {
            idExists = true;
            break; 
        }
    }
    
    if (idExists) 
    {
        JOptionPane.showMessageDialog(this, "ID TAKEN");
        txtid.setText("");
        return;
    }
    
    for (Student student : lc.SudentList) 
    {
        if (student.getStudentUserId() == id) {
            idExists = true;
            break; 
        }
    }
	
   if (idExists)
   {
       JOptionPane.showMessageDialog(this, "ID TAKEN");
       txtid.setText("");
   }

    if ("PROFESSOR".equals(signupas)) 
    {
        Professor pc = lc.AddProfessor();
        
        pc.setProfessorUserId(id);
        pc.setProfessorName(name);
        pc.setProfessorUsername(username);
        pc.setProfessorPassword(password);
        pc.setProfessorDateOfBirth(dob);
        pc.setProfessorRole(signupas);

        JOptionPane.showMessageDialog(this, "Professor account created");
        
        for (Professor professor : lc.ProfessorList) {
            System.out.println("NEW PROFESSOR");
            System.out.println("Professor ID: " + professor.getProfessorUserId());
            System.out.println("Professor Name: " + professor.getProfessorName());
            System.out.println("Professor Username: " + professor.getProfessorUsername());
            System.out.println("Professor Password: " + professor.getProfessorPassword());
            System.out.println("Professor DOB: " + professor.getProfessorDateOfBirth());
            System.out.println("Professor ROLE: " + professor.getProfessorRole());
            System.out.println("\n");
        }

        JOptionPane.showMessageDialog(this, "Login with NEW credentials");
        cardpanel.remove(this);
        CardLayout layout = (CardLayout) cardpanel.getLayout();
        layout.previous(cardpanel);
        return;
    } 
    if ("STUDENT".equals(signupas)) 
    {
        Student sc = lc.AddStudent();
        
        sc.setStudentUserId(id);
        sc.setStudentName(name);
        sc.setStudentUsername(username);
        sc.setStudentPassword(password);
        sc.setStudentDateOfBirth(dob);
        sc.setStudentRole(signupas);

        JOptionPane.showMessageDialog(this, "Student account created");
        for (Student student : lc.SudentList) {
            System.out.println("NEW STUDENT");
            System.out.println("Student ID: " + student.getStudentUserId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Username: " + student.getStudentUsername());
            System.out.println("Student Password: " + student.getStudentPassword());
            System.out.println("Student DOB: " + student.getStudentDateOfBirth());
            System.out.println("Student ROLE: " + student.getStudentRole());
            System.out.println("\n");
        }
        JOptionPane.showMessageDialog(this, "Login with NEW credentials");
        cardpanel.remove(this);
        CardLayout layout = (CardLayout) cardpanel.getLayout();
        layout.previous(cardpanel);
        return;
    }
    
    }//GEN-LAST:event_btnsingupActionPerformed

    private void txtusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtusernameKeyTyped

    private void jDateChooser2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser2KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDateChooser2KeyTyped

    private void txtidtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtxtusernameActionPerformed

    private void txtidtxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidtxtusernameKeyPressed
        // TODO add your handling code here:
       char c = evt.getKeyChar();
       if (!Character.isDigit(c)&& c != '\b') {
           ImageIcon icon = new ImageIcon("C:\\Users\\vaish\\OneDrive\\Pictures\\cancel.png");
           jLabel4.setIcon(icon);
       } else {
           jLabel4.setIcon(null);
       }
    }//GEN-LAST:event_txtidtxtusernameKeyPressed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsingup;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblidnumber;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JLabel lblusername;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtpassword;
    public javax.swing.JTextField txtsignupas;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
public boolean isPasswordValid(String password) {
    if (password.length() >= 8 && 
        password.matches(".*[A-Z].*") && 
        password.matches(".*[a-z].*") && 
        password.matches(".*\\d.*")) {
        return true;
    }
    return false;
}
}
