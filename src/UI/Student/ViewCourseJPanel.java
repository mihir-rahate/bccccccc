/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Student;

import UI.Student.StudentDashboard;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Main.EducationSystem;
import model.Professor.ProfessorUCourses;
import model.Rating.Rating;
import Model.Student.StudentUCourses;
import Model.Student.Student;

/**
 *
 * @author riyasingh
 */
public class ViewCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCourseJPanel
     */
    
    private JPanel studentcardpanel;
    private EducationSystem lc;
    
    
    public ViewCourseJPanel(JPanel studentcardpanel, EducationSystem lc) {
        initComponents();
        this.studentcardpanel=studentcardpanel;
        this.lc=lc;
        
        StudentDashboard sj = new StudentDashboard(lc);
        txtstudentmyid.setText(sj.txtstudentname.getText());
        txtstudentmyid.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcourseid = new javax.swing.JLabel();
        txtcourseid = new javax.swing.JTextField();
        lblcoursename = new javax.swing.JLabel();
        txtcoursename = new javax.swing.JTextField();
        txtcourseprof = new javax.swing.JTextField();
        lblcourseprof = new javax.swing.JLabel();
        txtcoursecapacity = new javax.swing.JTextField();
        lblcoursecapacity = new javax.swing.JLabel();
        lblcourseregion = new javax.swing.JLabel();
        txtcourseregion = new javax.swing.JTextField();
        txtcourselang = new javax.swing.JTextField();
        lblcourselang = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        lblstartdate = new javax.swing.JLabel();
        lblenddate = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        datestart = new com.toedter.calendar.JDateChooser();
        dateend = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtstudentmyid = new javax.swing.JTextField();
        btnPopulate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblcourseid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourseid.setText("COURSE NAME:");

        txtcourseid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcourseid.setEnabled(false);

        lblcoursename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcoursename.setText("COURSE ID:");

        txtcoursename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcoursename.setEnabled(false);

        txtcourseprof.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcourseprof.setEnabled(false);

        lblcourseprof.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourseprof.setText("COURSE PROFESSOR:");

        txtcoursecapacity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcoursecapacity.setEnabled(false);

        lblcoursecapacity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcoursecapacity.setText("CAPACITY:");

        lblcourseregion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourseregion.setText("REGION:");

        txtcourseregion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcourseregion.setEnabled(false);

        txtcourselang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcourselang.setEnabled(false);

        lblcourselang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourselang.setText("LANGUAGE:");

        tblTable.setBackground(new java.awt.Color(204, 204, 204));
        tblTable.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Rating", "Feedback"
            }
        ));
        jScrollPane1.setViewportView(tblTable);

        lblstartdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblstartdate.setText("END DATE:");

        lblenddate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblenddate.setText("START DATE:");

        btnregister.setBackground(new java.awt.Color(0, 153, 153));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 153, 153));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        datestart.setEnabled(false);

        dateend.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("COURSE DETAILS");

        txtstudentmyid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtstudentmyid.setForeground(new java.awt.Color(102, 102, 255));
        txtstudentmyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentmyidActionPerformed(evt);
            }
        });

        btnPopulate.setBackground(new java.awt.Color(0, 153, 153));
        btnPopulate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPopulate.setForeground(new java.awt.Color(255, 255, 255));
        btnPopulate.setText("GET FEEDBACK");
        btnPopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstudentmyid, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblcourseprof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcoursename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcourseregion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblenddate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datestart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcourseid, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtcourseregion)
                                        .addComponent(txtcourseprof, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcourseid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstartdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcourselang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcoursecapacity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcoursecapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtcourselang, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(dateend, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtcoursename)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPopulate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnregister))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstudentmyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcourseid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcoursename, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcourseprof, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcourseprof, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcourseregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcourseregion))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblenddate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datestart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcoursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcourseid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcoursecapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcoursecapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcourselang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcourselang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(dateend, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblstartdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnback)
                        .addComponent(btnregister))
                    .addComponent(btnPopulate))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        studentcardpanel.remove(this);
        CardLayout layout = (CardLayout) studentcardpanel.getLayout();
        layout.previous(studentcardpanel);
        return;
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        String idtext=txtcourseid.getText();
        String coursename=txtcoursename.getText();
        Date startdate = datestart.getDate();
        Date enddate = dateend.getDate();
        String region=txtcourseregion.getText();
        String language=txtcourselang.getText();
        String courseprof=txtcourseprof.getText();
        
        int id= Integer.parseInt(idtext);
        String studidtext=txtstudentmyid.getText();
        int studid=Integer.parseInt(studidtext);
        
        int courseId = Integer.parseInt(txtcourseid.getText());
        int studentId = Integer.parseInt(txtstudentmyid.getText());

        if (isStudentAlreadyRegistered(courseId, studentId)) 
        {
            JOptionPane.showMessageDialog(this, "Course already registered");
            return;
        }
        
        if (isClassFull(courseId)) 
        {
            JOptionPane.showMessageDialog(this, "Class is full. You cannot register");
            return;
        } 
        
        
        LocalDate startdate1 = startdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate enddate1 = enddate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        for(Student s:lc.SudentList)
        {
            if(studid==s.getStudentUserId())
            {
                String newname=s.getStudentName();
                
                StudentUCourses sc = lc.AddStudentCourse();
                
                sc.setSCourseId(id);
                sc.setCStudentName(newname);
                sc.setSCourseName(coursename);
                sc.setCourseStartDate(startdate1);
                sc.setCourseEndDate(enddate1);
                sc.setSCourseRegion(region);
                sc.setSCourseLanguage(language);
                sc.setSCourseProfessor(courseprof);
                
            
                JOptionPane.showMessageDialog(this, "COURSE REGISTERED SUCCESSFULLY");
                System.out.println("Size of Stud course ArrayList: " + lc.StudentsUCourseslist.size());
                
                for (StudentUCourses course : lc.StudentsUCourseslist) {
                    System.out.println("NEW STUDENT COURSE");
                    System.out.println("Course ID: " + course.getSCourseId());
                    System.out.println("STUDENT Name: " + course.getCStudentName());
                    System.out.println("Course region: " + course.getSCourseRegion());
                    System.out.println("Course language: " + course.getSCourseLanguage());
                    System.out.println("PROFESSOR NAME: " + course.getSCourseProfessor());
                    System.out.println("course startdate: " + course.getCourseStartDate());
                    System.out.println("course enddate: " + course.getCourseEndDate());
                    System.out.println("\n");
                }
            }
        }
        
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtstudentmyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentmyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentmyidActionPerformed

    private void btnPopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopulateActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_btnPopulateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPopulate;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnregister;
    public com.toedter.calendar.JDateChooser dateend;
    public com.toedter.calendar.JDateChooser datestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcoursecapacity;
    private javax.swing.JLabel lblcourseid;
    private javax.swing.JLabel lblcourselang;
    private javax.swing.JLabel lblcoursename;
    private javax.swing.JLabel lblcourseprof;
    private javax.swing.JLabel lblcourseregion;
    private javax.swing.JLabel lblenddate;
    private javax.swing.JLabel lblstartdate;
    private javax.swing.JTable tblTable;
    public javax.swing.JTextField txtcoursecapacity;
    public javax.swing.JTextField txtcourseid;
    public javax.swing.JTextField txtcourselang;
    public javax.swing.JTextField txtcoursename;
    public javax.swing.JTextField txtcourseprof;
    public javax.swing.JTextField txtcourseregion;
    public javax.swing.JTextField txtstudentmyid;
    // End of variables declaration//GEN-END:variables

