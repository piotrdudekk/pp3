import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> nums;

    public Numbers (int a, int b, int c, int d, int e){
        this.nums.add(a);
        this.nums.add(b);
        this.nums.add(c);
        this.nums.add(d);
        this.nums.add(e);
    }

    public ArrayList getNums(){
        return nums;
    }

    public boolean different(){
        int k = nums.get(0);
        for (int i=1; i<nums.size(); i++){
            if (k == nums.get(i)){
                return false;
            }
        }
        return true;
    }
}
