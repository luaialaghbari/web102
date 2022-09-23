import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        x= in.nextInt();
        z= in.nextInt();
        y= in.nextInt();

        if(x==z){
            if (z==y) {
                if (x==z){
                    System.out.println("All the same");
                }
            }
        }
        else {
            System.out.println("All diffrenet");
        }
    }
}
