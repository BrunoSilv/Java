package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.println("This program checks for pythagorean triple");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter Number1: ");
            input = br.readLine();
            int num1 = Integer.parseInt(input);
            System.out.println("Enter Number2: ");
            input = br.readLine();
            int num2 = Integer.parseInt(input);
            System.out.println("Enter Number3: ");
            input = br.readLine();
            int num3 = Integer.parseInt(input);

            System.out.println("Numbers Entered " + num1 + ", " + num2 + ", " + num3);
            if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2 ) || (Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2))
                || (Math.pow(num3, 2) + Math.pow(num1, 2) == Math.pow(num2, 2))){
                System.out.println("The numbers are pythagorean triples");
            }else{
                System.out.println("Numbers are not pythagorean triples");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
