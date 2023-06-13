package kr.ishs.iscience;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int denominator = scanner.nextInt();
        int numerator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
