package calculator;

public class Calculator {
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
        return result;
    }
}
