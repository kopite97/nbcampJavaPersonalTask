package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    Queue<Double> results;

    public  <T >Double Calculate(T firstNumber, T secondNumber,OperatorType type) throws CalculateException {return 0.0;};
    public  Double Calculate(double radius)  {return 0.0;};

    public Queue<Double> getResults() {
        return results;
    }

    public void setResults(Queue<Double> results) {
        this.results = results;
    }

    public boolean RemoveResult() {
        if(results.size()<=0){
            System.out.println("There is nothing to remove");
            return false;
        }

        results.remove();
        return true;
    }

    public void InquiryResults() {
        if(results.size()<=0){
            System.out.println("There is nothing to show");
            return;
        }

        System.out.print("\nResults : ");
        for (var index : results) {
            System.out.print(index+" ");
        }
        System.out.println("\n-------");
    }

    public Calculator() {
        results = new LinkedList<>();
    }
}
