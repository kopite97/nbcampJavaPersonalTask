package calculator;

public class DivideOperator implements Operator {
    @Override
    public Double Operate(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }
}
