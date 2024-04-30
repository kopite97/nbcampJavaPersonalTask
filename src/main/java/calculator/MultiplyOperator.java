package calculator;

public class MultiplyOperator implements Operator {

    @Override
    public Double Operate(int firstNumber, int secondNumber) {
        return (double)(firstNumber*secondNumber);
    }
}
