package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;
import java.util.Scanner;

public class punctuationRemover {
    public static void main(String[] args){
        String punctuation = "!.,:'?-_;\"";
        Scanner input = new Scanner(System.in);
        System.out.print("Type string: ");
        StringBuilder s = new  StringBuilder(input.nextLine());
        for (int i = 0; i< s.length(); i++){
            if (punctuation.contains(Character.toString(s.charAt(i)))) {
                s.deleteCharAt(i);
                i -= 1;
            }
        }
        System.out.print(s);
    }
}
