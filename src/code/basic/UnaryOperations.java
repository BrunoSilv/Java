package code.basic;

/**
 * Created by bruno on 17-04-2017.
 * UnaryOperations only need one operator
 */
public class UnaryOperations {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;
        System.out.println("\nNumber 1: " + num1 + " Number 2: " + num2);
        num1++;
        System.out.println("After execution num1++. Number 1: " + num1 + " Number 2: " + num2 );
        num1--;
        System.out.println("After execution num1--. Number 1: " + num1 + " Number 2: " + num2 );
        --num1;
        System.out.println("After execution --num1. Number 1: " + num1 + " Number 2: " + num2 );
        ++num1;
        System.out.println("After execution ++num1. Number 1: " + num1 + " Number 2: " + num2 );

        num2 = num1++; //Pre increment assignment num2 = num1; num1 = num1 + 1;
        System.out.println("After execution num2 = num1++. Number 1: " + num1 + " Number 2: " + num2 );

        num2 = ++num1; //Post increment assignment num1 = num1 + 1; num2 = num1;
        System.out.println("After execution num2 = ++num1. Number 1: " + num1 + " Number 2: " + num2 );
    }
}
