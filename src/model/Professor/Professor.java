/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sidvi
 */
public class Professor {
    
    int ProfessorUserId;
    String ProfessorUsername;
    String ProfessorPassword;
    String ProfessorName;
    String ProfessorRole;
    LocalDate ProfessorDateOfBirth;
   
    public Professor() {
        this.ProfessorUserId = ProfessorUserId;
        this.ProfessorUsername = ProfessorUsername;
        this.ProfessorPassword = ProfessorPassword;
        this.ProfessorName = ProfessorName;
        this.ProfessorRole = ProfessorRole;
        this.ProfessorDateOfBirth = ProfessorDateOfBirth;
    }

    public String getProfessorUsername() {
        return ProfessorUsername;
    }

    public void setProfessorUsername(String ProfessorUsername) {
        this.ProfessorUsername = ProfessorUsername;
    }

    public String getProfessorPassword() {
        return ProfessorPassword;
    }

    public void setProfessorPassword(String ProfessorPassword) {
        this.ProfessorPassword = ProfessorPassword;
    }

    public String getProfessorName() {
        return ProfessorName;
    }

    public void setProfessorName(String ProfessorName) {
        this.ProfessorName = ProfessorName;
    }

    public String getProfessorRole() {
        return ProfessorRole;
    }

    public void setProfessorRole(String ProfessorRole) {
        this.ProfessorRole = ProfessorRole;
    }

    public LocalDate getProfessorDateOfBirth() {
        return ProfessorDateOfBirth;
    }

    public void setProfessorDateOfBirth(LocalDate ProfessorDateOfBirth) {
        this.ProfessorDateOfBirth = ProfessorDateOfBirth;
    }

    public int getProfessorUserId() {
        return ProfessorUserId;
    }

    public void setProfessorUserId(int ProfessorUserId) {
        this.ProfessorUserId = ProfessorUserId;
    }

  
}
