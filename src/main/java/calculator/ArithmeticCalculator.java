package calculator;


public class ArithmeticCalculator extends Calculator {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator modOperator;

    public <T> Double Calculate(T firstGeneric, T secondGeneric, OperatorType type) throws CalculateException {
        Double result = 0.0;

        if(!(firstGeneric instanceof String) || !(secondGeneric instanceof String))
        {
            return 0.0;
        }

        double firstNumber = 0.0;
        double secondNumber = 0.0;

        try {
           firstNumber = Double.parseDouble((String) firstGeneric);
           secondNumber = Double.parseDouble((String) secondGeneric);
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
