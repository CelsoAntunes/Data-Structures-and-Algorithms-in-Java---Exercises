package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Arrays;

public class ReverseClass {
    public static void main(String[] args){
        int[] ar = new int[15];
        int b;
        for (int i = 0; i<ar.length; i++) {
            ar[i]=i*i;
        }
        for (int j = 0; j<(ar.length/2); j++) {
            b = ar[ar.length-j-1];
            ar[ar.length-j-1] = ar[j];
            ar[j] = b;
        }
        System.out.print(Arrays.toString(ar));
    }
}
