package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class sumOddLessEqual {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Value of n: ");
        long n = input.nextLong();
        int sum = 0;
        for (int val = 1; val<=n; val++){
            if (val % 2 == 1){sum += val;}
        }
        System.out.print(sum);
    }
}