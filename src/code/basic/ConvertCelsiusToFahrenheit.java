package code.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by bruno on 17-04-2017.
 * Convert temperature in Celsius to Fahrenheit
 */
public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("\nThis program converts temperature in Fahrenheit from Celsius\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter temperature in Celsius :");
            input = br.readLine();
            float tempC = Float.parseFloat(input);
            float tempF = tempC * 9/5 + 32;
            DecimalFormat decFormat = new DecimalFormat("0.00");
            System.out.println("Temperature in Fahrenheit: " + decFormat.format(tempF));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
