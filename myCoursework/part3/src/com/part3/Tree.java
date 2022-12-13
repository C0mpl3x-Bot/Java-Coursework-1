package com.part3;

//importing HashMap
import java.util.HashMap;

public class Tree {

    public static HashMap<Character, Integer> freq(String sentence) {
        //creating HashMap with parameters as Character and Integer
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        //for loop iterates over the length of the sentence. when i = length that means no more characters are left so
        //the iteration would stop
        for (int i = 0; i < sentence.length(); i++){

            //Characters Stores the character in the sentence at the index it is looking at
            char characters = sentence.charAt(i);
            //uses hashMap to get the character stored in characters and makes it equal to Integer value
            //uses Value to check the value of that character
            Integer value = hashMap.get(characters);

            /*checks if character has a value if it is the first time the character is there is would be equal to null
            if not it would have a value of 1 and have 1 added to it.
            then the new value is put to the hashmap.*/
            if (value != null){
                //adds the value one to the character it has stored.
                hashMap.put(characters, value + 1);
            }
            //if character had a value of null it would then be made so it has a value of 1 and it is put into the HashMap.
            else{
                hashMap.put(characters, 1);
            }
        }
        return hashMap;//returns the hashMap

    }
}
