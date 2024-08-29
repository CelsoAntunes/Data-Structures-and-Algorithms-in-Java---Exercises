package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class isMultiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Value of n: ");
        long n = input.nextLong();
        System.out.print("Value of m: ");
        long m = input.nextLong();
        boolean answer = (n%m == 0);
        System.out.print(answer);
    }
}
