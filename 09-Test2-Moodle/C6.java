import java.util.ArrayList;

public class C6 {
    private ArrayList<Person> persons;

    public C6(ArrayList<Person> persons){
        this.persons = persons;
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public void m1(Person p){
        this.persons.add(p);
    }

    public int m2() {
        int adults = 0;
        for(Person person : persons) {
            if (person.getAge() >= 18) {
                adults++;
            }
        }
        return adults;
    }
}
