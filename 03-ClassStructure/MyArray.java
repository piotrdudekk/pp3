public class MyArray {
    
    static int even(int[] array){
        int c=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                c++; 
            }
        }
        return c;
    }

    static int positiveOdd(int[] array){
        int c=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==1 && array[i]>0){
                c++; 
            }
        }
        return c;
    }

    public static void main (String[] args){
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print(even(array1));
    }
}
