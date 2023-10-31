/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Rating;

/**
 *
 * @author mihir
 */
public class Rating {
    
    int RatingCourseId;
    String RatingProfessorName;
    String RatingValue;
    String RatingFeedback;

    public Rating() {
        this.RatingCourseId = RatingCourseId;
        this.RatingProfessorName = RatingProfessorName;
        this.RatingValue = RatingValue;
        this.RatingFeedback = RatingFeedback;
    }
   
    public String getRatingProfessorName() {
        return RatingProfessorName;
    }

    public void setRatingProfessorName(String RatingProfessorName) {
        this.RatingProfessorName = RatingProfessorName;
    }

    public int getRatingCourseId() {
        return RatingCourseId;
    }

    public void setRatingCourseId(int RatingCourseId) {
        this.RatingCourseId = RatingCourseId;
    }

    public String getRatingFeedback() {
        return RatingFeedback;
    }

    public void setRatingFeedback(String RatingFeedback) {
        this.RatingFeedback = RatingFeedback;
    }

    public String getRatingValue() {
        return RatingValue;
    }

    public void setRatingValue(String RatingValue) {
        this.RatingValue = RatingValue;
    }
}
