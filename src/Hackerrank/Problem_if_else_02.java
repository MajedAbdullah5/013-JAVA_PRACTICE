package Hackerrank;

import java.util.Scanner;

public class Problem_if_else_02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (input % 2 != 0) {
            System.out.println("Weird");
        } else if (input >= 2 && input <= 5) {
            System.out.println("Not Weird");
        } else if (input >= 6 && input <= 20) {
            System.out.println("Weird");
        } else if (input > 20) {
            System.out.println("Not Weird");
        } else{
            System.out.println("Invalid Number!");
        }
    }
}
