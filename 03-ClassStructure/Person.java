public class Person {
    String name;
    float weight;
    float height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, float weight, float height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public float calculateBMI(){
        return (this.weight / (this.height * this.height)) * 10000;
    }

    public String displayBMI(){
        float bmi = this.calculateBMI();
        if (bmi<18.5){
            return (bmi + " - BMI too low.");
        }
        else if (bmi>24.9){
            return (bmi + " - BMI too high.");
        }
        else {
            return Float.toString(bmi);
        }
    }

    public String displayRecord(){
        return ("Name: " + this.name + "\n" + "Weight: " + this.weight + "\n" + "Height: " + this.height + "\n" + "BMI: " + this.displayBMI());
    }

    public static void main (String[] args){
        Person p1 = new Person("Piotr", 75, 172);
        Person p2 = new Person("Eryk", 138, 180);
        Person p3 = new Person("Jakub", 71, 202);
        System.out.println(p1.displayRecord() + "\n");
        System.out.println(p2.displayRecord() + "\n");
        System.out.println(p3.displayRecord());
    }

}
