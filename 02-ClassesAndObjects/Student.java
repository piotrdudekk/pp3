public class Student {
    String name;
    int age;

    void sayHello(){
        System.out.println("Hello from "+name);
}

    void displayName(){
            System.out.println("The name is "+name);
    }

    void displayAge(){
            System.out.println("The age is "+age);
    }

    public static void main(String[] args) {
        
        // object creation
        Student s1 = new Student();
        
        // object manipulation
        s1.name = "Peter";
        s1.age = 21;
        s1.displayName();
        s1.displayAge();
        s1.sayHello();
    }
}
