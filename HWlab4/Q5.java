/**
 * 5. The StringBuilder class has a method for reversing a string. In a ReverseTester class,
 * construct a StringBuilder from a given string (such as "desserts"),
 * call the reverse method followed by the toString method,
 * and print the result. Also print the expected value
 */
public class ReverseTester {
    public static void main (String[] args)
    {
        StringBuilder string = new StringBuilder("desserts");

        string.reverse();

        System.out.println("Expected: stressed");
        System.out.println(string);
    }
}
