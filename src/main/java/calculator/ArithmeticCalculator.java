package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator{

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public Double Calculate(int firstNumber, int secondNumber, String operator)throws CalculateException  {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = addOperator.operate(firstNumber,secondNumber);
                break;
            case "-":
                result = subtractOperator.operate(firstNumber,secondNumber);
                break;
            case "*":
                result = multiplyOperator.operate(firstNumber,secondNumber);
                break;
            case "/":
                result = divideOperator.operate(firstNumber,secondNumber);
                break;
            default:
                throw new CalculateException(operator);
        }
        results.add(result);
        return result;
    }

    public ArithmeticCalculator(){
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

}
