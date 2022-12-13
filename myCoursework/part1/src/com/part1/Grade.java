package com.part1;

public class Grade {
    //private instance variables
    private String subject;
    private double Score;

    //Setters and Getters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setScore(double score) {
        this.Score = score;
    }

    public double getScore() {
        return Score;
    }

    Grade(double S,String sub){
        subject = sub;
        Score = S;
    }

    /*Code to check what grade the score is equivalent to
    if statement is used to check which category the Score is in so it can assign a grade to the score.
    this is a static method*/
    public static char getLetterGrade(double Score) {
        if (Score >= 70 && Score <= 100) {
            return 'A';
        } else if (Score >= 60 && Score <= 70) {
            return 'B';
        } else if (Score >= 50 && Score <= 60) {
            return 'C';
        } else if (Score >= 40 && Score <= 50) {
            return 'D';
        } else if (Score <= 40 && Score>= 0) {
            return 'F';
        }
        return 'E';
    }

    //prints out the grades,scores and subject for the student you are trying to get the information for.
    //this is a public method
    public String GradeOutPut(){
        return "\n"+(" Grade: " + getLetterGrade(Score) + "\n Score: " + Score + "\n Subject: " + subject) + "\n";

    }




}
