package com.part1;

//importing ArrayList
import java.util.ArrayList;

public class Student {
    //private instance variables
    private String Name;
    private String Department;
    private int age;
    private String userName;
    private int studentNumber;
    private boolean fullTime;

    //Getters and Setters
    public void setName(String Name){
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setDepartment(String Department){
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean getFullTime() {
        return fullTime;
    }

    //student constructor()
    public Student(String N, String D, int A, String UN, int SN, boolean FT){
        Name = N;
        Department = D;
        age = A;
        userName = UN;
        studentNumber = SN;
        fullTime = FT;
    }
    //array list for grades uses Grade class
    public ArrayList<Grade> grades = new ArrayList<Grade>();


    //code used to print out the report of the student.(template code you would need to identify the index)
    //this is a public method
    public String toString1(){
        return(" Name: " + Name
                +"\n Department: " + Department
                +"\n Age: " + age
                + "\n UserName: " + userName
                + "\n Student Number: " + studentNumber
                + "\n FullTime: "+ fullTime
                + "\n" + GradesDetailOut());

    }
    //iterates over each grade score and subject and prints the information for them at once at each index for that particular student
    //this is a public method
    public String GradesDetailOut(){
        String GradeDetailOut= "";
        for(int i =0; i< grades.size();i++){
            //gets information on each grade, subject and score for that student it is looking at
            //uses GradeOutPut to display all the information in order
            GradeDetailOut += grades.get(i).GradeOutPut();
        }
        return GradeDetailOut;
    }


    /*finds the student with a failed module
    iterates through the number of grades there are and then it stores each grade temporarily and checks if it is less than 40 or greater than 0
    it it is it returns true if not it returns false and then it would increment i and go to the next grade.
    this is a public method*/
    public boolean FailedStudent() {
        for (int i = 0; i < grades.size(); i++){
            double grade = grades.get(i).getScore();
            if (grade <40 && grade >= 0){
                return true;
            }
        }
        return false;
    }

    /*uses grades to get all of the scores of 1 student that you are looking at and then adds the scores together and divides it by grades.size to get the average.
    gets the grades of each student using the arraylist for grades.
    iterate over the grades.
    this is a public method*/
    public double Average(){
        double total = 0;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i).getScore();
        }
        double average = total / grades.size();
        return average;
    }
}
