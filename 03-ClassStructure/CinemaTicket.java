public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTittle;
    int row;
    int seat;
    double price;

    public String toString(){
        return ("Cinema Name: " + cinemaName +  "\n" + "Film tittle: " + filmTittle + "\n" + "Row: " + row + "\n" + "Seat: " + seat + "\n" + "Price: " + price);
    }

    public CinemaTicket(String filmTittle, int row, int seat){
        if (row<=2){
            this.price = 10;
        }
        else{
            this.price = 25;
        }
        this.filmTittle = filmTittle;
        this.row = row;
        this.seat = seat;
    }


    public static void main (String[] args){
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2, 10);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 11);
        System.out.println(ticket1.toString());
        System.out.println("\n");
        System.out.println(ticket2.toString());
    }
}
