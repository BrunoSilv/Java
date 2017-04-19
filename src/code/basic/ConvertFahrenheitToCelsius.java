package code.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by bruno on 17-04-2017.
 * Convert temperature in Fahrenheit to Celsius
 */
public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("\nThis program converts temperature in Celsius from Fahrenheit\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter temperature in Fahrenheit :");
            input = br.readLine();
            float tempF = Float.parseFloat(input);
            float tempC = (tempF -32) * 5/9;
            DecimalFormat decFormat = new DecimalFormat("0.00");
            System.out.println("Temperature in Celsius: " + decFormat.format(tempC));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
