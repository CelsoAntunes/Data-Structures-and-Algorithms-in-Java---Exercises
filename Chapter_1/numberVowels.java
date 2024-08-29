package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class numberVowels {
    public static final String vowels = "aeiou";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type the string: ");
        String s = input.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (vowels.contains(Character.toString(s.charAt(i)))){ans ++;}
        }
        System.out.printf("There are %d vowels in the string", ans);
    }
}