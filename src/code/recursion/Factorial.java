package code.recursion;

/**
 * Created by bruno on 23-04-2017.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(" Factorial of 5: " + factorial(5));
        System.out.println(" Factorial of 5: " + factorial(6));
        System.out.println(" Factorial of 5: " + factorial(7));
        System.out.println(" Factorial of 5: " + factorial(8));
        System.out.println(" Factorial of 5: " + factorial(9));
        System.out.println(" Factorial of 5: " + factorial(10));
    }

    public static int factorial(int num){
        if (num <= 1){
            return 1;
        }
        return num*factorial(num -1);
    }
}
