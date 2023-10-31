/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Transcript;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Main.EducationSystem;
import model.Professor.ProfessorUCourses;
import model.Professor.Professor;
import Model.Student.StudentUCourses;
import Model.Student.Student;

/**
 *
 * @author sidvi
 */
public class GradingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradingJPanel
     */
    private JPanel professorcardpanel;
    private EducationSystem lc;
    
    public GradingJPanel(JPanel professorcardpanel, EducationSystem lc) {
        initComponents();
        
        this.professorcardpanel=professorcardpanel;
        this.lc=lc;
        
        
        
        txtcourseprofid.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcourse = new javax.swing.JTable();
        txtsearchcourse = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsearchstudent = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnshowstudents = new javax.swing.JButton();
        txtcourseprofid = new javax.swing.JTextField();
        btnviewcourse = new javax.swing.JButton();
        btnsavestudent = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblstudent.setBackground(new java.awt.Color(204, 204, 204));
        tblstudent.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT NAME", "STUDENT ID", "STUDENT GRADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblstudent);
        if (tblstudent.getColumnModel().getColumnCount() > 0) {
            tblstudent.getColumnModel().getColumn(0).setResizable(false);
            tblstudent.getColumnModel().getColumn(1).setResizable(false);
            tblstudent.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 502, 770, 200));

        tblcourse.setBackground(new java.awt.Color(204, 204, 204));
        tblcourse.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        tblcourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE NAME", "COURSE ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcourse);
        if (tblcourse.getColumnModel().getColumnCount() > 0) {
            tblcourse.getColumnModel().getColumn(0).setResizable(false);
            tblcourse.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 750, 190));

        txtsearchcourse.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtsearchcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchcourseActionPerformed(evt);
            }
        });
        txtsearchcourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchcourseKeyReleased(evt);
            }
        });
        add(txtsearchcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 130, 30));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel10.setText(" SEARCH  COURSE");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        txtsearchstudent.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtsearchstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchstudentActionPerformed(evt);
            }
        });
        txtsearchstudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchstudentKeyReleased(evt);
            }
        });
        add(txtsearchstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 130, 30));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel11.setText(" SEARCH  STUDENT");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        btnshowstudents.setBackground(new java.awt.Color(255, 255, 102));
        btnshowstudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnshowstudents.setText("SHOW REGISTERED STUDENTS");
        btnshowstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowstudentsActionPerformed(evt);
            }
        });
        add(btnshowstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, 29));

        txtcourseprofid.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        txtcourseprofid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcourseprofidActionPerformed(evt);
            }
        });
        add(txtcourseprofid, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 82, 32));

        btnviewcourse.setBackground(new java.awt.Color(255, 255, 102));
        btnviewcourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnviewcourse.setText("VIEW COURSES");
        btnviewcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewcourseActionPerformed(evt);
            }
        });
        add(btnviewcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        btnsavestudent.setBackground(new java.awt.Color(255, 255, 102));
        btnsavestudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsavestudent.setText("SAVE");
        btnsavestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavestudentActionPerformed(evt);
            }
        });
        add(btnsavestudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 720, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchcourseActionPerformed

    private void txtsearchcourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchcourseKeyReleased

        DefaultTableModel obj=(DefaultTableModel) tblcourse.getModel();
        TableRowSorter< DefaultTableModel> obj1= new TableRowSorter<>(obj);
        tblcourse.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(txtsearchcourse.getText()));
    }//GEN-LAST:event_txtsearchcourseKeyReleased

    private void txtsearchstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchstudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchstudentActionPerformed

    private void txtsearchstudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchstudentKeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj=(DefaultTableModel) tblstudent.getModel();
        TableRowSorter< DefaultTableModel> obj1= new TableRowSorter<>(obj);
        tblstudent.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(txtsearchcourse.getText()));
    }//GEN-LAST:event_txtsearchstudentKeyReleased

    private void btnshowstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowstudentsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblcourse.getSelectedRow();
        
         if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a course to view students.");
            return;
         }
         Object cellValue = tblcourse.getValueAt(selectedRow, 1);
         
         if (cellValue instanceof Integer)
         {
             int courseID =(Integer)cellValue;
             ProfessorUCourses selectedCourse = null;
             
             for (ProfessorUCourses course : lc.ProfessorUCourseslist) 
             {
                if (course.getPCourseId() == courseID) 
                {
                    selectedCourse = course;
                    break;
                }
            }
             if (selectedCourse != null) 
             {
                 populatestudenttable(selectedCourse); 
             }
         }
    }//GEN-LAST:event_btnshowstudentsActionPerformed

    private void txtcourseprofidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseprofidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcourseprofidActionPerformed

    private void btnviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewcourseActionPerformed
        // TODO add your handling code here:
        populatecoursetable();
    }//GEN-LAST:event_btnviewcourseActionPerformed

    private void btnsavestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavestudentActionPerformed
        // TODO add your handling code here:
            int selectedCourseRow = tblcourse.getSelectedRow();
            int selectedStudentRow = tblstudent.getSelectedRow();
            
            if (selectedCourseRow == -1) 
            {
                JOptionPane.showMessageDialog(this, "Please select a course.");
                return;
            }
            
            if (selectedStudentRow == -1) 
            {
                JOptionPane.showMessageDialog(this, "Please select a student to save grade.");
                return;
            }
    
         int courseId = (int) tblcourse.getValueAt(selectedCourseRow, 1);
         int studentId = (int) tblstudent.getValueAt(selectedStudentRow, 1);
         String editedGrade = (String) tblstudent.getValueAt(selectedStudentRow, 2);
         
         StudentUCourses selectedStudentCourse = null;
         for (Student student : lc.SudentList) 
         {
             if(studentId==student.getStudentUserId())
             {
                 String name=student.getStudentName();
                for (StudentUCourses studentCourse : lc.StudentsUCourseslist) 
                {
                    if(studentCourse.getCStudentName().equals(name) && courseId==studentCourse.getSCourseId() )
                    {
                        selectedStudentCourse = studentCourse;
                        break;
                    }
                }
             }
         }
         if (selectedStudentCourse != null) 
         {
             selectedStudentCourse.setSCourseGrade(editedGrade);
             JOptionPane.showMessageDialog(this, "Grade saved successfully.");
             return;
         }
        
    }//GEN-LAST:event_btnsavestudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsavestudent;
    private javax.swing.JButton btnshowstudents;
    private javax.swing.JButton btnviewcourse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblcourse;
    private javax.swing.JTable tblstudent;
    public javax.swing.JTextField txtcourseprofid;
    private javax.swing.JTextField txtsearchcourse;
    private javax.swing.JTextField txtsearchstudent;
    // End of variables declaration//GEN-END:variables

    private void populatecoursetable() {
        DefaultTableModel model=(DefaultTableModel) tblcourse.getModel(); //type casting tablemodel to defaulttablemodel for jtable
        model.setRowCount(0); //deleting empty records
        
        int id=Integer.parseInt(txtcourseprofid.getText());
        for(Professor p: lc.ProfessorList)
        {
            if (id==p.getProfessorUserId())
            {
                String name=p.getProfessorName();
                for(ProfessorUCourses pc : lc.getProfessorUCourseslist())
                {
                    if(name.equals(pc.getCProfessorName()))
                    {
                        Object[] row=new Object[2];
                        row[0]=pc; 
                        row[1]=pc.getPCourseId();
                        
                        model.addRow(row);
                    }
                }
            }
        }
    }

    private void populatestudenttable(ProfessorUCourses selectedCourse) {
        DefaultTableModel model=(DefaultTableModel) tblstudent.getModel(); //type casting tablemodel to defaulttablemodel for jtable
        model.setRowCount(0); //deleting empty records
        
         int selectedCourseId = selectedCourse.getPCourseId();
         
         for (StudentUCourses sc : lc.getStudentsUCourseslist()) 
         {
             if (sc.getSCourseId() == selectedCourseId) 
             {
                 String studentName = sc.getCStudentName();
                 int studentId = 0;
                 
                 for (Student s : lc.getSudentList()) 
                 {
                     if (s.getStudentName().equals(studentName)) 
                     {
                         studentId = s.getStudentUserId();
                         break;
                     }
                 }
                 
                 Object[] row = new Object[3];
                 row[0] = sc;
                 row[1] = studentId;
                 row[2] = sc.getSCourseGrade(); // editable column
                 model.addRow(row);
             }
         }
    }
}
