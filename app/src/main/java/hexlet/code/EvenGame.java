package hexlet.code;

import hexlet.code.result.CheckResult;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    /**
     * Amount of right user answers
     */
    static final int MAX_ATTEMPTS = 3;

    /**
     * Maximum of generated digit (in range of 1 .. max)
     */
    static final int MAX_VALUE = 100;

    /**
     * User input for even digit
     */
    static final String YES = "yes";

    /**
     * User input for odd digit
     */
    static final String NO = "no";

    /**
     * Console
     */
    static Scanner IN = new Scanner(System.in);

    static void start(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAttempts = 0;
        while (correctAttempts < MAX_ATTEMPTS) {
            final CheckResult userInputResult = checkAndGetUserInput();
            if (userInputResult.isCorrect()) {
                System.out.println("Correct!");
                correctAttempts++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n Let's try again, %s!\n",
                        userInputResult.getUserAnswer(), userInputResult.getRightAnswer(), userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }

    static CheckResult checkAndGetUserInput() {
        int generatedNumber = new Random().nextInt(MAX_VALUE) + 1; // to avoid 0
        System.out.printf("Question: %d\nYour answer: ", generatedNumber);
        String userAnswer = IN.next().trim();
        return new CheckResult(userAnswer, generatedNumber % 2 == 0 ? YES : NO);
    }
}
