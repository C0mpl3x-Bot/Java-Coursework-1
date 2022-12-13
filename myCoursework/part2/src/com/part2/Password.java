package com.part2;

//importing Scanner
import java.util.Scanner;

public class Password {

    //this is a static method
    public static String Generates(int Length, int Symbols, int Digits) {

        //string for the Digits, Symbols and the Characters
        String stringDigits = ("0123456789");
        String stringSymbols = ("!@£€#$%^&()_-+=[]{};:|<>/?~");
        String stringCharacters = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

        //creates string for random digits, symbols and characters to be added to it
        String RequirementPassword = "";

        /*for loop iterates over Digits and randomly picks a number that is smaller than the length of the String and then
        uses substring to get that index on its own and adds it into the string RequirementPassword
        the number of random digits picked would depend on what the user inputs into the system*/
        for (int j = 0; j < Digits; j++) {
            int index = (int) (Math.random() * stringDigits.length());
            RequirementPassword += stringDigits.substring(index, index + 1);
        }

        /*for loop iterates over Symbols and randomly picks a number that is smaller than the length of the String and then
        uses substring to get that index on its own and adds it into the string RequirementPassword
        the number of random Symbols picked would depend on what the user inputs into the system*/
        for (int i = 0; i < Symbols; i++) {

            int index = (int) (Math.random() * stringSymbols.length());
            RequirementPassword += stringSymbols.substring(index, index + 1);

        }

        /*for loop iterates over the length inputted by the user and subtracts that length from the Digits + symbols that
        the user also inputted this is done so enough characters are picked to meet the length requirement whilst including the digits and symbols.
        It randomly picks a number that is smaller than the length of the characters and then
        uses substring to get that index on its own and adds the character into the string RequirementPassword */
        for (int r = 0; r < Length - (Digits + Symbols); r++) {
            int index = (int) (Math.random() * stringCharacters.length());
            RequirementPassword += stringCharacters.substring(index, index + 1);
        }

        //creates string RandPassword
        String RandPassword = "";

        /*while loop iterates from 0 to the length inputted by the user
        it randomly picks a character,symbol or digit from the RequirementPassword string and would add that character,symbol or digit to RandPassword
        Then it would remove that character,symbol or digit from RequirementPassword and move on to the next index until index = length.*/
        int i = 0;
        while (i < Length) {
            int index = (int) (Math.random() * RequirementPassword.length());
            RandPassword += RequirementPassword.substring(index, index + 1);
            RequirementPassword = RequirementPassword.substring(0, index) + RequirementPassword.substring(index + 1, RequirementPassword.length());
            i++;
        }
        return RandPassword;
    }

    //this is a static method
    public static String Validate() {
        //creates a new Scanner instance.
        Scanner in = new Scanner(System.in);
        //Strings for Symbols,Digits,uppercase letters and lowercase letters are created
        String stringSymbols = ("!@£€#$%^&()_-+=[]{};:|<>/?~");
        String stringDigits = ("0123456789");
        String UpperCase = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String LowerCase = ("abcdefghijklmnopqrstuvwxyz");

        //asks user to input a password they want to validate
        System.out.println("Hello, Please enter the password you want to validate");
        //n is the inputted string of password by the user
        String n = in.nextLine();
        int i = 0;
        String k;
        int SymbolCount = 0;
        int DigitCount = 0;
        boolean UpperCaseFound = false;
        boolean LowerCaseFound = false;
        //iterates from 0 to length of the input from user
        while (i < n.length()) {
            //sets k to be each index of the string inputted by user after each iteration.
            k = n.substring(i, i + 1);
            //checks if k is a symbol and if it is it would increment SymbolCount by 1
            if (stringSymbols.indexOf(k) != -1) {
                SymbolCount++;
            }
            //checks if k is a Digit and if it is it would increment DigitCount by 1
            if (stringDigits.indexOf(k) != -1) {
                DigitCount++;
            }

            //checks if k is a Uppercase letter if it is it would return true else it would stay false
            if (UpperCase.contains(k)) {
                UpperCaseFound = true;
            }
            //checks if k is a Lowercase letter if it is it would return true else it would stay false
            if (LowerCase.contains(k)) {
                LowerCaseFound = true;
            }
            //increments i to move on to the next index in the string
            i++;
        }

        /*checks the length of the inputted password.
        check the number of symbols used by checking SymbolCount
        checks the number of digits used by checking DigitCount
        Checks whether a mix of letter cases are used
        If mix of letter cases need to be false it would check if only Uppercase was used and no lowercase or if only lowercase was used and no uppercase or if neither was used
        If mix of letter cases need to be true it would check if UpperCaseFound and LowerCaseFound is true.*/
        if (n.length() <= 8 && SymbolCount == 0 && DigitCount == 0 && ((UpperCaseFound == false && LowerCaseFound == false) || (UpperCaseFound == true && LowerCaseFound == false) || UpperCaseFound == false && LowerCaseFound == true)) {
            return "Your Password Is Poor and Your password is " + n;

        }
        else if (n.length() > 8 && n.length()<12 && SymbolCount > 1 && DigitCount > 2 && ((UpperCaseFound == false && LowerCaseFound == false) || (UpperCaseFound == true && LowerCaseFound == false) || UpperCaseFound == false && LowerCaseFound == true)) {
            return "Your Password Is Ok and Your password is " + n;

        }
        else if (n.length() > 12 && n.length()<16 && SymbolCount > 3 && DigitCount > 2 && UpperCaseFound == true && LowerCaseFound == true) {
            return "Your Password Is good and Your password is " + n;

        }
        else if (n.length() >= 16 && SymbolCount > 4 && DigitCount > 4 && UpperCaseFound == true && LowerCaseFound == true) {
            return "Your Password Is Excellent And Your password is " + n;

        }
        else {
            //if none of the conditions are met it would return "your password is invalid"
            return "Your Password is invalid";
        }
    }

}
