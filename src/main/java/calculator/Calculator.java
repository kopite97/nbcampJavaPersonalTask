package calculator;

public class Calculator {
    public Double Calculate(int firstNumber, int secondNumber, String operator) throws CalculateException {
        Double result = 0.0;

        try {
            switch (operator) {
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                default:
                    throw new CalculateException(operator);
            }
        }
        catch (CalculateException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
