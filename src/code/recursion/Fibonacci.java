package code.recursion;

/**
 * Created by bruno on 23-04-2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("This program calculates and prints fibonacci numbers recursively\n ");
        System.out.println("1st Fibonacci Number: " + fibonacci(1));
        System.out.println("2st Fibonacci Number: " + fibonacci(2));
        System.out.println("3st Fibonacci Number: " + fibonacci(3));
        System.out.println("4th Fibonacci Number: " + fibonacci(4));
        System.out.println("5th Fibonacci Number: " + fibonacci(5));
        System.out.println("10th Fibonacci Number: " + fibonacci(10));

    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n){
        if (n==1){
            return 1;
        }else if (n<1){
            return 0;
        }
        return fibonacci(n -1 ) + fibonacci(n - 2);
    }
}
