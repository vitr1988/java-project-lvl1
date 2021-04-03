package hexlet.code;

import java.util.Scanner;

public class Cli {

    static void askUserNameAndSayHello() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(String.format("Hello, %s!", userName));
    }
}
