package operation;


import exception.BadInputException;

public class DivideOperation implements AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber, char op) throws BadInputException {
        if (secondNumber == 0) {
            throw new BadInputException();
        }
        return firstNumber / secondNumber;
    }
}
