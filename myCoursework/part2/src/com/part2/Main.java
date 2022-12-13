package com.part2;

//importing Scanner and IOException
import java.io.IOException;
import java.util.Scanner;

public class Main{
    //IOEXCEPTION is used to throw a failure in input and output operations
    public static void main(String[] args) throws IOException {
        //ch is empty so it can take inputted information from terminal.
        char ch = ' ';
        //do while statement.
        do {
            //main menu first thing the user would see and would be called after a function is completed.
            System.out.println("1) Generate Password");
            System.out.println("2) Validate Password");
            System.out.println("3) Press q to quit");
            ch = (char) System.in.read();
            System.in.read();

            //switch statement
            switch (ch) {

                case '1':
                    //asks user to input number for lengths then a number for symbols then a number of digits the user wants in the password
                    //then it would use those inputs and Password.generates with that information and generate a random password that the user wanted.
                    Scanner in = new Scanner(System.in);
                    System.out.println("Hello, Please enter the length you want to use for your password");
                    int Len = in.nextInt();
                    System.out.println("Hello, Please enter the number of symbols you want to use for your password");
                    int Sym = in.nextInt();
                    System.out.println("Hello, Please enter the number of digits you want to use for your password");
                    int Dig  = in.nextInt();
                    System.out.println(Password.Generates(Len,Sym,Dig));
                    break;
                case '2':
                    //if user presses 2 it would call the password validate function.
                    System.out.println(Password.Validate());
                    break;
                case 'q':
                    //if q is pressed then the code would stop
                    System.out.println("GoodBye");
                    break;
                default:
                    //if a key that does not have a case is pressed then it would print invalid key pressed.
                    System.out.println("Invalid Key Pressed");
                    break;
            }

        } while (ch != 'q');//stops do while loop with the switch statements from taking anymore input so it stops the program from running if q is pressed.
    }
}