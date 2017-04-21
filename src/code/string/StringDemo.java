package code.string;

/**
 * Created by bruno on 21-04-2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Sunday";
        String str2 = "Sunday";

        if (str1.equals(str2)){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Not Equal");
        }

        String name = "Bruno Silva";
        System.out.println("Name :" + name);
        System.out.println("Length: " + name.length());
        System.out.println("SubString: " +name.substring(0,5));
        System.out.println("SubString; " + name.substring(5, 11));

        StringBuffer name2 = new StringBuffer("My name is,");
        name2.append(" Bruno Silva");
        System.out.println(name2.toString());
    }
}
