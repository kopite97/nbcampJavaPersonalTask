package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator extends Calculator{

    public Double Calculate(double radius) {
        Double result = Math.PI * Math.pow(radius, 2);
        results.add(result);

        return result;
    }

}
