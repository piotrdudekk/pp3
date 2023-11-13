public class Clock {
    int hours;
    int minutes;

    String displayTime(){
        if (hours<10 && minutes<10){
            return ("Time: 0" + hours + ":0" + minutes);
        }
        else if (hours>=10 && minutes<10){
            return ("Time: " + hours + ":0" + minutes);
        }
        else if (hours<10 && minutes>=10){
            return ("Time: 0" + hours + ":" + minutes);
        }
        else return ("Time: " + hours + ":" + minutes);
    }

    int minutesFromMid(){
        return (hours*60 + minutes);
    }

    int secondsFromMid(){
        return (hours*60 + minutes)*60;
    }

    public static void main (String[] args){
        Clock time1 = new Clock();
        time1.hours = 14;
        time1.minutes = 27;
        System.out.println(time1.displayTime());
        System.out.println("Minutes from midnight: " + time1.minutesFromMid());
        System.out.println("Seconds from midnight: " + time1.secondsFromMid());
    }

}
