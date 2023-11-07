public class Speed {
    int s;
/* 
    void isSpeedValid(){
        if (s>=40 && s<=140){
            System.out.println("Speed is valid: True");
        }
        else {
            System.out.println("Speed is valid: False");
        }
    }

public static void main (String[] args){
    Speed sp1 = new Speed();
    sp1.s = 120;
    System.out.println("Vehicle speed: " + sp1.s);
    sp1.isSpeedValid();
}

*/
    boolean isSpeedValid(){
        return (s>=40 && s<= 140);
    }
    
    public static void main (String[] args){
    Speed sp1 = new Speed();
    sp1.s = 120;
    System.out.println("Vehicle speed: " + sp1.s);
    System.out.println("Speed is valid: " + sp1.isSpeedValid());
    }

}
