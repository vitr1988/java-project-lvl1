package hexlet.code;

import java.util.Scanner;

public class Cli {

    static String askUserNameAndSayHello() {
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
        return userName;
    }

}
