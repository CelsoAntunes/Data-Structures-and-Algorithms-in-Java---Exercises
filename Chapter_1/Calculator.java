package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiFunction;


public class Calculator {
    public static double calculator(double x, double y, String operation) {
        HashMap<String, BiFunction<Double,Double,Double>> operations = new HashMap<>();

        operations.put("+", Double::sum);
        operations.put("-", (a,b) -> a-b);
        operations.put("*", (a,b) -> a*b);
        operations.put("/", (a,b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return a/b;
        });
        operations.put("**", Math::pow);
        operations.put("^", Math::pow);

        if (!operations.containsKey(operation)) {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        return operations.get(operation).apply(x,y);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        String operation = input.next();
        double y = input.nextDouble();

        try {
            double result = calculator(x, y, operation);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}