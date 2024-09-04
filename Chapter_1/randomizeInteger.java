package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class randomizeInteger {
    public static ArrayList<Integer> randomizeList(ArrayList<Integer> myList){
        int randomIndex;
        int max = myList.size();
        ArrayList<Integer> newList = new ArrayList<>(max);
        for (int i = 0; i< max; i++){
            randomIndex = ThreadLocalRandom.current().nextInt(0, myList.size());
            newList.add(myList.get(randomIndex));
            myList.remove(myList.get(randomIndex));
        }
        return newList;
    }
}
