package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BirthdayParadox {
    public static int[] birthdayGenerator(int number) {
        int[] ans = new int[number];
        for (int i = 0; i<number; i++) {
            ans[i] = ThreadLocalRandom.current().nextInt(1,366);
        }
        return ans;
    }
    public static Integer[] toIntegerArray(int[] arr) {
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            double occurrences = 0;
            double result;
            double numberOfTries = 10000;
            for (int j = 0; j < numberOfTries; j++) {
                int[] birthdays = birthdayGenerator(5*i);
                Integer[] goodBirthdays = toIntegerArray(birthdays);
                if (!Distinct.distinct(goodBirthdays)) {
                    occurrences += 1;
                }
            }
            result = occurrences / numberOfTries;
            System.out.println("For n = " + 5 * i + " we have the chance of: " + result + ", with " + numberOfTries + " tries.");
        }
        double occurrences = 0;
        double result;
        double numberOfTries = 10000;
        for (int j = 0; j < numberOfTries; j++) {
            if (!Distinct.distinct(toIntegerArray(birthdayGenerator(22)))) {
                occurrences += 1;
            }
        }
        result = occurrences / numberOfTries;
        System.out.println("For n = " + 22 + " we have the chance of: " + result + ", with " + numberOfTries + " tries.");
        occurrences = 0;
        for (int j = 0; j < numberOfTries; j++) {
            if (!Distinct.distinct(toIntegerArray(birthdayGenerator(23)))) {
                occurrences += 1;
            }
        }
        result = occurrences / numberOfTries;
        System.out.println("For n = " + 23 + " we have the chance of: " + result + ", with " + numberOfTries + " tries.");
    }
}
