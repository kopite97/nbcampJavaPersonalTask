package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private Queue<Double> results;

    public Queue<Double> getResults() {
        return results;
    }
    public void setResults(LinkedList<Double> results) {
        this.results = results;
    }

    public boolean RemoveResult()
    {
        return results.poll()!= null;
    }

    public void InquiryResults() {
        System.out.print("Results : ");
        for (var number : results) {
            System.out.print(number + " ");
        }
        System.out.println("\n-----");
    }

    public Double Calculate(int firstNumber, int secondNumber, String operator) throws CalculateException {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = (double)(firstNumber+secondNumber);
                break;
            case "-":
                result = (double)(firstNumber-secondNumber);
                break;
            case "*":
                result = (double)(firstNumber*secondNumber);
                break;
            case "/":
                result = (double)(firstNumber/secondNumber);
                break;
            default:
                throw new CalculateException(operator);
        }
        results.add(result);
        return result;
    }

    public Calculator() {
        results = new LinkedList<>();
    }
}
