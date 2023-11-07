public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String postalcode;
    private String city;
    private String number;
    private int year;
    private String category;

    /* 
    public DrivingLicence(String name, String surname, String adress){
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }
    */

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
    }

    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getPostalCode(){
        return postalcode;
    }
    public void setPostalCode(String postalcode){
        this.postalcode = postalcode;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year>=1980 && year<=2023){
            this.year = year;
        }
        else {
            System.out.println("Invalid year of issue!");
        }
    }

     public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

        

    public String display(){
        return ("Name: " + name + ", Surname: " + surname + ", Adress: " + adress + ", Postal code: " + postalcode + 
                ", City: " + city + ", Licence number: " + number + ", Year of issue: " + year + ", Category: " + category);    }

    public String toString(){
        return ("Name: " + getName() + ", Surname: " + getSurname() + ", Adress: " + getAdress() + ", Postal code: " + getPostalCode() + 
                ", City: " + getCity() + ", Licence number: " + getNumber() + ", Year of issue: " + getYear() + ", Category: " + getCategory());    }

    

public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("jack");
        dl.setSurname("spaRRow");
        dl.setAdress("Ptr Lane 1");
        dl.setPostalCode("33456");
        dl.setCity("New York");
        dl.setNumber("22/3456");
        dl.setYear(2024);
        dl.setCategory("B");
        System.out.println(dl.display());
        System.out.println(dl.toString());
        }
    } 

}
