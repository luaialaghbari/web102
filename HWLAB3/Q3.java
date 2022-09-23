import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an intger");
        x= in.nextInt();

        if (x>0)
        {
            System.out.println("positive");
        }
        if (x==0)
        {
            System.out.println("Zero");
        }
        if (x<0)
        {
            System.out.println("Negative");
        }
    }
}
