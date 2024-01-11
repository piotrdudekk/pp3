public class Temperature {
    
    static double celciusToKelvin(float celcius){
        return (celcius + 273.15);
    }

    static double celciusToFahrenheit(float celcius){
        return (celcius * 2 + 30);
    }

    static double kelvinToCelcius(float kelvin){
        return (kelvin - 273.15);
    }

    static double kelvinToFahrenheit(float kelvin){
        return ((kelvin - 273.15) * 1.8 + 32);
    }

    static double fahrenheitToCelcius(float fahrenheit){
        return ((fahrenheit-32)/2);
    }

    static double fahrenheitToKelvin(float fahrenheit){
        return ((fahrenheit-32)/1.8 + 273.15);
    }

    public static void main (String[] args){
        System.out.println("25 Celcius degrees are: " + celciusToKelvin(25) + " Kelvin degrees and " + 
                            celciusToFahrenheit(25) + " Fahrenheit degrees.");
                            
    }
}
