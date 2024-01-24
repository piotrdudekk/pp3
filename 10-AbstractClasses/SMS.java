public class SMS extends Message {
    private User user;

    public SMS(String text, User user) {
        super(text);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void send() {
        System.out.println(getText() + ", " + user.getName() + ", " + user.getPhoneNumber());
    }

    public static void main(String[] args) {
        User u1 = new User("Piotr", "wegywe@gmail.com", "728143424");
        User u2 = new User("Amadeusz", "sidhqwidh@gmail.com", "667721802");
        SMS s1 = new SMS("Hej", u1);
        SMS s2 = new SMS("Co tam?", u2);
        s1.send();
        s2.send();
    }
}
