package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class DotProduct {
    public static double dotProduct(double[] a, double[] b){
        double result = 0;
        for (int i=0; i<a.length; i++){
            result+=a[i]*b[i];
        }
        return result;
    }

    public static void main(String[] args){
        Scanner dimension = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the dimension of the vectors: ");
        int n = dimension.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        System.out.print("Enter the coordinates of the first vector: ");
        for (int i = 0; i < n; i++){
            double c = input1.nextDouble();
            a[i]=c;
        }
        System.out.print("Enter the coordinates of the second vector: ");
        for (int i = 0; i < n; i++){
            double c = input2.nextDouble();
            b[i]=c;
        }

        System.out.print(dotProduct(a,b));
    }
}
