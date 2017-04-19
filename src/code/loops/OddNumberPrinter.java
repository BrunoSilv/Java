package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class OddNumberPrinter {
    public static void main(String[] args) {
        System.out.println("\nThis program will print odd numbers\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter number of odd numbers to be printed");
            input = br.readLine();
            int maxOddCount = Integer.parseInt(input);
            System.out.println("Odd numbers: ");
            for (int count = 1, oddCount = 0; oddCount < maxOddCount; count++){
                if (count % 2 == 0){
                    continue;
                }else{
                    System.out.println(count);
                    oddCount++;
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
