public class Question3 {
    public static void main(String[] args) {
        int[] l= {7 , 8 , 9,10 };
        int[] y = {1 , 2};
        int[] s = new int[7];
        System.arraycopy(l, 0, s, 0, l.length);
        System.arraycopy(y, 0,s,3,y.length);
        for (int i : s) {
            System.out.println(i);
        }
    }
}
