package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class FindLargest {
    public static void main(String[] args) {
        System.out.println("This program will find the largest of three numbers");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter Number 1: ");
            input = br.readLine();
            float num1 = Float.parseFloat(input);
            System.out.println("Enter Number 2: ");
            input = br.readLine();
            float num2 = Float.parseFloat(input);
            System.out.println("Enter Number 3: ");
            input = br.readLine();
            float num3 = Float.parseFloat(input);

            float largest = num1;
            if (num2 > largest){
                largest = num2;
            }
            if (num3 > largest){
                largest = num3;
            }

            System.out.println("Number 1: " + num1 + " Number 2: " + num2 + " Number 3: " + num3 + " Largest Number: " + largest);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
