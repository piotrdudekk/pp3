
public class Arrays {
    
    public static boolean arr(int[] arr1, int[] arr2){
        int c1 = 0;
        int c2 = 0;

        for (int i=0; i<arr1.length; i++){
            if (arr1[i] > 9){
                c1++;
            }
        }

        for (int i=0; i<arr2.length; i++){
            if (arr2[i] > 9){
                c2++;
            }
        }

        if (c1 == c2){
            return true;
        }
        else {return false;}
    }
}
