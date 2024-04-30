package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator{

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator modOperator;

    public Double Calculate(int firstNumber, int secondNumber, String operator)throws CalculateException  {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = addOperator.Operate(firstNumber,secondNumber);
                break;
            case "-":
                result = subtractOperator.Operate(firstNumber,secondNumber);
                break;
            case "*":
                result = multiplyOperator.Operate(firstNumber,secondNumber);
                break;
            case "/":
                result = divideOperator.Operate(firstNumber,secondNumber);
                break;
            case "%":
                result = modOperator.Operate(firstNumber,secondNumber);
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
        modOperator = new ModOperator();
    }

}
