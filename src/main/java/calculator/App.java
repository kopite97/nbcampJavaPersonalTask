package calculator;
import java.util.LinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkExit = "";
        LinkedList<Double> results = new LinkedList<>();

        do{
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

            switch (operator)
            {
                case "+":
                    result = (double)firstNumber + secondNumber;
                    break;
                case "-":
                    result = (double)firstNumber - secondNumber;
                    break;
                case "*":
                    result = (double)firstNumber * secondNumber;
                    break;
                case "/":
                    if(secondNumber == 0)
                    {
                        System.out.println("Invalid Number");
                        continue;
                    }
                    result = (double)firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }

            System.out.println("Result: " + result);
            results.add(result);

            System.out.println("Do you want to Exit?? (Input \"exit\")");
            checkExit = sc.next();
            if(checkExit.equals("exit"))
                break;

        }while(true);


    }

    public void Operate()
    {

    }

}