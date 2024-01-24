public class Email extends Message {
    private String subject;
    private User user;

    public Email(String text, String subject, User user) {
        super(text);
        this.subject = subject;
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void send() {
        System.out.println(getText() + ", " + subject + ", " + user.getEmail() + ", " + user.getName());
    }

    public static void main(String[] args) {
        User u1 = new User("Piotr", "wegywe@gmail.com", "728143424");
        User u2 = new User("Amadeusz", "sidhqwidh@gmail.com", "667721802");
        Email e1 = new Email("Hej", "przywitanie", u1);
        Email e2 = new Email("Co tam?", "pytanie", u2);
        e1.send();
        e2.send();
    }

}
