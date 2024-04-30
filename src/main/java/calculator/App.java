package calculator;

import java.util.LinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkExit = "";
        LinkedList<Double> results = new LinkedList<>();

        Calculator calculator = new Calculator();

        do {
            System.out.print("Input first Number: ");
            int firstNumber = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("Input second Number: ");
            int secondNumber = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("Input Operator: ");
            String operator = sc.next();
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            Double result = 0.0;
            try {
                result = calculator.Calculate(firstNumber, secondNumber, operator);
            } catch (CalculateException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Result: " + result);
            results.add(result);

            System.out.println("Do you want to Exit?? (Input \"exit\" / \"inquiry\")");
            checkExit = sc.next();
            if (checkExit.equals("exit"))
                break;
            if (checkExit.equals("inquiry")) {
                System.out.print("Results : ");
                for (var number : results) {
                    System.out.print(number + " ");
                }
                System.out.println("\n-----");
            }

        } while (true);


    }

    public void Operate() {

    }

}