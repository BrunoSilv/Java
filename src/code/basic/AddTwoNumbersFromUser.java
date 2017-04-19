package code.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 17-04-2017.
 */
public class AddTwoNumbersFromUser {
    public static void main(String[] args) {
        System.out.println("\nThis program accepts two numbers from the end user\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("Enter number1: ");
            String number1 = br.readLine();
            System.out.println("Enter number2: ");
            String number2 = br.readLine();
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
        catch (Exception ex){
            System.out.println("Caught Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
