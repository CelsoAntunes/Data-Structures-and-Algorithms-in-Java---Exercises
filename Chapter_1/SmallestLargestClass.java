package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

public class SmallestLargestClass {
    public static void main(String[] args){
        int[] ar = new int[15];
        for (int i = 0; i<ar.length; i++) {
            ar[i]=i*i;
        }
        int min = ar[0];
        int max = ar[0];
        for (int s : ar){
            if (s<min){min = s;}
            if (s>max){max = s;}
        }
        System.out.print("Maximum and Minimum are respectively: " + max + " and " + min);
    }
}
