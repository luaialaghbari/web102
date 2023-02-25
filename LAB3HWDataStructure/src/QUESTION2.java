import java.util.Arrays;

public class QUESTION2 {

    public class ConcatenateArrays {

        public static void main(String[] args) {

            int[] arr1= {20, 30, 40};
            int[] arr2 = {50, 60, 70};

            int length = arr1.length + arr2.length;

            int[] result = new int[length];

            System.arraycopy(arr1, 0, result, 0, arr1.length);
            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

            System.out.println("concatenated arrays are: " + Arrays.toString(result));
        }}
}
