package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Input first Number: ");
        int firstNumber = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("Input second Number: ");
        int secondNumber = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        System.out.print("Input Operator: ");
        String operator = sc.next();
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

        double result =0;
        switch (operator)
        {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if(secondNumber == 0)
                {
                    System.out.println("Invalid Number");
                }
                result = (double)firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        System.out.println("Result: " + result);

    }
}