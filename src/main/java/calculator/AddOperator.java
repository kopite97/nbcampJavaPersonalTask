package calculator;

public class AddOperator implements Operator {

    @Override
    public Double Operate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
