package code.basic;

/**
 * Created by bruno on 17-04-2017.
 * Swap numbers without temporary variable
 */
public class SwapNumbersWithoutTemp {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 13;
        System.out.println("\nBefore Swap: ");
        System.out.println("Number 1: " + num1 + " Number 2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("\nAfter Swap: ");
        System.out.println("Number 1: " + num1 + " Number 2: " + num2);

    }
}
