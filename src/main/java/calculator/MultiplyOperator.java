package calculator;

public class MultiplyOperator implements Operator {

    @Override
    public Double Operate(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }
}
