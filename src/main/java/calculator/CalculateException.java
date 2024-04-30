package calculator;

public class CalculateException extends Exception {

    public CalculateException(String oper) {
        super("CalculateException: " + oper);
    }

}
