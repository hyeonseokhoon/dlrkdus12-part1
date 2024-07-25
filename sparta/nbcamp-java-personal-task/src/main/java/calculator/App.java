package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int result = 0;
        int count = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operation = sc.nextLine();
            char op = operation.charAt(0);

            switch (op) {
                case '+':
                    result = firstNumber + secondNumber;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                        System.out.println("결과: " + result);
                        break;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    }
                default:
                    System.out.println("잘못된 연산 기호를 입력하셨습니다.");
            }
            arr.add(result);
            count++;

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            if (Objects.equals(remove, "remove")) {
                arr.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (Objects.equals("inquiry", inquiry)) {
                for (Integer in : arr) {
                    System.out.println(in);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (Objects.equals(exit, "exit")) {
                break;
            }

        }
    }
}
