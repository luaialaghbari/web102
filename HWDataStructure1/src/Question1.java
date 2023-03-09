import java.util.Scanner;

public class Question1 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] y = new int[8];
            System.out.println("Enter 8 items");
            for (int i = 0; i < y.length; i++) {
                y[i]=in.nextInt();
            }
            for (int l : y) {
                System.out.println(l);
            }
        }
    }

