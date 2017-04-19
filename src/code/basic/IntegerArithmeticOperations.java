package code.basic;

/**
 * Created by bruno on 17-04-2017.
 */
public class IntegerArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 123175;
        int num2 = 512;
        System.out.println("\nInteger Arithmetic Operations\n");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        int sum = (num1 + num2);
        System.out.println("Sum: " + sum);
        int dif = (num1 - num2);
        System.out.println("Dif: " + dif);
        int product = (num1 * num2);
        System.out.println("Product: " + product);
        int quotient = (num1 / num2);
        System.out.println("Quotient: " + quotient);
        int remainder = (num1 % num2);
        System.out.println("Remainder: " + remainder);
    }
}
