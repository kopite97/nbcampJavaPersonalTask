package calculator;

public class ModOperator implements Operator{
    @Override
    public Double Operate(int firstNumber, int secondNumber) {
        return (double)(firstNumber % secondNumber);
    }
}
