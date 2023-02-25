public class Question1 {
    public static int[] REVERSE(int[] L)
    {
        L = new int[L.length];
        int count = 0;
        for (int i = L.length-1; i >= 0; i--) {
            L[i] = L[count];
            count++;
        }
        for (int i = 0; i < L.length; i++) {
            int[] R = new int[0];
            L[i] = R[i];
        }
        return L;
    }
    public static void main(String[] args) {
        int[] L = {7,8,9,10};

        System.out.println("array items");
        for (int Q : L) {
            System.out.println(Q);
        }
        REVERSE(L);
        System.out.println("array is reversed");
        for (int P: L) {
            System.out.println(P);
        }
    }
}
