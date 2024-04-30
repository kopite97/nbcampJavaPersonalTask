package calculator;

public class DivideOperator implements Operator {
    @Override
    public Double Operate(int firstNumber, int secondNumber) {
        return (double)(firstNumber/secondNumber);
    }
}
