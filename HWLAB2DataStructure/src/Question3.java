import java.util.Random;

public class Question3 {
    public static int RemoveRandom(int[] y)
    {
        Random l= new Random();
        int index = l.nextInt(y.length-1);

        if (y.length!=0)
        {
            int removedItem = y[index];
            for (int i = index; i < y.length-1; i++) {
                y[i]=y[i+1];
            }
            y[y.length-1]=0;
            return removedItem;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] P= {23,24,25,26,27,28,29};
        System.out.println("Remove Random items");
        for (int i = 0; i < P.length; i++) {
            System.out.println(RemoveRandom(P));
        }

}}
