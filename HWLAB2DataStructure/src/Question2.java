public class Question2 {
    public static int[] BackingUp(int[] y)
    {
        int[] Backinguparr = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            Backinguparr[i] = y[i];
        }
        return Backinguparr;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,10};
        int[] backUp = BackingUp(arr);

        System.out.println("array is backedup");
        for (int l : backUp) {
            System.out.println(l);
        }

    }

}
