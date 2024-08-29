package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.Scanner;

public class inputAllBaseTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        if (input.hasNextBoolean()){
            Boolean bol = input.nextBoolean();
            System.out.println(bol);
        }
        if (input.hasNextByte()){
            Byte b = input.nextByte();
            System.out.println(b);
        }
        if (input.hasNextDouble()){
            Double db = input.nextDouble();
            System.out.println(db);
        }
        if (input.hasNextFloat()){
            Float fl = input.nextFloat();
            System.out.println(fl);
        }
        if (input.hasNextInt()){
            int i = input.nextInt();
            System.out.println(i);
        }
        if (input.hasNextLong()){
            Long l = input.nextLong();
            System.out.println(l);
        }
        if (input.hasNextShort()){
            Short s = input.nextShort();
            System.out.println(s);
        }

    }
}
