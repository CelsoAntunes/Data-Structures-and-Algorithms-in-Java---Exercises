package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class intArrayDistinct {
    public static boolean distinct (ArrayList<Integer> myList) {
        boolean ans = false;
        Set<Integer> set = new HashSet<>(myList);
        if (set.size() == myList.size()) {
            ans = true;
        }
        return ans;
    }
}