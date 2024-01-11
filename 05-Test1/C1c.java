public class C1c {
    private String name;
    private int age;

    public C1c(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age=age;
    }

    public boolean isAdult(){
        if (age >= 18) {return true;}
        else {return false;}
    }

    public String toString(){
        return (name + ", " + age);
    }
/* 
    public static void main (String[] args){
        C1c o = new C1c("Anna",21);
        System.out.println(o.getAge());
        System.out.println(o.isAdult());
        o.setAge(17);
        System.out.println(o.isAdult());
        System.out.println(o.toString());

    }
*/
}
