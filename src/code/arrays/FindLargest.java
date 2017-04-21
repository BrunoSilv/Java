package code.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bruno on 21-04-2017.
 */
public class FindLargest {
    public static void main(String[] args) {
        System.out.println("This program creates an array of given size and fills with random numbers");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter number of elements: ");
            input = br.readLine();
            int elementCount = Integer.parseInt(input);
            int numbers [] = new int[elementCount];

            for (int count = 0; count < elementCount; count++){
                //random numb gen
                numbers[count] = (int) (Math.random() * 125 + Math.random() *100);
            }
            //Prints Array
            System.out.println("\nArray Elements: ");
            for (int count = 1; count < numbers.length; count++){
                System.out.print(numbers[count] + " ");
            }

            //sort array
            Arrays.sort(numbers);
            System.out.println("\nSorted Arrays: ");
            for (int number:numbers){
                System.out.print(number + " ");
            }
            System.out.println("\nLargest element in array: " + numbers[numbers.length-1]);
            System.out.println("Second largest element in array: " + numbers[numbers.length - 2]);
            System.out.println("Smallest element in array: " +numbers[0]);
            System.out.println("Second smallest element in array" + numbers[1]);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
