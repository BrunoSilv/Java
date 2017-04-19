package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class EvenNumberPrinter {
    public static void main(String[] args) {
        System.out.println("\nThis program will print even numbers\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter number of even numbers to be printed");
            input = br.readLine();
            int maxEvenCount = Integer.parseInt(input);
            System.out.println("Even numbers: ");
            for (int count = 1, evenCount = 0; evenCount < maxEvenCount; count++){
                if (count % 2 == 0){
                    System.out.println(count);
                    evenCount++;
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

