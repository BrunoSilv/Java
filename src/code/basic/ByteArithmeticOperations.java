package code.basic;

/**
 * Created by bruno on 17-04-2017.
 */
public class ByteArithmeticOperations {
    public static void main(String[] args) {
        byte num1 = 12;
        byte num2 = 5;
        System.out.println("\nByte Arithmetic Operations\n");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        byte sum = (byte) (num1 + num2);
        System.out.println("Sum: " + sum);
        byte dif = (byte) (num1 - num2);
        System.out.println("Dif: " + dif);
        byte product = (byte) (num1 * num2);
        System.out.println("Product: " + product);
        byte quotient = (byte) (num1 / num2);
        System.out.println("Quotient: " + quotient);
        byte remainder = (byte) (num1 % num2);
        System.out.println("Remainder: " + remainder);
    }
}
