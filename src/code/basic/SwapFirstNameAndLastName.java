package code.basic;

/**
 * Created by bruno on 17-04-2017.
 * Swap Last Name with First name
 */
public class SwapFirstNameAndLastName {
    public static void main(String[] args) {
        String name = "Will Smith";
        System.out.println("Name before swap: " + name);
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));
        String swappedName = lastName + " " + firstName;
        System.out.println("Name after swap: " + swappedName);
    }
}
