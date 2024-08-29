package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Value of n: ");
        long n = input.nextLong();
        while (n>=2){n-= 2;}
        boolean answer = n == 0;
        System.out.print(answer);
    }
}
