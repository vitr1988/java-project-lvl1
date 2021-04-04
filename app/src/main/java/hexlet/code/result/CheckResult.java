package hexlet.code.result;

import java.util.Objects;

public class CheckResult {

    private String userAnswer;
    private String rightAnswer;

    public CheckResult(String userAnswer, String rightAnswer) {
        this.userAnswer = userAnswer;
        this.rightAnswer = rightAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public boolean isCorrect() {
        return Objects.equals(userAnswer, rightAnswer);
    }
}
