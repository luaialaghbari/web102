import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, s;
        System.out.println("Enter arrays sizes respectively:");
        l=in.nextInt();
        s=in.nextInt();
        int[] z = new int[l];
        int[] q = new int[s];
        boolean check = true;
        System.out.println("Enter arr1 item");
        for (int i = 0; i < z.length; i++) {
            z[i]=in.nextInt();
        }
        System.out.println("Enter arr2 item");
        for (int i = 0; i < q.length; i++) {
            q[i]=in.nextInt();
        }
        if (z.length == q.length)
        {
            for (int i = 0; i < z.length; i++) {
                if (z[i]!=q[i]) check = false;
            }
        }
        else check = false;
        if (check == true)
            System.out.println("The arrays are equal");
        else
            System.out.println("The arrays are not equal");
    }
}
