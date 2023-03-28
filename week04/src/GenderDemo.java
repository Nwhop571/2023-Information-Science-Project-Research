import java.util.Scanner;

public class GenderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ssn number(13 digits) : ");
        String socialSecurityNumber = scanner.nextLine();

        char gender = socialSecurityNumber.charAt(6);

        String genderString = switch (gender){
            case '1','3' -> "Mail";
            case '2','4' -> "Femail";
            default -> "Wrong ssn!";
        };
        System.out.println(genderString);
    }
}
