import calculator.ArithmeticCalculator;
import calculator.CircleCalculator;
import exception.BadInputException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        ArithmeticCalculator arithmeticCal = new ArithmeticCalculator();
        CircleCalculator circleCal = new CircleCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.사칙연산 2.원의 넓이 (숫자를 입력하세요)");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int firstNumber = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int secondNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char op = sc.nextLine().charAt(0);
                    double result = arithmeticCal.calculate(firstNumber, secondNumber, op);
                    System.out.println(result);

                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    String ariRemove = sc.nextLine();
                    if (Objects.equals("remove", ariRemove)) {
                        arithmeticCal.removeResult();
                    }

                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    String ariInquiry = sc.nextLine();
                    if (Objects.equals("inquiry", ariInquiry)) {
                        arithmeticCal.inquiryResults();
                    }
                    break;

                case 2:
                    System.out.print("반지름을 입력하세요: ");
                    int radius = sc.nextInt();
                    sc.nextLine();
                    circleCal.areaCircle(radius);

                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    String circleRemove = sc.nextLine();
                    if (Objects.equals("remove", circleRemove)) {
                        circleCal.removeResult();
                    }

                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    String circleInquiry = sc.nextLine();
                    if (Objects.equals("inquiry", circleInquiry)) {
                        circleCal.inquiryResults();
                    }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (Objects.equals("exit", exit)) {
                break;
            }
        }
    }
}
