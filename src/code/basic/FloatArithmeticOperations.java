package code.basic;

/**
 * Created by bruno on 17-04-2017.
 */
public class FloatArithmeticOperations {
    public static void main(String[] args) {
        float num1 = 1231;
        float num2 = 51;
        System.out.println("\nFloat Arithmetic Operations\n");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        float sum = (num1 + num2);
        System.out.println("Sum: " + sum);
        float dif = (num1 - num2);
        System.out.println("Dif: " + dif);
        float product = (num1 * num2);
        System.out.println("Product: " + product);
        float quotient = (num1 / num2);
        System.out.println("Quotient: " + quotient);
        float remainder = (num1 % num2);
        System.out.println("Remainder: " + remainder);
    }
}
