package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class floatArrayDistinct {
    public static void main(String[] args) {
        ArrayList<Float> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of the list: ");
        while (input.hasNextFloat()) {
            float c = input.nextFloat();
            myList.add(c);
        }
        Set<Float> set = new HashSet<>(myList);
        if (set.size() == myList.size()) {
            System.out.print("All elements distinct.");
        } else {
            System.out.print("Has duplicates.");
        }
    }
}
