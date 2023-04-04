import tasks.MathOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int num1, num2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        num1 = Integer.parseInt(reader.readLine());

        System.out.println("Enter the second number: ");
        num2 = Integer.parseInt(reader.readLine());

        System.out.println("Here is the max number: ");
        System.out.println(MathOperations.GetMax(num1, num2));

        System.out.println("Here is the min number: ");
        System.out.println(MathOperations.GetMin(num1, num2));
    }
}