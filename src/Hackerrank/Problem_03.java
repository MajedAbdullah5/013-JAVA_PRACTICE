package Hackerrank;

import java.util.Scanner;

public class Problem_03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int integerValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);
    }
}
