/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Professor;

import java.time.LocalDate;

/**
 *
 * @author sidvi
 */
public class ProfessorUCourses {
    LocalDate PCourseStartDate;
    LocalDate PCourseEndDate;
    int PCourseId;
    int CourseRegLimit;
    String CProfessorName;
    String PCourseName;
    String PCourseRegion;
    String PCourseLanguage;
    

    public ProfessorUCourses() {
        this.PCourseStartDate = PCourseStartDate;
        this.PCourseEndDate = PCourseEndDate;
        this.PCourseId = PCourseId;
        this.CourseRegLimit = CourseRegLimit;
        this.CProfessorName = CProfessorName;
        this.PCourseName = PCourseName;
        this.PCourseRegion = PCourseRegion;
        this.PCourseLanguage = PCourseLanguage;
        
    }

    public int getPCourseId() {
        return PCourseId;
    }

    public void setPCourseId(int PCourseId) {
        this.PCourseId = PCourseId;
    }

    public String getCProfessorName() {
        return CProfessorName;
    }

    public void setCProfessorName(String CProfessorName) {
        this.CProfessorName = CProfessorName;
    }
    

    public String getPCourseName() {
        return PCourseName;
    }

    public void setPCourseName(String PCourseName) {
        this.PCourseName = PCourseName;
    }

    /*public String getCoursekeyword() {
        return coursekeyword;
    }

    public void setCoursekeyword(String coursekeyword) {
        this.coursekeyword = coursekeyword;
    }*/

    public LocalDate getPCourseStartDate() {
        return PCourseStartDate;
    }

    public void setPCourseStartDate(LocalDate PCourseStartDate) {
        this.PCourseStartDate = PCourseStartDate;
    }

    public LocalDate getPCourseEndDate() {
        return PCourseEndDate;
    }

    public void setPCourseEndDate(LocalDate PCourseEndDate) {
        this.PCourseEndDate = PCourseEndDate;
    }

    public String getPCourseRegion() {
        return PCourseRegion;
    }

    public void setPCourseRegion(String PCourseRegion) {
        this.PCourseRegion = PCourseRegion;
    }

    public String getPCourseLanguage() {
        return PCourseLanguage;
    }

    public void setPCourseLanguage(String PCourseLanguage) {
        this.PCourseLanguage = PCourseLanguage;
    }

    public int getCourseRegLimit() {
        return CourseRegLimit;
    }

    public void setCourseRegLimit(int CourseRegLimit) {
        this.CourseRegLimit = CourseRegLimit;
    }
    
    @Override //telling java that below method will be used
    public String toString(){
        return PCourseName;
    }
}
