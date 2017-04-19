package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by bruno on 18-04-2017.
 */
public class CalculateAge {
    public static void main(String[] args) {
        System.out.println("This program calculates age from date of birth");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter year of birth: ");
            input = br.readLine();
            int year = Integer.parseInt(input);
            System.out.println("Enter month of birth (1 - 12): ");
            input = br.readLine();
            int month = Integer.parseInt(input);
            System.out.println("Enter day of birth: ");
            input = br.readLine();
            int day = Integer.parseInt(input);
            System.out.println("Date of Birth (dd-mm-yyyy): " + day + "-" + month + "-" + year);
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(year,month,day);
            Period period = Period.between(birthday,today);
            System.out.println("Age: " + period.getYears() + " years " + period.getMonths() + " months and " + period.getDays() + " days ");

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
