package calculator;


import exception.BadInputException;
import operation.*;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    AddOperation addOperation = new AddOperation();
    SubstractOperation substractOperation = new SubstractOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    DivideOperation divideOperation = new DivideOperation();
    ModOperator modOperator = new ModOperator();

    private List<Double> arithmetics = new ArrayList<>();

    public double calculate(int firstNumber, int secondNumber, char op) throws BadInputException {
        double result;
        switch (op) {
            case '+':
                result = addOperation.operate(firstNumber, secondNumber, op);
                break;
            case '-':
                result = substractOperation.operate(firstNumber, secondNumber, op);
                break;
            case '*':
                result = multiplyOperation.operate(firstNumber, secondNumber, op);
                break;
            case '/':
                result = divideOperation.operate(firstNumber, secondNumber, op);
                break;
            case '%':
                result = modOperator.operate(firstNumber, secondNumber, op);
                break;
            default:
                throw new BadInputException("사칙연산의 연산자");
        }
        arithmetics.add(result);
        return result;
    }

    @Override
    public void removeResult() {
        arithmetics.remove(0);
    }

    @Override
    public void inquiryResults() {
        for (Double in : arithmetics) {
            System.out.println(in);
        }
    }
}
