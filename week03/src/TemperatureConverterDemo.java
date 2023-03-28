import java.util.Scanner;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        double fahrenheit = 0.0;
        double celsius = 0.0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("1) FahrenheitToCelsius  2) CelsiusToFahrenheit  3) Exit : ");
            String menu = scanner.nextLine();
//            if (menu.equals("1")){ // 1) FahrenheitToCelsius
//                System.out.print("Enter Fahrenheit temperature : ");
//                fahrenheit = scanner.nextDouble();
//                celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
//                System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
//            }
//            else if (menu.equals("2")){ // 2) CelsiusToFahrenheit
//                System.out.print("Enter Celsius temperature : ");
//                celsius = scanner.nextDouble();
//                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
//                System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
//            }
//            else if (menu.equals("3")){ // 3) Exit
//                System.out.println("Program finished!");
//                break;
//            }
//            else{
//                System.out.print("Please input only 1, 2, 3");
//            }
            if (menu.equals("3")){
                System.out.println("Program finished!");
                break;
            }
            switch (menu){
                case "1":
                    System.out.print("Enter Fahrenheit temperature : ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
                    System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
                case "2":
                    System.out.print("Enter Celsius temperature : ");
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                    System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
                case "3":
                    break;
            }
        }
    }
}
