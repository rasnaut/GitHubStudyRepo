package inputOutput;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        scanner.close();
        System.out.println("myString is: " + myString);
    }
}
