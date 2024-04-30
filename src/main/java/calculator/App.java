package calculator;

import java.util.LinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkExit = "";

        Calculator calculator = new Calculator();

        do {
            System.out.println("elementary arithmetic / area of a circle");
            System.out.println("Input \"e\"/\"c\"");
            String checkOper = sc.nextLine();
            Double result = 0.0;

            if (checkOper.equals("e")) {
                // 사칙연산 수행

                System.out.print("Input first Number: ");
                int firstNumber = sc.nextInt();
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                System.out.print("Input second Number: ");
                int secondNumber = sc.nextInt();
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

                System.out.print("Input Operator: ");
                String operator = sc.next();
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

                try {
                    result = calculator.Calculate(firstNumber, secondNumber, operator);
                } catch (CalculateException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.println("Result: " + result);
            } else if (checkOper.equals("c")) {
                // 원의 넓이 구하기 수행
                System.out.println("Input radius");
                double radius = sc.nextDouble();
                result = calculator.CalculateCircle(radius);
                System.out.println("Area of circle : " + result);
            } else {
                System.out.println("Wrong input");
                continue;
            }


            System.out.println("Do you want to exit?? (Input \"exit\" / \"(inquiry/cinquiry)\" / \"remove\")");
            checkExit = sc.next();

            if (checkExit.equals("exit"))
                break;
            else if (checkExit.equals("inquiry")) {
                calculator.InquiryResults();
            }
            else if (checkExit.equals("cinquiry")) {
                calculator.InquiryCircleResults();
            }
            else if (checkExit.equals("remove")) {
                if (calculator.RemoveResult()) {
                    System.out.println("Remove oldest result");
                }
            }

        } while (true);
    }

    public void ElementaryArithmetic() {

    }
}