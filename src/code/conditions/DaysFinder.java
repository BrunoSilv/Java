package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class DaysFinder {
    public static void main(String[] args) {
        System.out.println("This program will find days of a Month");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Input Year: ");
            input = br.readLine();
            int year = Integer.parseInt(input);
            System.out.println("Input Month: ");
            input = br.readLine();
            int month = Integer.parseInt(input);
            int numberOfDays = 0;

            switch ( month ) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    System.out.println("Month " + month + " Number of days " + numberOfDays);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    System.out.println("Month " + month + " Number of days " + numberOfDays);
                    break;
                case 2:
                    if (year % 400 == 0 || (year %4 == 0) && year % 100 !=0){
                        numberOfDays = 29;
                        System.out.println("Month " + month + " Number of days " + numberOfDays);
                }else{
                        numberOfDays = 28;
                        System.out.println("Month " + month + " Number of days " + numberOfDays);
                        break;
                    }
                default:
                    System.out.println("Invalid Month ");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
