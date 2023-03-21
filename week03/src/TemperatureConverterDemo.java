import java.util.Scanner;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        double fahrenheit = 0.0;
        double celsius = 0.0;
        // 1) FahrenheitToCelsius
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("1) FahrenheitToCelsius  2) CelsiusToFahrenheit  3) Exit : ");
            int menu = scanner.nextInt();
            if (menu==1){
                System.out.print("Enter Fahrenheit temperature : ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
                System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
            }
            else if (menu==2){
                System.out.print("Enter Celsius temperature : ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
            }
            else if (menu==3){
                System.out.println("Program finished!");
                break;
            }
            else{
                System.out.print("Please input only 1, 2, 3");
            }
        }
        // 2) CelsiusToFahrenheit

        // 3) Exit

    }
}
