package calculator;

public class SubtractOperator implements Operator  {

    @Override
    public Double Operate(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }
}
