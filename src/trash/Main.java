package trash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals(Commands.EXIT)) {
            System.out.println("Привет.");
            input = scanner.nextLine();
        }
    }
}