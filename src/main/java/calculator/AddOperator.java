package calculator;

public class AddOperator implements Operator {

    @Override
    public Double Operate(int firstNumber, int secondNumber) {
        return (double)(firstNumber + secondNumber);
    }
}
