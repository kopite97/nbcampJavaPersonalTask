package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultArrayAmount = 3;
        int index =0;
        String checkExit = "";

        double[] results= new double[resultArrayAmount];

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
                        continue;
                    }
                    result = (double)firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }

            System.out.println("Result: " + result);
            if (index > resultArrayAmount - 1) {
                double[] temp = results;
                for (int i = 0; i < results.length - 1; i++) {
                    results[i] = temp[i + 1];
                }
                results[temp.length - 1] = result;

            }
            else {
                results[index] = result;
            }
            index++;

            System.out.print("results :");
            for (var d : results) {
                System.out.print(d+" ");
            }

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