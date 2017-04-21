package code.arrays;

/**
 * Created by bruno on 21-04-2017.
 */
public class Array2DDemo {
    public static void main(String[] args) {
        System.out.println("Example of 2D arrays");
        int [][] data = {{10, 2}, {3, 5}, {12, 4}};

        for (int row = 0; row < data.length; row++){
            for (int col = 0; col < data[row].length; col++){
                System.out.println("Data -> Row: " + row + " Col: " + col + " Value: " + data[row][col]);
            }
        }
        System.out.println("Element at index 3 and 1 is : " + data[2][1]);
    }
}
