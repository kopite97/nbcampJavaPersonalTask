package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator{


    public Double Calculate(int firstNumber, int secondNumber, String operator)throws CalculateException  {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = (double) (firstNumber + secondNumber);
                break;
            case "-":
                result = (double) (firstNumber - secondNumber);
                break;
            case "*":
                result = (double) (firstNumber * secondNumber);
                break;
            case "/":
                result = (double) (firstNumber / secondNumber);
                break;
            default:
                throw new CalculateException(operator);
        }
        results.add(result);
        return result;
    }

}
