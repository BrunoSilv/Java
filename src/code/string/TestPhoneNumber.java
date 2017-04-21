package code.string;


/**
 * Created by bruno on 22-04-2017.
 */
public class TestPhoneNumber {
    public static void main( String[] args ) {
        String[] telephoneNumbers = new String[10];
        telephoneNumbers[0] = "777-777-7777";
        telephoneNumbers[1] = "(777)-777-7777";
        telephoneNumbers[2] = " 777 - 777 - 7777 ";
        telephoneNumbers[3] = "7 7 7  - 777  - 7 7 77";
        telephoneNumbers[4] = "  ( 7 7 7   ) - 777 - 7777 ";
        telephoneNumbers[5] = "777-777-7777-";
        telephoneNumbers[6] = "(77)-77-777";
        telephoneNumbers[7] = "  - (777) - 7777 ";
        telephoneNumbers[8] = "7 7 7  - (777)  - 7 7 77";
        telephoneNumbers[9] = "  ( 7 c 7   ) - 777 - abcd ";

        for( String number : telephoneNumbers ) {
            System.out.println( " Number: " + number + "  IsValidPhoneNumber:" + PhoneNumber.validatePhoneNumber( number ));
        }
    }
}
