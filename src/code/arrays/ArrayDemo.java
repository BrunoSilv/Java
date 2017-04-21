package code.arrays;

/**
 * Created by bruno on 21-04-2017.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Array Demo Program");
        //int array example
        int[] scores = new int[10];
        scores[0] = 15;
        scores[1] = 25;
        scores[2] = 14;
        scores[3] = 21;
        scores[4] = 10;
        scores[5] = 11;
        scores[6] = 22;
        scores[7] = 21;
        scores[8] = 23;
        scores[9] = 12;
        for (int count = 0; count < scores.length; count++){
            System.out.println("Score " + count + " : " + scores[count]);
        }
        System.out.println( "" );
        int[] data = {10, 20, 30, 45, 50};
        for (int count = 0; count < data.length; count++){
            System.out.println("Data " + count + " : " + data[count]);
        }
        System.out.println( "" );
        String[] weekdays = new String[7];
        weekdays[0] = "Sunday";
        weekdays[1] = "Monday";
        weekdays[2] = "Tuesday";
        weekdays[3] = "Wednesday";
        weekdays[4] = "Thursday";
        weekdays[5] = "Friday";
        weekdays[6] = "Saturday";

        for (int count = 0; count < weekdays.length; count++){
            System.out.println(weekdays[count]);
        }

        System.out.println("\n5th day of the week is : " + weekdays[4]);
    }
}
