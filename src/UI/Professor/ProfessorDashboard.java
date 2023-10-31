/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Professor;

import UI.Transcript.GradingJPanel;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import model.Main.EducationSystem;
import model.Professor.Professor;

/**
 *
 * @author sidvi
 */
public class ProfessorDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorDashboard
     */
    EducationSystem lc;
    public ProfessorDashboard(EducationSystem lc) {
        initComponents();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        professorjframe1 = new javax.swing.JPanel();
        btnmyinfo = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnmycourses = new javax.swing.JButton();
        btnaddcourse = new javax.swing.JButton();
        btngrandes = new javax.swing.JButton();
        txtprofessorid = new javax.swing.JTextField();
        txtprofname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        professorcardpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        professorjframe1.setBackground(new java.awt.Color(204, 204, 204));
        professorjframe1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnmyinfo.setBackground(new java.awt.Color(51, 51, 255));
        btnmyinfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmyinfo.setForeground(new java.awt.Color(255, 255, 204));
        btnmyinfo.setText("MY INFORMATION");
        btnmyinfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmyinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmyinfoActionPerformed(evt);
            }
        });
        professorjframe1.add(btnmyinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btnlogout.setBackground(new java.awt.Color(0, 0, 255));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 204));
        btnlogout.setText("LOGOUT");
        btnlogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        professorjframe1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnmycourses.setBackground(new java.awt.Color(0, 0, 255));
        btnmycourses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmycourses.setForeground(new java.awt.Color(255, 255, 204));
        btnmycourses.setText("MY COURSES");
        btnmycourses.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmycourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmycoursesActionPerformed(evt);
            }
        });
        professorjframe1.add(btnmycourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        btnaddcourse.setBackground(new java.awt.Color(0, 0, 255));
        btnaddcourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddcourse.setForeground(new java.awt.Color(255, 255, 204));
        btnaddcourse.setText("ADD COURSE");
        btnaddcourse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcourseActionPerformed(evt);
            }
        });
        professorjframe1.add(btnaddcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        btngrandes.setBackground(new java.awt.Color(51, 51, 255));
        btngrandes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btngrandes.setForeground(new java.awt.Color(255, 255, 204));
        btngrandes.setText("REVIEW GRADES");
        btngrandes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btngrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrandesActionPerformed(evt);
            }
        });
        professorjframe1.add(btngrandes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        txtprofessorid.setEditable(false);
        txtprofessorid.setBackground(new java.awt.Color(255, 255, 255));
        txtprofessorid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprofessorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprofessoridActionPerformed(evt);
            }
        });
        professorjframe1.add(txtprofessorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 30));

        txtprofname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        professorjframe1.add(txtprofname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 190, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText(":");
        professorjframe1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 20, 40));

        jSplitPane1.setTopComponent(professorjframe1);

        professorcardpanel.setBackground(new java.awt.Color(153, 204, 255));
        professorcardpanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(professorcardpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmyinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmyinfoActionPerformed
        // TODO add your handling code here:

        ProfessorDetailsJPanel personal=new ProfessorDetailsJPanel(professorcardpanel,lc);
            
        for (Professor professor : lc.ProfessorList)
        {
            int id =Integer.parseInt(txtprofessorid.getText());
            if(id==professor.getProfessorUserId())
            {
                LocalDate localDate = professor.getProfessorDateOfBirth();
                java.util.Date utilDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

                personal.txtpid.setText(String.valueOf(id));
                personal.txtpname.setText(professor.getProfessorName());
                personal.txtpusername.setText(professor.getProfessorUsername());
                personal.txtppassword.setText(professor.getProfessorPassword());
                personal.jDateChooser1.setDate(utilDate);
            }
            
        }
       
        professorcardpanel.add("ProfessorDetailsJPanel",personal);
        CardLayout cardlayout= (CardLayout) professorcardpanel.getLayout();
        cardlayout.next(professorcardpanel);
    }//GEN-LAST:event_btnmyinfoActionPerformed

    private void txtprofessoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprofessoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprofessoridActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        MainJFrame mj=new MainJFrame(lc);
        mj.setVisible(true);
        mj.show();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcourseActionPerformed
        // TODO add your handling code here:
        
         ProfessorOfferCourseJPanel personal=new ProfessorOfferCourseJPanel(professorcardpanel,lc);
         int id =Integer.parseInt(txtprofessorid.getText());
         
         personal.txtcourseprofid.setText(String.valueOf(id));
       
        
         professorcardpanel.add("ProfessorOfferCourseJPanel",personal);
         CardLayout cardlayout= (CardLayout) professorcardpanel.getLayout();
         cardlayout.next(professorcardpanel);
         
    }//GEN-LAST:event_btnaddcourseActionPerformed

    private void btnmycoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmycoursesActionPerformed
        // TODO add your handling code here:
        int id =Integer.parseInt(txtprofessorid.getText());
        ProfessorManageCoursesJPanel view=new ProfessorManageCoursesJPanel(professorcardpanel,lc);
         
        view.txtcourseprofid.setText(String.valueOf(id));
        
        professorcardpanel.add("ProfessorManageCoursesJPanel",view);
        CardLayout cardlayout= (CardLayout) professorcardpanel.getLayout();
        cardlayout.next(professorcardpanel);
        
    }//GEN-LAST:event_btnmycoursesActionPerformed

    private void btngrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrandesActionPerformed
        // TODO add your handling code here:
        GradingJPanel grade=new GradingJPanel(professorcardpanel,lc);
        int id =Integer.parseInt(txtprofessorid.getText());
        
        grade.txtcourseprofid.setText(String.valueOf(id));
        professorcardpanel.add("GradingJPanel",grade);
        CardLayout cardlayout= (CardLayout) professorcardpanel.getLayout();
        cardlayout.next(professorcardpanel);
    }//GEN-LAST:event_btngrandesActionPerformed

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
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EducationSystem existingInstance = EducationSystem.getEducationInstance();
                new ProfessorDashboard(existingInstance).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcourse;
    private javax.swing.JButton btngrandes;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmycourses;
    private javax.swing.JButton btnmyinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel professorcardpanel;
    private javax.swing.JPanel professorjframe1;
    public javax.swing.JTextField txtprofessorid;
    public javax.swing.JTextField txtprofname;
    // End of variables declaration//GEN-END:variables
}