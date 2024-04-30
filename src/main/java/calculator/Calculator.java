package calculator;

import java.util.LinkedList;

public class Calculator {

    public LinkedList<Double> results = new LinkedList<>();

    public Double Calculate(int firstNumber, int secondNumber, String operator) throws CalculateException {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = (double)(firstNumber+secondNumber);
                break;
            case "-":
                result = (double)(firstNumber-secondNumber);
                break;
            case "*":
                result = (double)(firstNumber*secondNumber);
                break;
            case "/":
                result = (double)(firstNumber/secondNumber);
                break;
            default:
                throw new CalculateException(operator);
        }
        results.add(result);
        return result;
    }
}
