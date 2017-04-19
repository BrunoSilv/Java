package code.basic;

/**
 * Created by bruno on 17-04-2017.
 */
public class ImprovedAddTwoNumbers {
    public static void main(String[] args){
        System.out.println("\nThis program accepts two numbers from command line");
        System.out.println("Number1: " + args[0]);
        System.out.println("Number2: " + args[1]);
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int sum = number1+number2;
        System.out.println("\nSum: " + sum );
    }
}
