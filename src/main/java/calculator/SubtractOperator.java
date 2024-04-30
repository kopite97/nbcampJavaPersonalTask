package calculator;

public class SubtractOperator implements Operator  {

    @Override
    public Double Operate(int firstNumber, int secondNumber) {
        return (double)(firstNumber-secondNumber);
    }
}
