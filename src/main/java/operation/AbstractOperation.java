package operation;

import exception.BadInputException;

public interface AbstractOperation {
    double operate(int firstNumber, int secondNumber, char op) throws BadInputException;
}
