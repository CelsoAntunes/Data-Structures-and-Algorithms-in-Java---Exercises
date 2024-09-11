package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void generatePermutations(char[] s, int start, List<String> result) {
        if (start == s.length - 1) {
            result.add(new String(s));
        } else {
            for (int i = start; i < s.length; i++) {
                swap(s, start, i);  // Swap current element with the starting element
                generatePermutations(s, start + 1, result);  // Recur for the next position
                swap(s, start, i);  // Backtrack: swap the elements back
            }
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String input = "catdog";
        char[] chars = input.toCharArray();
        List<String> result = new ArrayList<>();

        generatePermutations(chars, 0, result);

        System.out.println(result);

    }
}