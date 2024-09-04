package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

public class evenProduct {
    public static void main(String[] args) {
        int[] ar = new int[15];
        for (int i = 0; i<ar.length; i++) {
            ar[i]=i*i;
        }
        boolean ans = false;
        for (int s : ar){
            if (s%2 == 0){
                ans = true;
                break;
            }
        }
        System.out.print(ans);
    }
}
