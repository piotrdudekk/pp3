public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        String s;
        char s1;
        char s2;
        s1 = Character.toUpperCase(name.charAt(0));
        s2 = Character.toUpperCase(surname.charAt(0));
        s = Character.toString(s1) + Character.toString(s2);
        return s;
    }

    public static void main(String[] args) {
        Person p1 = new Person("anna", "may");
        System.out.println(p1.toString());
    }
}