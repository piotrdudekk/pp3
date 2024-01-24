public class C1 {
    
    static int m1(int[] array1, int[] array2){
        int c=0;
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array2[j] == array1[i]){
                    c++;
                }
            }
        }
        return (array1.length-c);
    }

    static int m2(int[] array){
        int m = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > m){
                m = array[i];
            }
        }

        int m2 = array[0];
        for (int j=1; j<array.length; j++){
            if (array[j] > m2 && array[j] != m){
                m2 = array[j];
            }
        }
        return m2;
    }



    public static void main(String[] args){
        int[] arr1 = {22, 33, 44, 55};
        int[] arr2 = {44, 55, 66, 77, 88, 99};
        System.out.println(m1(arr1, arr2));
        System.out.println(m2(arr2));
    }
}
