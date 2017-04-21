package code.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 22-04-2017.
 */
public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("\nThis program checks whether the input is a palindrome");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter the String: ");
            input = br.readLine();
            input = input.toUpperCase();
            StringBuffer strBuff = new StringBuffer(input);
            if (input.equalsIgnoreCase(strBuff.reverse().toString())){
                System.out.println("Entered string is a palindrome");
            }else{
                System.out.println("String is not a palindrome");
            }

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

