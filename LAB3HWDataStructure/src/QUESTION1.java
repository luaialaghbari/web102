public class QUESTION1 {
    public class CloneArray {
        public static void main(String[] args) {
            int[] arr1 = {20, 30, 40, 50, 60,70};

            int[] arr2= arr1.clone();

            System.out.println("items of the  original array ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }

            System.out.println(" items of the cloned array: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }

}
