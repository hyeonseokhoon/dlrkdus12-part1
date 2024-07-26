package operation;


public class AddOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber, char op) {
        return firstNumber + secondNumber;
    }
}
