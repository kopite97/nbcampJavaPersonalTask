package calculator;


public class ArithmeticCalculator extends Calculator {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator modOperator;

    public Double Calculate(String firstGeneric, String secondGeneric, OperatorType type) throws CalculateException {
        Double result = 0.0;

        double firstNumber = 0.0;
        double secondNumber = 0.0;

        try {
           firstNumber = Double.parseDouble(firstGeneric);
           secondNumber = Double.parseDouble(secondGeneric);
        } catch (NumberFormatException e2) {
            System.out.println("\nWrong Type\n\n\n-----\n");
            return 0.0;
        }

        switch (type) {
            case Add:
                result = addOperator.Operate(firstNumber, secondNumber);
                break;
            case Subtract:
                result = subtractOperator.Operate(firstNumber, secondNumber);
                break;
            case Multiply:
                result = multiplyOperator.Operate(firstNumber, secondNumber);
                break;
            case Divide:
                result = divideOperator.Operate(firstNumber, secondNumber);
                break;
            case Mod:
                result = modOperator.Operate(firstNumber, secondNumber);
                break;
            default:
                throw new CalculateException("Unknown operator type");
        }
        results.add(result);
        return result;
    }

    public ArithmeticCalculator() {
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();
    }

}
