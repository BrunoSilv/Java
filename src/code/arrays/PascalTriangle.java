package code.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 21-04-2017.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("\nThis program prints pascal triangle");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try{
            System.out.println("Enter number of rows in pascal triangle: ");
            input = br.readLine();
            int maxRowCount = Integer.parseInt(input);
            int[]previousRow;
            int[]currentRow = { 1 };
            displayRow(currentRow);
            for (int rowCount = 1; rowCount < maxRowCount; rowCount++){
                previousRow = currentRow;
                currentRow = new int[rowCount+1];
                currentRow[0] = 1;
                for (int colCount = 1; colCount < rowCount; colCount++){
                    currentRow[colCount] = previousRow[colCount-1] + previousRow[colCount];
                }
                currentRow[rowCount]=1;
                displayRow(currentRow);
            }

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void displayRow(int[] row){
        for (int num : row){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
