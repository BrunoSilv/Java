package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class DigitsSummation {
    public static void main(String[] args) {
        System.out.println( "\nThis program sums the digits of any number provided\n" );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter a number: ");
            input = br.readLine();
            int num = Integer.parseInt(input);
            int tempNum = num;
            int sum = 0;
            while (tempNum >= 1){
                sum = sum + tempNum % 10;
                tempNum = tempNum/10;
            }

            System.out.println("Number: " + num + " Sum of Digits: " + sum);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
