package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class CalcTriangleArea {
    public static void main(String[] args) {
        System.out.println("This program accepts sides of a triangle and calculates area");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter Side 1: ");
            input = br.readLine();
            float side1 = Float.parseFloat(input);
            System.out.println("Enter Side 2: ");
            input = br.readLine();
            float side2 = Float.parseFloat(input);
            System.out.println("Enter Side 3: ");
            input = br.readLine();
            float side3 = Float.parseFloat(input);

            System.out.println("Numbers Entered " + side1 + ", " + side2 + ", " + side3);
            if (side1 + side2 > side3 && (side2 + side3) > side1 && (side3 + side1) > side2){
                float perimeter = side1 + side2 + side3;
                float p = perimeter/2;
                //Herons formula Area = sqrt(p*(p-a)*(p-b)*(p-c))
                double area = Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
                System.out.println("Area : " + area);
            }else{
                System.out.println("Cannot form triangle");
            }

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
