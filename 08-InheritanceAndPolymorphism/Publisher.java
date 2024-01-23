public class Publisher {
    private String name;
    private String city;

    public Publisher() {
        this.name = "Świat Książki";
        this.city = "Warszawa";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String displayPublisher() {
        return getName() + ", " + getCity();
    }

    public static void main(String[] args) {
        Publisher p = new Publisher();
        System.out.println(p.displayPublisher());
    }

}
