// Temperature.java
public class Temperature {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    /**
     * Converts the stored Celsius value to Fahrenheit.
     * Formula: F = C * 9/5 + 32
     */
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        // Create an instance of Temperature
        Temperature myTemp = new Temperature();

        // Test Case 1: 0 Celsius (Freezing point)
        myTemp.setCelsius(0.0);
        System.out.println("Testing 0°C:");
        System.out.println("Celsius: " + myTemp.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + myTemp.getFahrenheit() + "°F");
        System.out.println("-------------------------");

        // Test Case 2: 100 Celsius (Boiling point)
        myTemp.setCelsius(100.0);
        System.out.println("Testing 100°C:");
        System.out.println("Celsius: " + myTemp.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + myTemp.getFahrenheit() + "°F");
        System.out.println("-------------------------");

        // Test Case 3: 25 Celsius (Room temperature)
        myTemp.setCelsius(25.0);
        System.out.println("Testing 25°C:");
        System.out.println("Celsius: " + myTemp.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + myTemp.getFahrenheit() + "°F");
    }
}
