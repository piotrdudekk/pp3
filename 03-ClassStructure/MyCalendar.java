public class MyCalendar{
    static int year = 2023;
    static int month = 4;
    static int day = 9;

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

    static String days(){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthtable = month - 1;
        int c = 0;
        for(int i=0; i<monthtable; i+=1){
            c+=daysInMonth[i];
        }
        return ("Days from the beginning of year: " + (c+day));
    }

    static String monthName(){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novemver", "December"};
        return ("Month name: " + months[month-1]);
    }

    public static void main (String[] args){
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }

}