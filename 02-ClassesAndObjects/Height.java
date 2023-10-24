public class Height {
    int cm;
    //int ft;
   // int in;

   // ft = cm * 0.0328;
   // in = (cm%30.48) *  0.03937; 

    void displayHeight(){
        System.out.println("I am"+ cm +"cm tall, i.e." + (cm * 0.0328) + "feet and" + ((cm%30.48) *  0.03937) + "inches");
    }

     public static void main(String[] args) {
        
        // object creation
        Height s1 = new Height();
        
        // object manipulation
        s1.cm = 170;
        s1.displayHeight();
    }

}