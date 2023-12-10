package Exercise04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = sc.next();

        //to create a aHashMap to store characters
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();

        //count the character frequency
        for(char ch : word.toCharArray()){
            characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("-----Frequency of each character-----");
        for(Map.Entry<Character, Integer> entry : characterFrequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
// HashMap is key-value pair collection and its allow to store frequency of each character.
// This one allow to easily handle different type of characters without the need predefined array size
// HashMap can dynamically resize. It is helpful for when we don't know how many unique characters will be in the input word
    }
}
