package calculator;

public class ModOperator implements Operator{
    @Override
    public Double Operate(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
}
