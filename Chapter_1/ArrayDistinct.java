package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ArrayDistinct {
    public static <T> boolean distinct(List<T> myList) {
        Set<T> set = new HashSet<>();
        for (T element : myList) {
            if (!set.add(element)) {
                return false;
            }
        }
        return true;
    }
}