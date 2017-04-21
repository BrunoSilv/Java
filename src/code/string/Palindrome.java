package code.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 22-04-2017.
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("\nThis program checks whether the input is a palindrome");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter the String: ");
            input = br.readLine();
            input = input.toUpperCase();
            boolean isPalindrome = true;
            int strLength = input.length();
            int mid = strLength/2;
            for (int count = 0; count < mid; count++){
                if (input.charAt(count)==input.charAt(strLength-count-1)){
                    continue;
                }else{
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome){
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
