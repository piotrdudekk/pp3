import java.util.ArrayList;
//import java.util.List;

public class Cities {
    private String[] cityNames;

    public Cities(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public Cities filter(char startingChar) {
        ArrayList<String> filteredCities = new ArrayList<String>();

        for (String city : cityNames) {
            if (city.charAt(0) == Character.toUpperCase(startingChar)) {
                filteredCities.add(city);
            }
        }

        return new Cities(filteredCities.toArray(new String[0]));
    }

    public String cities() {
        String s = "";
        for (String city : cityNames) {
            s = s + city;
        }
        return s;
    }

    public static void main(String[] args) {
        String[] arr = { "Warszawa", "Sopot", "Kielce", "Szczecin" };
        System.out.println(new Cities(arr).filter('S').cities());
    }
}
