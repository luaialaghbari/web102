public class Q7lab2 {
    public static void main(String[] args) {
        String x= "Yemen";
        System.out.println(x);

        int n =x.length();

        /*find first char*/
        char first= x.charAt(0);
        System.out.println(first);

        /*find the last char*/
        char last= x.charAt(n-1);
        System.out.println(last);

        /*Remove first char*/
        String remove_first = x.substring(1);
        System.out.println();

        /* Remove last char*/
        String remove_last = x.substring(0,4);
        System.out.println(remove_last);
    }
}
