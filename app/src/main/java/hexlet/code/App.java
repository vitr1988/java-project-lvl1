package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter. \n" +
                        "1 - Greet \n" +
                        "2 - Even \n" +
                        "0 - Exit \n" +
                        "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> Cli.askUserNameAndSayHello();
            case 2 -> EvenGame.start(Cli.askUserNameAndSayHello());
            case 0 -> System.exit(0);
            default -> System.out.println("Incorrect choice. Please try again!");
        }
    }
}
