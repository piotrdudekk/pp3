//import java.util.ArrayList;

public class Family {
    private Person[] people;

    public Family(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int adult() {
        int c = 0;
        for (Person p : people) {
            if (p.getAge() >= 18) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam", 53);
        Person p2 = new Person("Marta", 50);
        Person p3 = new Person("Piotr", 17);
        Person[] people = { p1, p2, p3 };
        Family f1 = new Family(people);

        System.out.println(f1.adult());
    }
}
