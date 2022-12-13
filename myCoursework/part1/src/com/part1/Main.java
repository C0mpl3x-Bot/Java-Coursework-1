package com.part1;

//importing IOException and ArrayList
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    //arraylist created where it uses the Student class
    public static ArrayList<Student> students = new ArrayList<Student>();

    //IOEXCEPTION is used to throw a failure in input and output operations
    public static void main(String[] args) throws IOException {
        //adding the details of students and their grades to the array list using the Student constructor
        //adds information using the Student constructor
        students.add(new Student("Bert Smith", "Computing", 21, "bsmit001", 12345, true));
        students.get(0).grades.add(new Grade(52, "programming"));
        students.get(0).grades.add(new Grade(63, "web dev"));
        students.get(0).grades.add(new Grade(76, "maths"));
        students.get(0).grades.add(new Grade(68, "algorithms"));

        //adding the details of students and their grades to the array list.
        //adds information using the Student constructor
        students.add(new Student("Olivia Green", "Computing", 19, "ogree001", 12346, true));
        students.get(1).grades.add(new Grade(73, "programming"));
        students.get(1).grades.add(new Grade(82, "web dev"));
        students.get(1).grades.add(new Grade(72, "maths"));
        students.get(1).grades.add(new Grade(66, "algorithms"));

        //adding the details of students and their grades to the array list.
        //adds information using the Student constructor
        students.add(new Student("Eloise Jones", "Computing", 18, "ejone001", 12347, true));
        students.get(2).grades.add(new Grade(65, "programming"));
        students.get(2).grades.add(new Grade(63, "web dev"));
        students.get(2).grades.add(new Grade(37, "maths"));
        students.get(2).grades.add(new Grade(40, "algorithms"));

        //adding the details of students and their grades to the array list.
        //adds information using the Student constructor
        students.add(new Student("Ben Bird", "Computing", 42, "bbird001", 12348, false));
        students.get(3).grades.add(new Grade(55, "programming"));
        students.get(3).grades.add(new Grade(29, "web dev"));
        students.get(3).grades.add(new Grade(56, "maths"));
        students.get(3).grades.add(new Grade(38, "algorithms"));

        //adding the details of students and their grades to the array list.
        //adds information using the Student constructor
        students.add(new Student("Karen Brown", "Computing", 25, "kbrown002", 12349, false));
        students.get(4).grades.add(new Grade(62, "programming"));
        students.get(4).grades.add(new Grade(51, "web dev"));
        students.get(4).grades.add(new Grade(43, "maths"));
        students.get(4).grades.add(new Grade(43, "algorithms"));

        //switch statement with do while loop
        //ch is empty so it can take inputted information from terminal.
        char ch = ' ';
        do {
            //main menu always printed after every switch/input
            System.out.println("1) Report of all students");
            System.out.println("2) Name of all students with failed module");
            System.out.println("3) Average Grade for each student");
            System.out.println("4) Press q to quit");
            ch = (char) System.in.read();
            System.in.read();

            //switch statement
            switch (ch) {

                //if 1 is pressed it prints report of all students by using a for loop and printing each students information
                //using toString1() in Student class.
                case '1':
                    //prints out report of all students
                    System.out.println("Report of all students");
                    //for loop iterates over all the students beginning from index 0 and then prints all of the information
                    // of all students using toString in students arraylist
                    System.out.println("----------------------------------------------------------------");
                    for(int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i).toString1());
                        System.out.println("----------------------------------------------------------------");
                    }
                    System.out.println(" ");
                    break;//stops code from executing

                case '2':
                    //prints out all students with failed module
                    System.out.println("Name of all students with failed module");

                    /*for loop checks the FailedStudent and if true is returned it would take the index at which it is
                    returned true and would print that students details and then move to the
                    next until it iterates over all students via student.size*/
                    System.out.println("----------------------------------------------------------------");
                    for(int i = 0; i<students.size();i++){
                        if(students.get(i).FailedStudent()){
                            System.out.println(students.get(i).toString1());
                            System.out.println("----------------------------------------------------------------");
                        }
                    }
                    System.out.println(" ");
                    break;//stops code from executing
                case '3':
                    //prints out the Average grade for each student
                    System.out.println("Average Grade for each student");
                    System.out.println("----------------------------------------------------------------");
                    //for loop goes through all students and using the index it is at it would get the name of the student
                    //from the arraylist students and then get the students average and concatenate them into a sentence to be printed out
                    for(int i = 0; i < students.size(); i++) {
                        System.out.println("Name: " + students.get(i).getName()+  ", Average is: " + students.get(i).Average());
                        System.out.println("----------------------------------------------------------------");
                    }
                    System.out.println(" ");
                    break;//stops code from executing
                case 'q':
                    //if q is pressed you stop the switch statement and the code stops running
                    System.out.println("GoodBye");
                    System.out.println(" ");
                    break;//stops code from executing
                default:
                    //if a key that does not have a case is pressed it would print out the default and say you have pressed invalid key.
                    System.out.println("Invalid Key Entered");
                    System.out.println(" ");
                    break;//stops code from executing
            }

        } while (ch != 'q');//stops do while loop with the switch statements from taking anymore input so it stops the program from running if q is pressed.
    }
}
