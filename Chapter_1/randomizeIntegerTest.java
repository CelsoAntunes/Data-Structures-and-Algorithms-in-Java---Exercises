package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;

public class randomizeIntegerTest {
    public static void main(String[] args){
        int max = 52;
        int min = 1;
        ArrayList<Integer> myList = new ArrayList<>(max);
        for (int j = min; j<max+1; j++){myList.add(j);}
        System.out.println(myList);
        System.out.println(randomizeInteger.randomizeList(myList));
        System.out.print(intArrayDistinct.distinct(myList));
    }
}
