/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Rating;

import model.Rating.Rating;
import java.util.ArrayList;

/**
 *
 * @author mihir
 */
public class RatingDirectory {
    private ArrayList<Rating> RatingsList;
    private ArrayList<String> FeedbackList; 

    public RatingDirectory() {
        RatingsList = new ArrayList<>();
        FeedbackList = new ArrayList<>();
    }

    public void AddRating(Rating rating) {
        RatingsList.add(rating);
    }

    public void RemoveRating(Rating rating) {
        int index = RatingsList.indexOf(rating);
        if (index >= 0) {
            RatingsList.remove(index);
            FeedbackList.remove(index);
        }
    }

    public ArrayList<Rating> GetRatings() {
        return RatingsList;
    }
     public void AddFeedback(String feedbackText) {
        FeedbackList.add(feedbackText);
    }

    public ArrayList<String> GetFeedback() {
        return FeedbackList;
    }

    
}
