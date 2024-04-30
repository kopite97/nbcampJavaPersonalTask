package calculator;

public class CalculateException extends Exception {

    public CalculateException(String operator) {
        super("CalculateException: Wrong Operation ( " + operator + " )");
    }

}
