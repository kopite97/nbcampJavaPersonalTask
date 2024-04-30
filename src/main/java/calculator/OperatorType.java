package calculator;

public enum OperatorType {
    Add, Subtract, Multiply, Divide,Mod;

    public static OperatorType getOperatorTypeFromInt(int intValue) {
        return OperatorType.values()[intValue];
    }
}