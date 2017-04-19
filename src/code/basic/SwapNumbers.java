package code.basic;

/**
 * Created by bruno on 17-04-2017.
 * Swap two numbers using temporary variable
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        System.out.println("\nBefore Swap: ");
        System.out.println("Number 1: " + num1 + " Number 2: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter Swap: ");
        System.out.println("Number 1: " + num1 + " Number 2: " + num2);
    }
}
