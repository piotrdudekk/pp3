public class Arrays {

    public static boolean arr(int[] arr1, int[] arr2) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 9 && arr1[i] < 100) {
                c1++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 9 && arr2[i] < 100) {
                c2++;
            }
        }
        if (c1 == c2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 15, 8, 2, 37, 49, 117 };
        int[] arr2 = { 9, 6, 7, 12, 48, 4, 6, 9, 5 };

        System.out.println(arr(arr1, arr2));
    }
}
