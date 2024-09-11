package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static <T> boolean distinct(T[] arr){
        Set<T> set = new HashSet<>();
        for (T element : arr){
            if (element == null || !set.add(element)){
                return false;
            }
        }
        return true;
    }
}
