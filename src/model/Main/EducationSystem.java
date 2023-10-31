/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Main;

import Model.Student.Student;
import Model.Student.StudentUCourses;
import model.Rating.Rating;
import model.Professor.Professor;
import model.Professor.ProfessorUCourses;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mihir
 */
public class EducationSystem {
     public  List<Professor> ProfessorList = new ArrayList<>();
     public  List<Student> SudentList = new ArrayList<>();
     public  List<ProfessorUCourses> ProfessorUCourseslist = new ArrayList<>();
     public  List<StudentUCourses> StudentsEnrolledList = new ArrayList<>();
     public  List<StudentUCourses> StudentsUCourseslist = new ArrayList<>();
     public  List<Rating> RatingList = new ArrayList<>();
     public static EducationSystem EducationInstance;

    public EducationSystem() {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
    EducationSystem.this.AddProfessor(101, "Aman B", "aman12", "amanpassword", LocalDate.parse("1981-01-01", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(102, "Bhavesh C ", "bhavesh12", "bhaveshpassword", LocalDate.parse("1982-02-02", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(103, "Charan D", "charan12", "charanpassword", LocalDate.parse("1983-12-03", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(104, "Danish E", "danish12", "danishpassword", LocalDate.parse("1991-11-04", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(105, "Ella F", "ella12", "ellapassword", LocalDate.parse("1989-10-05", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(106, "Franny G", "franny12", "frannypassword", LocalDate.parse("1992-09-06", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(107, "Gunner H", "gunner12", "gunnerpassword", LocalDate.parse("1980-08-07", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(108, "Harish I", "harish12", "harishpassword", LocalDate.parse("1988-07-08", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(109, "Imma J", "imma12", "immapassword", LocalDate.parse("1976-06-09", formatter), "PROFESSOR");
    EducationSystem.this.AddProfessor(110, "Jonny K", "jonny12", "jonnypassword", LocalDate.parse("1999-05-10", formatter), "PROFESSOR");


    EducationSystem.this.AddStudent(201, "Sid", "sid123", "Sid0123", LocalDate.parse("2005-03-10", formatter), "STUDENT");
    EducationSystem.this.AddStudent(202, "Riya", "riya123", "riya123", LocalDate.parse("2004-07-15", formatter), "STUDENT");
    EducationSystem.this.AddStudent(203, "Mihir", "mihir123", "MyP@ssword", LocalDate.parse("2003-11-22", formatter), "STUDENT");
    EducationSystem.this.AddStudent(204, "Aniket", "aniket123", "Access2022", LocalDate.parse("2002-06-05", formatter), "STUDENT");
    EducationSystem.this.AddStudent(205, "Aishwarya", "aish123", "Welcome1", LocalDate.parse("2001-02-18", formatter), "STUDENT");
    EducationSystem.this.AddStudent(206, "Devanshu", "dev123", "Secure1", LocalDate.parse("2000-09-29", formatter), "STUDENT");
    EducationSystem.this.AddStudent(207, "Jhansi", "jhansi123", "Hello123", LocalDate.parse("1999-12-05", formatter), "STUDENT");
    EducationSystem.this.AddStudent(208, "Anusha", "anusha123", "EasyPass", LocalDate.parse("1998-03-14", formatter), "STUDENT");
    EducationSystem.this.AddStudent(209, "Kajal", "kajal123", "SimplePwd", LocalDate.parse("1997-10-27", formatter), "STUDENT");
    EducationSystem.this.AddStudent(210, "Kanishk", "", "Student123", LocalDate.parse("1996-08-07", formatter), "STUDENT");

    
    EducationSystem.this.AddProfessorCourse(1, "Aman B", "AED", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", 10);
    EducationSystem.this.AddProfessorCourse(2, "Aman B", "DS", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", 12);
    EducationSystem.this.AddProfessorCourse(3, "Bhavesh C", "ML", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", 9);
    EducationSystem.this.AddProfessorCourse(4, "Bhavesh C", "AI", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", 13);
    EducationSystem.this.AddProfessorCourse(5, "Charan D", "Web Dev", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", 8);
    EducationSystem.this.AddProfessorCourse(6, "Charan D", "Mob app", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", 14);
    EducationSystem.this.AddProfessorCourse(7, "Danish E", "Dmdd", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", 7);
    EducationSystem.this.AddProfessorCourse(8, "Danish E", "SES", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", 15);
    EducationSystem.this.AddProfessorCourse(9, "Ella F", "DM", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", 6);
    EducationSystem.this.AddProfessorCourse(10, "Ella F", "CS", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", 10);
    EducationSystem.this.AddProfessorCourse(11, "Franny G", "History", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", 5);
    EducationSystem.this.AddProfessorCourse(12, "Franny G", "BABADI", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", 11);
    EducationSystem.this.AddProfessorCourse(13, "Gunner H", "Advance DS", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", 4);
    EducationSystem.this.AddProfessorCourse(14, "Gunner H", "Advance DMDD", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", 12);
    EducationSystem.this.AddProfessorCourse(15, "Imma J", "Web Design", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", 3);
    EducationSystem.this.AddProfessorCourse(16, "Imma J", "PSA", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", 14);
    EducationSystem.this.AddProfessorCourse(17, "Isaac Adams", "PDP", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", 5);
    EducationSystem.this.AddProfessorCourse(18, "Isaac Adams", "OED", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", 12);
    EducationSystem.this.AddProfessorCourse(19, "Jonny K", "NLP", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", 6);
    EducationSystem.this.AddProfessorCourse(20, "Jonny K", "English", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", 13);

 
    EducationSystem.this.AddStudentCourse(1, "AED", "Riya", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", "A", "Aman B");
    EducationSystem.this.AddStudentCourse(2, "DS", "Riya", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", "B", "Aman B");
    EducationSystem.this.AddStudentCourse(3, "ML", "Aniket", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", "C", "Bhavesh C");
    EducationSystem.this.AddStudentCourse(4, "AI", "Aniket", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", "A", "Bhavesh C");
    EducationSystem.this.AddStudentCourse(5, "Web Dev", "Mihir", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", "B", "Charan D");
    EducationSystem.this.AddStudentCourse(6, "Mob app", "Mihir", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", "C", "Charan D");
    EducationSystem.this.AddStudentCourse(7, "Dmdd", "Sid", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Cali", "English", "A", "Danish E");
    EducationSystem.this.AddStudentCourse(8, "SES", "Sid", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Germany", "French", "B", "Danish E");
    EducationSystem.this.AddStudentCourse(9, "DM", "Kanishk", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Boston", "English", "C", "Ella F");
    EducationSystem.this.AddStudentCourse(10, "CS", "Anusha", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "NYC", "French", "A", "Ella F");
    EducationSystem.this.AddStudentCourse(2, "History", "Anusha", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Cali", "French", "B", "Aman B");
    EducationSystem.this.AddStudentCourse(3, "BABADI", "Kajal", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Germany", "English", "C", "Bhavesh C");
    EducationSystem.this.AddStudentCourse(4, "Advance DS", "Kajal", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Boston", "French", "A", "Bhavesh C");
    EducationSystem.this.AddStudentCourse(5, "Advance DMDD", "Mihir", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "NYC", "English", "B", "Charan D");
    EducationSystem.this.AddStudentCourse(6, "Web Design", "Riya", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Cali", "French", "C", "Charan D");
    EducationSystem.this.AddStudentCourse(7, "PSA", "Sid", LocalDate.parse("2023-11-29", formatter), LocalDate.parse("2024-02-26", formatter), "Germany", "English", "A", "Danish E");
    EducationSystem.this.AddStudentCourse(8, "PDP", "Sid", LocalDate.parse("2023-05-15", formatter), LocalDate.parse("2023-09-11", formatter), "Boston", "French", "B", "Danish E");


    EducationSystem.this.AddRating("Riya",1,"4","Good");
    EducationSystem.this.AddRating("Sid",2,"5","Nice Work");

    }
    
    public List<StudentUCourses> getStudentsUCourseslist() {
        return StudentsUCourseslist;
    }

    public void setStudentsUCourseslist(List<StudentUCourses> StudentsUCourseslist) {
        this.StudentsUCourseslist = StudentsUCourseslist;
    }
    
      public StudentUCourses AddStudentCourse(){
        
        StudentUCourses newstudcourse= new StudentUCourses();
        StudentsUCourseslist.add(newstudcourse);
        return newstudcourse;
        
    }
      
    public List<Professor> getProfessorList() {
        return ProfessorList;
    }

    public void setProfessorList(List<Professor> ProfessorList) {
        this.ProfessorList = ProfessorList;
    }

    public List<Student> getSudentList() {
        return SudentList;
    }

    public void setSudentList(List<Student> SudentList) {
        this.SudentList = SudentList;
    }

    public List<ProfessorUCourses> getProfessorUCourseslist() {
        return ProfessorUCourseslist;
    }

    public void setProfessorUCourseslist(List<ProfessorUCourses> ProfessorUCourseslist) {
        this.ProfessorUCourseslist = ProfessorUCourseslist;
    }

    public void enrollStudent(StudentUCourses studentcourse) {
        StudentsEnrolledList.add(studentcourse);
    }
    
    public void GradeAStudent(Student student, String grade) {
        for (StudentUCourses enrolledStudent : StudentsEnrolledList) {
            if (enrolledStudent.getSCourseId()== student.getStudentUserId()) 
            {
                enrolledStudent.setSCourseGrade(grade);
                break; 
            }
        }
    }
        
     public static EducationSystem getEducationInstance() {
        if (EducationInstance == null) 
        {
            EducationInstance = new EducationSystem();
        }
        return EducationInstance;
    }
   
      public Professor AddProfessor(){
        
        Professor newprofessor= new Professor();
        ProfessorList.add(newprofessor);
        return newprofessor;
        
    }
      public Student AddStudent(){
        
        Student newstudent= new Student();
        SudentList.add(newstudent);
        return newstudent;
        
    }
      public Rating AddRating(){
          Rating newrating = new Rating();
          RatingList.add(newrating);
          return newrating;
      }
      
      public ProfessorUCourses AddProfessorCourse(){
        
        ProfessorUCourses newprofcourse= new ProfessorUCourses();
        ProfessorUCourseslist.add(newprofcourse);
        return newprofcourse;
        
    }
    public void deleteprofcourse(ProfessorUCourses profcourse){
        ProfessorUCourseslist.remove(profcourse);
    }
    
    public void deletestudcourse(StudentUCourses studcourse){
        StudentsUCourseslist.remove(studcourse);
    }
    
    public ProfessorUCourses searchprofcourse(int profcoursenumber){
        for(ProfessorUCourses profcourse:ProfessorUCourseslist){
            if(profcourse.getPCourseId() == (profcoursenumber))
                return profcourse;
        }
        return null;
    }
    
      public void AddProfessor(int id,String name, String username, String password, LocalDate dob, String role) {
        Professor professor = AddProfessor();
        professor.setProfessorUserId(id);
        professor.setProfessorName(name);
        professor.setProfessorUsername(username);
        professor.setProfessorPassword(password);
        professor.setProfessorDateOfBirth(dob);
        professor.setProfessorRole(role);
    }
      
       public void AddStudent(int id, String name, String username, String password, LocalDate dob, String role) {
        Student student = AddStudent();
        student.setStudentUserId(id);
        student.setStudentName(name);
        student.setStudentUsername(username);
        student.setStudentPassword(password);
        student.setStudentDateOfBirth(dob);
        student.setStudentRole(role);
    }
       public void AddProfessorCourse(int courseid, String courseprofessorname, String coursename, LocalDate coursestart, LocalDate courseend, String courseregion, String courselanguage,int coursecapacity) {
        ProfessorUCourses profcourse = AddProfessorCourse();
        profcourse.setPCourseId(courseid);
        profcourse.setCProfessorName(courseprofessorname);
        profcourse.setPCourseName(coursename);
        profcourse.setPCourseStartDate(coursestart);
        profcourse.setPCourseEndDate(courseend);
        profcourse.setPCourseRegion(courseregion);
        profcourse.setPCourseLanguage(courselanguage);
        profcourse.setCourseRegLimit(coursecapacity);
    }
       public void AddStudentCourse(int courseid, String coursename, String studentname, LocalDate coursestart, LocalDate courseend, String courseregion, String courselanguage,String coursegrade,String courseprof) {
        StudentUCourses studcourse = AddStudentCourse();
        studcourse.setSCourseId(courseid);
        studcourse.setSCourseName(coursename);
        studcourse.setCStudentName(studentname);
        studcourse.setCourseStartDate(coursestart);
        studcourse.setCourseEndDate(courseend);
        studcourse.setSCourseRegion(courseregion);
        studcourse.setSCourseLanguage(courselanguage);
        studcourse.setSCourseGrade(coursegrade);
        studcourse.setSCourseProfessor(courseprof);
    }
       
       public void AddRating(String professorName, int courseID, String value, String feedback){
           Rating ratingclass = AddRating();
           ratingclass.setRatingCourseId(courseID);
           ratingclass.setRatingProfessorName(professorName);
           ratingclass.setRatingValue(value);
           ratingclass.setRatingFeedback(feedback);
           
       }
}
