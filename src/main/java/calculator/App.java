package calculator;
import java.util.EnumSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkExit = "";

        ArithmeticCalculator arithmeticCalc = new ArithmeticCalculator();
        CircleCalculator circleCalc = new CircleCalculator();

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

                System.out.print("Input Operator: \n1.+\n2.-\n3.*\n4./\n5.%\n");
                int operator = sc.nextInt();
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

                try {
                    result = arithmeticCalc.Calculate(firstNumber, secondNumber, OperatorType.getOperatorTypeFromInt(operator-1));
                } catch (CalculateException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.println("Result: " + result);
            } else if (checkOper.equals("c")) {
                // 원의 넓이 구하기 수행
                System.out.println("Input radius");
                double radius = sc.nextDouble();
                result = circleCalc.Calculate(radius);
                System.out.println("Area of circle : " + result);
            } else {
                System.out.println("Wrong input");
                continue;
            }

            System.out.println("Do you want to exit?? (Input \"exit\" / \"(inquiry/cinquiry)\" / \"(remove/cremove)\")");
            checkExit = sc.next();

            if (checkExit.equals("exit"))
                break;
            else if (checkExit.equals("inquiry")) {
                arithmeticCalc.InquiryResults();
            }
            else if (checkExit.equals("cinquiry")) {
               circleCalc.InquiryResults();
            }
            else if (checkExit.equals("remove")) {
                if (arithmeticCalc.RemoveResult()) {
                    System.out.println("Remove oldest result");
                }
            }
            else if(checkExit.equals("cremove")) {
                if (circleCalc.RemoveResult()) {
                    System.out.println("remove oldest result");
                }
            }

        } while (true);
    }
}