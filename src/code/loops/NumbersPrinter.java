package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class NumbersPrinter {
    public static void main(String[] args) {
        System.out.println("This program will print numbers from 1 to maxNumbers");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter Number");
            input = br.readLine();
            int maxNumber = Integer.parseInt(input);
            for (int count = 1; count <= maxNumber; count++){
                System.out.println(count);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
