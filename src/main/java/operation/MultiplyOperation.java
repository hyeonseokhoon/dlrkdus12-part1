package operation;


public class MultiplyOperation implements AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber, char op) {
        return firstNumber * secondNumber;
    }
}
