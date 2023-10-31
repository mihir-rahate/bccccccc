/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Transcript;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import javax.swing.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import model.Main.EducationSystem;
import Model.Student.StudentUCourses;
import Model.Student.Student;

/**
 *
 * @author mihir
 */
public class TranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranscriptJPanel
     */
    
    
    private JPanel studentcardpanel;
    private EducationSystem lc;
    private Student sc;
//    Object txtstudentmyid;
    
    public TranscriptJPanel(JPanel studentcardpanel, EducationSystem lc, Student sc) {
        initComponents();
        this.studentcardpanel = studentcardpanel;
        this.lc = lc;
        this.sc = sc;
        
//        populatetable();
        
//        lblName.setText("Welcome "+sc.getName());
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
        tblTable = new javax.swing.JTable();
        btnDownloadPdf = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblName.setText("Welcome ");
        txtstudentbyid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        tblTable.setBackground(new java.awt.Color(204, 204, 204));
        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Professor Name", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTable);

        btnDownloadPdf.setBackground(new java.awt.Color(255, 255, 102));
        btnDownloadPdf.setText("Download PDF");
        btnDownloadPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadPdfActionPerformed(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(255, 255, 102));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("Transcript");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Populate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDownloadPdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstudentbyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstudentbyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDownloadPdf)
                    .addComponent(jButton1))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownloadPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadPdfActionPerformed
        // TODO add your handling code here:
        
        
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int  x = j.showSaveDialog(this);

        if(x == JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        
        Document doc= new Document();
         try{
            
            PdfWriter.getInstance(doc, new FileOutputStream(path + "/transcript.pdf"));

            doc.open();
            
            System.out.println(path);

            PdfPTable tbl = new PdfPTable(4);

            // Adding header
            tbl.addCell("Course Name");
            tbl.addCell("Course Id");
            tbl.addCell("Professor Name");
            tbl.addCell("Grade");
            int courseCount = 0; // Counter for courses
            Set<String> professors = new HashSet<>(); 

            for(int i = 0; i < tblTable.getRowCount() ; i++){

            String courseName = tblTable.getValueAt(i, 0).toString();

            String courseId = tblTable.getValueAt(i, 1).toString();
            String professor = tblTable.getValueAt(i, 2).toString();
            String grade = tblTable.getValueAt(i, 3).toString();
                
                tbl.addCell(courseName);
                tbl.addCell(courseId);
                tbl.addCell(professor);
                tbl.addCell(grade);
                
                 courseCount++;

        // Add the professor to the set
                professors.add(professor);
            }
//        System.out.print(tblTable.getRowCount());
//        for (int row = 0; row < tblTable.getRowCount(); row++) {
//            for (int column = 0; column < tblTable.getColumnCount(); column++) {
//            String cellValue = tblTable.getValueAt(row, column).toString();
//            tbl.addCell(cellValue);
//                tbl.addCell();
//
////               tbl.addCell(courseName);
////               tbl.addCell(courseId);
////               tbl.addCell(creditsEarned);
//        }
//    }
             if (courseCount >= 8 && professors.size() > 1) {
        
               
            Paragraph header = new Paragraph("Transcript");
            header.setAlignment(Element.ALIGN_CENTER);
            doc.add(header);
           
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" ")); 
            
            doc.add(tbl);
            
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" ")); 
            
//            String creditsEarned = lblEarnedCredits.getText() + "  " + txtEarnedCredits.getText();
//            String totalCredits = lblTotalCredits.getText() + "  " + txtTotalCredits.getText();
//            Paragraph para1 = new Paragraph(creditsEarned);
//            para1.setAlignment(Element.ALIGN_RIGHT);
//            Paragraph para2 = new Paragraph(totalCredits);
//            para2.setAlignment(Element.ALIGN_RIGHT);
            
//            doc.add(para1);
//            doc.add(para2);
            
             }else {
                 JOptionPane.showMessageDialog(this, "Graduation Requirement not Complete", "Error", JOptionPane.INFORMATION_MESSAGE);
             }
    }catch(FileNotFoundException ex){
               System.out.println("Failed to generate pdf: File not found");
               return;
    }catch(DocumentException ex){
               System.out.println("Failed to generate pdf: Document Exception");
               return;
    }
         doc.close();
        JOptionPane.showMessageDialog(this, "Pdf downloaded successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnDownloadPdfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDownloadPdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblTable;
    public javax.swing.JTextField txtstudentbyid;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        String idtext=txtstudentbyid.getText();
        int id=Integer.parseInt(idtext);
        
        DefaultTableModel model=(DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
        
        int columnCount = model.getColumnCount();
        for (int column = 0; column < columnCount; column++) 
        {
            Class<?> columnClass = model.getColumnClass(column);
            System.out.println("Column " + column + " data type: " + columnClass.getName());
        }
        
        for(Student s: lc.SudentList)
        {
            {
            if (id==s.getStudentUserId())
            {
                String name=s.getStudentName();
                for(StudentUCourses sc : lc.StudentsUCourseslist){
                    if(name.equals(sc.getCStudentName())){
                        Object[] row =new Object[4];
                        
                        row[0]=sc.getSCourseId();
                        row[1]=sc.getSCourseName();
                        row[2]=sc.getSCourseProfessor();
                        row[3]=sc.getSCourseGrade();
                        
                        model.addRow(row);
                        
                    }
        }
    }}}}
}