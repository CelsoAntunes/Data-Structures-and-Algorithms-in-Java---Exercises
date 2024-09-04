package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class pNormClass {
    public static void main(String[] args) {
        ArrayList<Double> vector = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        Scanner dimension = new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p = w.nextInt();
        System.out.print("Enter the dimension of the space: ");
        int n = dimension.nextInt();
        System.out.print("Enter the coordinates of the vector: ");
        for (int i = 0; i<n; i++) {
            double  c = input.nextDouble();
            vector.add(c);
        }
        double ans = 0;
        for (double element : vector){
            ans += Math.pow(element,p);
        }
        ans = Math.pow(ans,1.0/p);
        System.out.print(ans);
    }
}
