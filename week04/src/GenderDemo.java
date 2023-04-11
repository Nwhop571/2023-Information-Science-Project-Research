import java.util.Scanner;

public class GenderDemo {
    public static void main(String[] args) {

        String socialSecurityNumber = args[0];

        char gender = socialSecurityNumber.charAt(6);

        String genderString = switch (gender){
            case '1','3' -> "Mail";
            case '2','4' -> "Femail";
            default -> "Wrong ssn!";
        };
        System.out.println(genderString);
    }
}
