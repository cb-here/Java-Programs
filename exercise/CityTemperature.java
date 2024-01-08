public class CityTemperature{
    public static void main(String[] args){
        float fahrenheit = 32.0f;
        System.out.println("City temperature is " + fahrenheit + "°F.");
        float celcius = (fahrenheit - 32) * 5/9;
        System.out.println("City temperature is " + celcius + "°C.");
    }
}