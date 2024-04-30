package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private Queue<Double> results;

    // circleResults를 다시 선언할 일도 없고 중복될 일도 없으니 static을 굳이 쓰지 않았습니다.
    // 또한 final을 써도 정상적으로 작동하겠지만 circleResults의 값을 실수로라도 바꿀 일이 일단은 없기 때문에 사용하지 않았습니다.
    private Queue<Double> circleResults;

    public Queue<Double> getCircleResults() {
        return circleResults;
    }

    public void setCircleResults(Queue<Double> circleResults) {
        this.circleResults = circleResults;
    }

    public Queue<Double> getResults() {
        return results;
    }

    public void setResults(LinkedList<Double> results) {
        this.results = results;
    }

    public boolean RemoveResult() {
        return results.poll() != null;
    }

    public void InquiryResults() {
        if (results.size() <= 0) {
            System.out.println("No results found");
        }

        System.out.print("Results : ");
        for (var number : results) {
            System.out.print(number + " ");
        }
        System.out.println("\n-----");
    }

    public void InquiryCircleResults() {
        if (circleResults.size() <= 0) {
            System.out.println("No circle results found");
        }
        System.out.print("Circle Results : ");
        for (var number : circleResults) {
            System.out.print(number + " ");
        }
        System.out.println("\n-----");
    }

    public Double Calculate(int firstNumber, int secondNumber, String operator) throws CalculateException {
        Double result = 0.0;

        switch (operator) {
            case "+":
                result = (double) (firstNumber + secondNumber);
                break;
            case "-":
                result = (double) (firstNumber - secondNumber);
                break;
            case "*":
                result = (double) (firstNumber * secondNumber);
                break;
            case "/":
                result = (double) (firstNumber / secondNumber);
                break;
            default:
                throw new CalculateException(operator);
        }
        results.add(result);
        return result;
    }

    public Double CalculateCircle(double radius) {
        Double result = Math.PI * Math.pow(radius, 2);

        circleResults.add(result);

        return result;
    }

    public Calculator() {
        results = new LinkedList<>();
        circleResults = new LinkedList<>();
    }
}
