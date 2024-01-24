public class C2 {
    static boolean m(int[] numbers){
        int d = 0;
        int u = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > 0){
                d = d + numbers[i];
            }
            if (numbers[i] < 0){
                u = u + numbers[i];
            }
        }
        u = u * (-1);
        if (d>u){
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args){
        int[] n1 = {9, 3, 4, -2, -8};
        int[] n2 = {9, 0, 2, -7, 4, -9, 1, -5};
        System.out.println(m(n1));
        System.out.println(m(n2));
    }
}
