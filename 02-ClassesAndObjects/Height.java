public class Height {
    int cm;
    //int ft;
   // int in;

   // ft = cm * 0.0328;
   // in = (cm%30.48) *  0.03937; 

    void displayHeight(){
       double ft = cm*0.0328;
       double inc = (ft % (int)(ft))*12;

       if (ft%1==0){
        System.out.println("I am "+ cm +"cm tall, i.e. " + ft + " feet.");
       }
       else if ((ft % (int)(ft))>=0.5){
        System.out.println("I am "+ cm +"cm tall, i.e. " + (int)(ft) + " feet and " + ((int)(inc)+1) + " inches.");
       } 
       else {
        System.out.println("I am "+ cm +"cm tall, i.e. " + (int)(ft) + " feet and " + (int)(inc) + " inches.");
       } 
        
    }

     public static void main(String[] args) {
        
        // object creation
        Height s1 = new Height();
        
        // object manipulation
        s1.cm = 170;
        s1.displayHeight();
    }

}