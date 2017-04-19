package code.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 19-04-2017.
 */
public class PrimeNumberPrinter {
    public static void main(String[] args) {
        System.out.println("\nThis program prints prime numbers\n");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter a number: ");
            input = br.readLine();
            int maxPrimeCount = Integer.parseInt(input);
            System.out.println("Prime numbers: " );
            for (int count = 2, primeCount = 0; primeCount < maxPrimeCount;count++){
                if (checkPrime(count)){
                    System.out.println(count);
                    primeCount++;
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    private static boolean checkPrime (int number){
        boolean isPrime = true;
        if (number == 2){
            isPrime = true;
        }else if (number % 2 == 0){
            isPrime = false;
        }else{
            int maxCount = (int)Math.ceil(Math.sqrt(number));
            for (int count = 3; count <= maxCount; count = count +2) {
                if (number % count == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
