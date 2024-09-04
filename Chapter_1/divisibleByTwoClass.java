package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class divisibleByTwoClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int ans = 0;
        while (n>=2){
            n=n/2;
            ans += 1;
        }
        if (ans == 1){
            System.out.print("The integer can be divided " + ans + " time.");
        }
        else{
            System.out.print("The integer can be divided " + ans + " times.");
        }
    }
}
