package code.conditions;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class LeapYears {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter Year: ");
            input = br.readLine();
            int year = Integer.parseInt(input);
            if ((year % 4 == 0) && year % 100 != 0){
                System.out.println(year + " is a leap year.");
            }
            else if ((year %400 == 0)){
                System.out.println(year + " is a leap year.");
            }else{
                System.out.println(year + " is not a leap year.");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

