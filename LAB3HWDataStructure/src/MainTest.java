import java.util.Arrays;

public class MainTest {

    public static void main(String[] args)
    {
        int arr1[] = { 20, 30, 40 };
        int arr2[] = { 20, 30 };

        if (Arrays.equals(arr1, arr2))
            System.out.println("the two Arrays are equal");
        else
            System.out.println("the two arrays are not equal");
    }
}
