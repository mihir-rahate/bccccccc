/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sidvi
 */
public class Student {

    public static Student getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int StudentUserId;
    String StudentUsername;
    String StudentPassword;
    String StudentName;
    String StudentRole;
    LocalDate StudentDateOfBirth;
    
    
    public Student() {
        this.StudentUserId=StudentUserId;
        this.StudentUsername = StudentUsername;
        this.StudentPassword = StudentPassword;
        this.StudentName = StudentName;
        this.StudentRole = StudentRole;
        this.StudentDateOfBirth = StudentDateOfBirth;  
    }

    public String getStudentUsername() {
        return StudentUsername;
    }

    public void setStudentUsername(String StudentUsername) {
        this.StudentUsername = StudentUsername;
    }

    public String getStudentPassword() {
        return StudentPassword;
    }

    public void setStudentPassword(String StudentPassword) {
        this.StudentPassword = StudentPassword;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentRole() {
        return StudentRole;
    }

    public void setStudentRole(String StudentRole) {
        this.StudentRole = StudentRole;
    }

    public LocalDate getStudentDateOfBirth() {
        return StudentDateOfBirth;
    }

    public void setStudentDateOfBirth(LocalDate StudentDateOfBirth) {
        this.StudentDateOfBirth = StudentDateOfBirth;
    }

    public int getStudentUserId() {
        return StudentUserId;
    }

    public void setStudentUserId(int StudentUserId) {
        this.StudentUserId = StudentUserId;
    }

}
