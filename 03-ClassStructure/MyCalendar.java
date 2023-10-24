public class MyCalendar{
    static int year = 2023;
    static int month = 12;
    static int day = 31;

    static String myDate(){
        if (month<10 && day<10){
                return ("Date: " + year + "-0" + month + "-0" + day);
            }
        else if (month<10 && day>9){
                return ("Date: " + year + "-0" + month + "-" + day);
            }
        else if (day<10 && month>9){
                return ("Date: " + year + "-" + month + "-0" + day);
            }
        
         return ("Date: " + year + "-" + month + "-" + day);
        
         }

    static int days(){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int months = month - 1;
    }

    public static void main (String[] args){
        System.out.println(myDate());
    }

}