public boolean isClassFull(int courseId) {
    int courseCapacity = 0;
    int count = 0;

    // course capacity from ProfessorUCourseslist
    for (ProfessorUCourses profCourse : lc.ProfessorUCourseslist) {
        if (profCourse.getPCourseId() == courseId) {
            courseCapacity = profCourse.getCourseRegLimit();
            break; 
        }
    }
    //  no of registered students for course
    for (StudentUCourses studCourse : lc.StudentsUCourseslist) 
    {
        if (studCourse.getSCourseId() == courseId) 
        {
            count++;
        }
    }
    
    // Compare to course capacity
    return count >= courseCapacity;
}	

public boolean isStudentAlreadyRegistered(int courseId, int studentId) {
    
    String studentName = ""; 

    for (Student student : lc.SudentList) 
    {
        if (studentId == student.getStudentUserId()) 
        {
            studentName = student.getStudentName();
            break;
        }
    }

    for (StudentUCourses studCourse : lc.StudentsUCourseslist) 
    {
        if (studentName.equals(studCourse.getCStudentName()) && courseId == studCourse.getSCourseId()) 
        {
            return true; 
        }
    }

    return false; // Student not registered for the course
}

    private void populatetable() {
        String idtext=txtcourseid.getText();
        String profName = txtcourseprof.getText();
         int id=Integer.parseInt(idtext);
         
         DefaultTableModel model=(DefaultTableModel) tblTable.getModel(); //type casting tablemodel to defaulttablemodel for jtable
        model.setRowCount(0);
        
        for (Rating r:lc.RatingList){
            if (id==r.getRatingCourseId()){
                String name=r.getRatingProfessorName();
                
                    if(name.equals(profName)) {
                        
                        Object[] row=new Object[3];
                        
                        row[0] = profName;
                        row[1] = r.getRatingValue();
                        row[2] = r.getRatingFeedback();
                        
                        model.addRow(row);
                }
                
            }
        }
    }
}
