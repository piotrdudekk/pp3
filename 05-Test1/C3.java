public class C3 {
    
    public static boolean isAlphabet(String t){
        t=t.toLowerCase();
        for (int i=0; i<t.length()-1; i++){
            if (t.charAt(i)>t.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

   // public static String hideText(String t){
//
 //   }
}
