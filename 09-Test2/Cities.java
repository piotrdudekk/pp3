import java.util.ArrayList;

public class Cities {
    private String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public String cities() {
        String s = "";
        for (String c : cities) {
            s = s + c;
        }
        return s;
    }

    public Cities filter(char letter) {
        ArrayList<String> filtered = new ArrayList<String>();
        for (String c : cities) {
            if (c.charAt(0) == Character.toUpperCase(letter)) {
                filtered.add(c);
            }
        }
        return new Cities(filtered.toArray(new String[0]));
    }

    public static void main(String[] args) {
        String[] cityNames = { "Warszawa", "Kielce", "Sopot", "Szczecin" };
        Cities c1 = new Cities(cityNames);
        System.out.println(c1.filter('s').cities());
    }

}
