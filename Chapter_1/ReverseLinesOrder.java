package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseLinesOrder {
    public static List<String> reverseLines(List<String> myLines){
        Stack<String> helpful = new Stack<String>();
        ArrayList<String> newLines = new ArrayList<>();
        for (String line : myLines){
            helpful.push(line);
        }
        for (int i = 0; i < myLines.size(); i++){
            newLines.add(helpful.pop());
        }
        return newLines;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> myLines = new ArrayList<String>();
        System.out.print("Enter the lines you want to reverse the order: ");
        while (input.hasNextLine()){
            String next = input.nextLine();
            if (next.isEmpty()){
                break;
            }
            myLines.add(next);
        }
        for (String line : reverseLines(myLines)){
            System.out.println(line);
        }
    }
}
