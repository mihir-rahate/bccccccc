/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Student;

import java.time.LocalDate;

/**
 *
 * @author riyasingh
 */
public class StudentUCourses {
    int SCourseId;
    LocalDate CourseStartDate;
    LocalDate CourseEndDate;
    String SCourseName;
    String SCourseProfessor;
    String CStudentName;
    String SCourseRegion;
    String SCourseLanguage;
    String SCourseGrade;

    public StudentUCourses(){
        this.SCourseId = SCourseId;
        this.CourseEndDate = CourseEndDate;
        this.CourseStartDate = CourseStartDate;
        this.SCourseName = SCourseName;
        this.SCourseProfessor = SCourseProfessor;
        this.CStudentName=CStudentName;
        this.SCourseRegion = SCourseRegion;
        this.SCourseLanguage = SCourseLanguage;
        this.SCourseGrade = SCourseGrade;
        
    }

    public int getSCourseId() {
        return SCourseId;
    }

    public void setSCourseId(int SCourseId) {
        this.SCourseId = SCourseId;
    }

    public String getCStudentName() {
        return CStudentName;
    }

    public void setCStudentName(String CStudentName) {
        this.CStudentName = CStudentName;
    }
    
    

    public String getSCourseProfessor() {
        return SCourseProfessor;
    }

    public void setSCourseProfessor(String SCourseProfessor) {
        this.SCourseProfessor = SCourseProfessor;
    }

    public String getSCourseName() {
        return SCourseName;
    }

    public void setSCourseName(String SCourseName) {
        this.SCourseName = SCourseName;
    }

    /*public String getCoursekeyword() {
        return coursekeyword;
    }

    public void setCoursekeyword(String coursekeyword) {
        this.coursekeyword = coursekeyword;
    }*/

    public LocalDate getCourseStartDate() {
        return CourseStartDate;
    }

    public void setCourseStartDate(LocalDate CourseStartDate) {
        this.CourseStartDate = CourseStartDate;
    }

    public LocalDate getCourseEndDate() {
        return CourseEndDate;
    }

    public void setCourseEndDate(LocalDate CourseEndDate) {
        this.CourseEndDate = CourseEndDate;
    }

    public String getSCourseRegion() {
        return SCourseRegion;
    }

    public void setSCourseRegion(String SCourseRegion) {
        this.SCourseRegion = SCourseRegion;
    }

    public String getSCourseLanguage() {
        return SCourseLanguage;
    }

    public void setSCourseLanguage(String SCourseLanguage) {
        this.SCourseLanguage = SCourseLanguage;
    }

    public String getSCourseGrade() {
        return SCourseGrade;
    }

    public void setSCourseGrade(String SCourseGrade) {
        this.SCourseGrade = SCourseGrade;
    }
    
    @Override //telling java that below method will be used
    public String toString(){
        return CStudentName ;
       
    }
    
}
