package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class FloydsTriangle {

    public static void main( String[] args ) {
        System.out.println( "\nThis program creates Floyds triangle with given number of rows. \n" );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter the number of rows in Floyds triangle : ");
            input = br.readLine();
            int maxRows = Integer.parseInt(input);
            int num = 0;
            for( int rowCount = 1; rowCount <= maxRows; rowCount++ ) {
                for( int colCount = 1; colCount <= rowCount; colCount++ ) {
                    System.out.print( ++num + " " );
                }
                System.out.println( "" );
            }

        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }
    
}
