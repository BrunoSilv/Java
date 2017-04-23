package code.recursion;

/**
 * Created by bruno on 23-04-2017.
 */
public class HCFCalculator {
    public static void main(String[] args) {
        System.out.println("This program calculates(recursively) the Highest Common Factor using Euclid's algorithm\n");
        System.out.println("HCF of 12 and 4 is: " + hcf(12,4));
        System.out.println("HCF of 4 and 12 is: " + hcf(4,12));
        System.out.println("HCF of 7 and 15 is: " + hcf(7,15));
        System.out.println("HCF of 15 and 7 is: " + hcf(15,7));
    }

    /**
     * if num1> num2, then hcf of num1 and num2 is same as hcf of num2 and num1 % num2
     * @param num1
     * @param num2
     * @return
     */

    public static int hcf(int num1, int num2){
        if (num2 == 0){
            return num1;
        } else{
        return hcf(num2, num1 % num2);
        }
    }
}
