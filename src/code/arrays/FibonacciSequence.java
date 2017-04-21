package code.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 21-04-2017.
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("This program prints Fibonacci Sequence");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter the number of items to be printed from sequence: ");
            input = br.readLine();
            int maxCount = Integer.parseInt(input);
            // if condition is true numbers is the value if not 2 its the default value
            maxCount = maxCount > 2 ? maxCount : 2;
            int[]fibonacciSequence = new int[maxCount];
            fibonacciSequence [0] = 0;
            fibonacciSequence [1] = 1;
            for (int count = 2; count < maxCount; count++){
                fibonacciSequence[count]= fibonacciSequence[count-1]+fibonacciSequence[count-2];
            }
            System.out.println("Fibonacci Sequence: ");
            displayRow(fibonacciSequence);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void displayRow(int[] row){
        for (int num : row){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
