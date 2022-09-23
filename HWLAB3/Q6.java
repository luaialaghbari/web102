import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number:");
        num1= in.nextDouble();
        System.out.println("Enter second number:");
        num2= in.nextDouble();
        System.out.println("Enter third number");
        num3= in.nextDouble();
if ((num1>num2)&&(num2>num3))
        {
            System.out.println("Decreasing");
        } else if ((num1<num2)&&(num2<num3)) {
    System.out.println("Increasing");

}
    }
}
